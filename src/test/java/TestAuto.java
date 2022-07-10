import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.files.DownloadActions.click;

public class TestAuto {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }


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

        String hobby = "Reading";
        String city = "Belarus";
        String state = "Bel";

        open("/automation-practice-form");
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");
        $("[id = firstName]").setValue("Kristina");
        $("[id = lastName]").setValue("Vosk");
        $("[id = userEmail]").setValue("tina@mail.ru");
        $("[id = gender-radio-2]").doubleClick();
        $("[id = userNumber]").setValue("1234567890");
        $("[id = currentAddress]").setValue("New town, 44");
        $("[id = dateOfBirthInput]").clear();
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("May");
        $(".react-datepicker__year-select").selectOption("1988");
        $(".react-datepicker__day--018:not(.react-datepicker__day--outside-month)").click();
        $("#subjectsInput").setValue("Games").pressEnter();
        $("#hobbiesWrapper").setValue("Reading").click();
        $("#react-select-3-input").setValue(state).pressEnter();
        $("#react-select-4-input").setValue(city).pressEnter();
        // $("input#uploadPicture").uploadFile(new File("src/test/resources/123.jpg"));
        $("input#uploadPicture").uploadFromClasspath("123.jpg");
        //  $("#uploadPicture").uploadFromClasspath(imgPath);  альтернатива,
        //  задать переменную String imgPath = "img/Pushkin.jpg";
        $("#submit").click();
        //$("[id = hobbies-checkbox-2]").doubleClick();
        sleep(6000);

    }
}