package com.exemple.test;



import static org.junit.Assert.fail;



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


class SendForSignature {
    private WebDriver driver;


    @BeforeEach
    void setUp() throws Exception {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--user-data-dir=C:\\Users\\YD052CKF\\AppData\\Local\\Google\\Chrome\\User Data");
        options.addArguments("--profile-directory=Profile");

        options.addExtensions(new File("C:\\Users\\YD052CKF\\Extensions\\1.2.7_1.crx"));

        driver = new ChromeDriver(options);
        driver.get("http://5.178.84.102/cbg/#/login");


        WebElement t = (new WebDriverWait(driver, 30)).

                until(ExpectedConditions.presenceOfElementLocated(By.tagName("button")));

        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);

        //((JavascriptExecutor) driver).executeScript("arguments[0].click()",
        //                                                driver.findElement(By.tagName("button")));
        //Thread.sleep(3000);
        //t = driver.findElement(By.className("btn-success"));
        t = (new WebDriverWait(driver, 1000)).

                until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#__BVID__89___BV_modal_body_ > div.buttons-footer > button")));
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        //t.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);
        t = (new WebDriverWait(driver, 10)).

                until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#__BVID__33___BV_modal_body_ > div.buttons-footer > button.btn.btn-success.btn-fill.float-left.with-icon > span")));
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        //t.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);
        Thread.sleep(10000);
        t = (new WebDriverWait(driver, 30)).

                //Обходим ошибку
                        until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#__BVID__150___BV_modal_footer_ > div > button")));
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        //t.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);
        t = (new WebDriverWait(driver, 30)).

                until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#app > div.wrapper > div.main-panel > div.content > div > div > div > div.card > div.card-body > button > span")));
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        //t.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);
        Thread.sleep(5000);

        //Предполагаемая дата выдачи
        WebElement element;
        element = driver.findElement(By.xpath("//*[@id=\"__BVID__258\"]"));
        element.sendKeys("17122019");

        //№ соглашения/договора о выдаче гарантии(й)
        element = driver.findElement(By.xpath("//*[@id=\"__BVID__259\"]"));
        element.sendKeys("777");

        //Дата соглашения/договора о выдаче гарантии(й)
        element = driver.findElement(By.xpath("//*[@id=\"__BVID__260\"]"));
        element.sendKeys("27112019");
        //Thread.sleep(1000);

        //Вид гарантии *
        driver.findElement(By.xpath("//*[@id=\"__BVID__265\"]/option[5]")).click();

        //Гарантия обеспечивает обязательства в соответствии с: *
        driver.findElement(By.xpath("//*[@id=\"__BVID__268\"]/option[1]")).click();

        //Гарант*
        driver.findElement(By.xpath("//*[@id=\"__BVID__270\"]/option[4]")).click();

        //Бенефициар*
        //*[@id="__BVID__278"]/option[2]
        driver.findElement(By.xpath("//*[@id=\"__BVID__278\"]/option[2]")).click();

        //Сумма гарантии (цифрами) *
        element = driver.findElement(By.xpath("//*[@id=\"__BVID__285\"]"));
        element.sendKeys("1001");

        //Валюта
        driver.findElement(By.xpath("//*[@id=\"__BVID__287\"]/option[3]")).click();

        //Вступление гарантии в силу

        //Окончание срока действия гарантии
        element = driver.findElement(By.xpath("//*[@id=\"__BVID__293\"]"));
        element.sendKeys("27112020");

        //ОБЯЗАТЕЛЬСТВО, ИСПОЛНЕНИЕ КОТОРОГО ОБЕСПЕЧИВАЕТСЯ ГАРАНТИЕЙ
        //Номер договора
        element = driver.findElement(By.xpath("//*[@id=\"__BVID__295\"]"));
        element.sendKeys("777");
        //*[@id="__BVID__295"]

        //Дата*
        element = driver.findElement(By.xpath("//*[@id=\"__BVID__390\"]"));
        element.sendKeys("01012019");

        //Наименование договора:
        element = driver.findElement(By.xpath("//*[@id=\"__BVID__392\"]"));
        element.sendKeys("Договор_777");
        //*[@id="__BVID__392"]

        //Требование по гарантии должно быть представлено, начиная с
        element = driver.findElement(By.xpath("//*[@id=\"__BVID__314\"]"));
        element.sendKeys("Событие_777");

        //СРОК РАССМОТРЕНИЯ ТРЕБОВАНИЯ И ПРИЛОЖЕННЫХ К НЕМУ ДОКУМЕНТОВ
        element = driver.findElement(By.xpath("//*[@id=\"__BVID__316\"]"));
        element.sendKeys("7");

        //ПОДСУДНОСТЬ
        driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/form/div[50]/div[2]/span[2]/select/option[2]")).click();
        t = (new WebDriverWait(driver, 10)).


                //Сохранить заявление

                        until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/form/div[68]/button[2]/span")));
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        t.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);
        Thread.sleep(60000);
        t = (new WebDriverWait(driver, 1)).

                //Отправить на подпись
                         until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/div[10]/button[4]/span")));
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        t.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);
        Thread.sleep(5000);
        t = (new WebDriverWait(driver, 1)).

        //Подтвердить действие
                            until(ExpectedConditions.presenceOfElementLocated(By.xpath(" //*[@id=\"__BVID__553___BV_modal_footer_\"]/div/button[2]/span")));
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        t.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);
        Thread.sleep(5000);



        //*[@id="app"]/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/div[10]/button[3]/span



        //*[@id="__BVID__553___BV_modal_footer_"]/div/button[2]/span
    }




    @AfterEach
    void tearDown() throws Exception {
        //driver.close();
    }



    @Test
    void test() {

    }



}