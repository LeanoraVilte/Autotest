import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.files.DownloadActions.click;
import static org.openqa.selenium.By.linkText;

public class Pomnyu {

    @BeforeAll
    static void setUp() {
        Configuration.holdBrowserOpen = true;
        Configuration.baseUrl = "https://demo.pomnyu.ru/";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void OpenPage()
    {
        open("https://demo.pomnyu.ru/");
        $("[class = c_title]").shouldHave(Condition.text("Сохраните память о близких"));
    }

    @Test
    void Words()//проверяем наличие всех категорий слов о соболезновании
    {
        open("https://demo.pomnyu.ru/");
        $(linkText("Слова соболезнования")).click();
        $(byText("Жены")).exists();
        $(byText("Сослуживца")).exists();
        $(byText("Брата")).exists();
        $(byText("Дяди")).exists();
        $(byText("Учителя")).exists();
        $(byText("Мужа")).exists();
        $(byText("Родных")).exists();
        $(byText("Внучки")).exists();
        $(byText("Дедушки")).exists();
        $(byText("Бабушки")).exists();
        $(byText("Сестры")).exists();
        $(byText("Внука")).exists();
        $(byText("Брата")).exists();
        $(byText("Подруги")).exists();
        $(byText("Сына")).exists();
        $(byText("Дочери")).exists();
        $(byText("Детей")).exists();
        $(byText("Коллеги")).exists();
        $(byText("Друга")).exists();
        $(byText("Мамы")).exists();
        $(byText("Папы")).exists();

    }

   @Test
   void CreatePage()
    {
      String login = "admin@ya.ru";
      String password = "222333";

      open("https://demo.pomnyu.ru/");
      $(linkText("Войти")).click();
      $("[id = emailLogin]").setValue(login);
      $("[id = passwordLogin]").setValue(password);
      $("[id = sub_login]").click();
      $(byPartialLinkText("Кабинет")).click();
      $(byPartialLinkText("Добавить страницу")).click();//дальше пятисотит
    }

}
