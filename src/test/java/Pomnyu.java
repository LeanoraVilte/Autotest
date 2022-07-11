import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

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
    void Words()
    {
        open("https://demo.pomnyu.ru/");
        $(By.linkText("Слова соболезнования")).click();
        $().shouldHave (Condition.text("Сослуживца"));
        $().shouldHave (Condition.text("Сестры"));
        $().shouldHave (Condition.text("Мужа"));
        $().shouldHave (Condition.text("Отца"));
        $().shouldHave (Condition.text("Матери"));

    }

}
