import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class DemoQA {
    @BeforeAll
    static void setUp() {
        Configuration.holdBrowserOpen = true;
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void  NewTest () {
        String firstName = "Kris";
        String lastName = "Vask";
        String email = "Leate@mail.ru";
        String tel = "9874563210";
        String subjectsInput = "Hindi";
        String gender = "Female";
        String hobby = "Sports";
        String currentAddress = "NewWorld";
        String state = "NCR";
        String city = "Delhi";
        String imgPath = "123.jpg";
        // String dataBirth


        open("/automation-practice-form");
        /// Selenide.zoom(0.65);
        //executeJavaScript("document.querySelector(\"footer\").hidden = 'true';document.querySelector(\"#fixedban\").hidden = 'true'");   -удаление футера

        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()"); //

        $("#firstName").setValue(firstName);
        $("#lastName").setValue(lastName);
        $("#userEmail").setValue(email);
        $("#userNumber").setValue(tel);
        $("#dateOfBirthInput").click();
        //$(".react-datepicker__month-select").click();
        $(".react-datepicker__month-select").selectOption("May");
        $(".react-datepicker__year-select").selectOption("1991");
        $(".react-datepicker__day--004:not(.react-datepicker__day--outside-month)").click();
        $("#subjectsInput").setValue(subjectsInput).pressEnter();
        $("#genterWrapper").$(byText(gender)).click();
        $("#hobbiesWrapper").$(byText(hobby)).click();
        $("#currentAddress").setValue(currentAddress);
        $("#react-select-3-input").setValue(state).pressEnter();
        $("#react-select-4-input").setValue(city).pressEnter();
        $("input#uploadPicture").uploadFile(new File("src/test/resources/123.jpg"));
        //$("input#uploadPicture").uploadFromClasspath("123.jpg");
        //$("#uploadPicture").uploadFromClasspath(imgPath); // альтернатива,
        //  задать переменную String imgPath = "img/Pushkin.jpg";
        $("#submit").click();

        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").$(byText("Student Name")).parent().shouldHave(text(firstName+" "+lastName));
        $(".table-responsive").shouldHave(
                text(firstName+" "+lastName),
                text (email),
                text (gender),
                text (tel),
                text ("04 May,1991"),
                text (subjectsInput),
                text (hobby),
                //.text ("123.jpg"),
                text (currentAddress),
                text (state+" "+city)
        );
        //   $("#closeLargeModal").click();

    }
}
