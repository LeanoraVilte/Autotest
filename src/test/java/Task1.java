import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Task1 {

    @BeforeAll
    static void setUp() {
        Configuration.holdBrowserOpen = true;
        Configuration.baseUrl = "http://suninjuly.github.io/simple_form_find_task.html";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void byID() {
        open("http://suninjuly.github.io/simple_form_find_task.html");

        $("[name=first_name]").click();
        $("[name=first_name]").setValue("Ivan");
        $("[name=last_name]").click();
        $("[name=last_name]").setValue("Ivan");
        $("[name = firstname]").click();
        $("[name = firstname]").setValue("country");
        $("[id = country]").click();
        $("[id = country]").setValue("country");
        $("[id = submit_button]").click();

    }
}
