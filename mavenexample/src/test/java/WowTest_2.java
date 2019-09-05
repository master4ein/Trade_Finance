import org.openqa.selenium.By;

import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;





public class WowTest_2 {
    @Before
    public void setUp() {
        open("http://google.com");

        $(By.name("q")).val("selenide").pressEnter();
        $("#ires .g").shouldHave(text("selenide.org"));
    }
}
