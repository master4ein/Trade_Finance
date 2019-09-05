import org.openqa.selenium.By;

import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class WowTest_3 {

    @Test
    public void userCanLoginByUsername() {
        open("http://google.com");
        $(By.name("q")).val("selenide").pressEnter();
        $("#ires .g").shouldHave(text("selenide.org"));
    }
}

