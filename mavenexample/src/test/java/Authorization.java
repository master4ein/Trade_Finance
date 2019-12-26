import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import org.junit.Before;



public class Authorization {
    private WebDriver driver;

    private Map<String, Object> vars;
    JavascriptExecutor js;

    @Before
    public void setUp() {

        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setProfile(new ProfilesIni().getProfile("testQA"));
        FirefoxDriver driver = new FirefoxDriver(firefoxOptions);

        this.driver = new FirefoxDriver();

        this.driver = new FirefoxDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }

    @Test
    public void additionTest() throws MalformedURLException, InterruptedException {


        driver.get("http://5.188.162.248:8080/");
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        //driver.manage().window().setSize(new Dimension(1920, 1040));

        //driver.findElement(By.id("selectAddress")).click();
    }


}
