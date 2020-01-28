package TradeFinance;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.util.List;

import static org.openqa.selenium.By.*;

@SuppressWarnings({"unused", "UnusedAssignment"})
class Create_and_save {
    private WebDriver driver;


    @BeforeEach
    void setUp() throws Exception {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--user-data-dir=C:\\Users\\YD052CKF\\AppData\\Local\\Google\\Chrome\\User Data");
        options.addArguments("--profile-directory=Profile");

        options.addExtensions(new File("C:\\Users\\YD052CKF\\Extensions\\1.2.7_1.crx"));

        driver = new ChromeDriver(options);
        driver.get("http://46.182.25.137/v1/#/login");
        Thread.sleep(5000);

        //Выбираем сертификат(крипто-про оператор по умолчанию)

        WebElement t = (new WebDriverWait(driver, 30)).

                until(ExpectedConditions.presenceOfElementLocated(tagName("button")));

        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);

        //((JavascriptExecutor) driver).executeScript("arguments[0].click()",
        //                                                driver.findElement(By.tagName("button")));
        //Thread.sleep(3000);
        //t = driver.findElement(By.className("btn-success"));
        t = (new WebDriverWait(driver, 3)).


                //Кликнуть кнопку "Выбрать"

                        until(ExpectedConditions.presenceOfElementLocated(xpath("//*[@id=\"__BVID__90___BV_modal_body_\"]/div[2]/button/span")));
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        //t.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);
        t = (new WebDriverWait(driver, 10)).


                //Кликнуть войти в систему
                //*[@id="__BVID__34___BV_modal_body_"]/div[2]/button[2]/span
                        until(ExpectedConditions.presenceOfElementLocated(xpath("//*[@id=\"__BVID__34___BV_modal_body_\"]/div[2]/button[2]/span")));
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        //t.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);
        Thread.sleep(50000);
        //t = (new WebDriverWait(driver, 10));

                /*Обходим ошибку
                        until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#__BVID__150___BV_modal_footer_ > div > button")));
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        //t.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);*/
        t = (new WebDriverWait(driver, 240)).

                //Подать заявление
                        until(ExpectedConditions.presenceOfElementLocated(cssSelector("#app > div.wrapper > div.main-panel > div.content > div > div > div > div.card > div.card-body > button > span")));
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        //t.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);
        Thread.sleep(3000);

        //Предполагаемая дата выдачи

        WebElement element_form;
        WebElement element_select;
        WebElement element_cell;
        WebElement element;
        List<WebElement> element_list, element_list2, element_list3;


        //1
        element_form = driver.findElement(tagName("form"));

        //4
        element_list2 = element_form.findElements(tagName("select"));

        //5
        element_select = element_list2.get(0);

        //6
        element_list3 = element_select.findElements(tagName("option"));

        //7
        element = element_list3.get(1);
        element.click();
        System.out.println(element.getText());
        System.out.println(element.getAttribute("value"));


    }


    @AfterEach
    void tearDown() throws Exception {
        //driver.close();
    }


    @Test
    void test() {

    }

}

