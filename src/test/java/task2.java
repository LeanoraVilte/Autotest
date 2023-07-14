import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class task2 {

    @BeforeAll
    static void setUp() {
        Configuration.holdBrowserOpen = true;
        Configuration.baseUrl = "http://suninjuly.github.io/simple_form_find_task.html";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void byText() {
        open("http://suninjuly.github.io/find_link_text");

        double l1 = Math.ceil(Math.pow(Math.PI, Math.E) * 10000);
        int l = (int) l1;

        $(By.linkText(String.valueOf(l))).click();

        $("[name=first_name]").click();
        $("[name=first_name]").setValue("Ivan");
        $("[name=last_name]").click();
        $("[name=last_name]").setValue("Ivan");
        $("[name = firstname]").click();
        $("[name = firstname]").setValue("country");
        $("[id = country]").click();
        $("[id = country]").setValue("country");
        $(By.cssSelector("[type = submit]")).click();

    }
}