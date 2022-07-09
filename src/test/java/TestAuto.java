import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TestAuto {

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
        $("[id = gender-radio-2]").doubleClick();
        $("[id = userNumber]").setValue("1234567890");
        $("[id = currentAddress]").setValue("New town, 44");
        //$("[id = dateOfBirthInput]").setValue("18 May 1988");
        //$("[id = hobbies-checkbox-2]").doubleClick();
        sleep(6000);

    }
}