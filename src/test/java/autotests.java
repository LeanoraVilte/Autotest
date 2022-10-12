import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class autotests {

    @BeforeAll
    static void setUp() {
        Configuration.baseUrl = "http://automationpractice.com/";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void openPage()
    {
        open("http://automationpractice.com/");
    }

    @Test
    void AddCartWoman()
    {
        open("http://automationpractice.com/");
        $("[title=Women]").click();
    }
}
