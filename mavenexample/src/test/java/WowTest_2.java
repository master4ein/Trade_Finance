import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;





public class WowTest_2 {
    @Test
    public void setUp() {
        Selenide.open("http://google.com");

        Selenide.$(By.name("q")).val("selenide").pressEnter();
        Selenide.$("#ires .g").shouldHave(Condition.text("selenide.org"));
    }
}
