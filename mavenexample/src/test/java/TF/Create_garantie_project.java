package TF;

import static org.junit.Assert.fail;

//Создание на основе гарантии в статусе "Проект"

import java.io.File;
import java.util.ArrayList;



import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.engine.script.Script;
import org.junit.jupiter.params.provider.Arguments;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;



public class Create_garantie_project {
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

                until(ExpectedConditions.presenceOfElementLocated(By.tagName("button")));

        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);

        //((JavascriptExecutor) driver).executeScript("arguments[0].click()",
        //                                                driver.findElement(By.tagName("button")));
        //Thread.sleep(3000);
        //t = driver.findElement(By.className("btn-success"));
        t = (new WebDriverWait(driver, 3)).



                //Кликнуть кнопку "Выбрать"

                        until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"__BVID__90___BV_modal_body_\"]/div[2]/button/span")));
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        //t.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);
        t = (new WebDriverWait(driver, 10)).


                //Кликнуть войти в систему
                //*[@id="__BVID__34___BV_modal_body_"]/div[2]/button[2]/span
                        until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"__BVID__34___BV_modal_body_\"]/div[2]/button[2]/span")));
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
        t = (new WebDriverWait(driver, 10)).

                //Войти в заявку в статусе "Проект"
                        until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"__BVID__181\"]/tbody/tr[3]/td[9]")));
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        //t.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);
        t = (new WebDriverWait(driver, 10)).
        //Thread.sleep(3000);


                //Создать на основе

                        until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/div[10]/button[5]/span")));
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        t.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);
        t = (new WebDriverWait(driver, 10)).

                //Подтвердить действие
                        until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"__BVID__363___BV_modal_footer_\"]/div/button[2]/span")));
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        t.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);
       // t = (new WebDriverWait(driver, 10)).
                Thread.sleep(3000);

                //Предполагаемая дата выдачи
                WebElement element;
        element = driver.findElement(By.xpath("//*[@id=\"__BVID__467\"]"));
        element.sendKeys("27123000");

        //Окончание срока действия гарантии
        element = driver.findElement(By.xpath("//*[@id=\"__BVID__502\"]"));
        element.sendKeys("27123003");
        t = (new WebDriverWait(driver, 10)).

        //Сохранить заявление
        until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/form/div[68]/button[2]/span")));
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        t.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);
        Thread.sleep(3000);


    }



    @AfterEach
    void tearDown() throws Exception {
        //driver.close();
    }



    @Test
    void test() {

    }



}
