import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class Testauto {

    @Test
    void successfulSearchTest() {
        open("https://www.google.com/");
        $("[name=q]").setValue("selenide").pressEnter();
        $("[id=search]").shouldHave(text("https://selenide.org"));
    }


    @Test
    void pikabuopen() {
            open("https://pikabu.ru/new");
            sleep(100);
    }

    @Test
    void DemoQatest()
    {
        open("https://demoqa.com/automation-practice-form");
        $("[id = firstName]").setValue("Kristina");
        $("[id = lastName]").setValue("Vosk");
        $("[id = userEmail]").setValue("tina@mail.ru");


    }
}