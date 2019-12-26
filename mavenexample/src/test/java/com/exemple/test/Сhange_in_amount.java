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


class Сhange_in_amount {
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
        t = (new WebDriverWait(driver, 3)).



                //*[@id="__BVID__91"]/label[2]/span

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
        t = (new WebDriverWait(driver, 5)).

                //Переход в Список гарантий
                        until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/div/ul/li[7]/a")));//*[@id="app"]/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/div/div[1]/button/span
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        //t.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);
        t = (new WebDriverWait(driver, 5)).

                //Обновить список
                        until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/div/div[1]/button/span")));
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        //t.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);
        t = (new WebDriverWait(driver, 10)).

                //Перейти в гарантию             #__BVID__362 > tbody > tr:nth-child(1) > td:nth-child(11)                                   //*[@id="__BVID__443"]/tbody/tr[1]/td[11] //*[@id="__BVID__362"]/tbody/tr[1]/td[11]
                        until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#__BVID__362 > tbody > tr:nth-child(1) > td:nth-child(11)"))); //*[@id="__BVID__442"]/tbody/tr[2]/td[11] //*[@id="__BVID__232"]/tbody/tr[1]/td[11]
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        //t.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);
        t = (new WebDriverWait(driver, 5)).

                //*[@id="app"]/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/div[6]/button[3]/span

                //Создать заявление на уменьшение суммы
                        until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/div[6]/button[2]/span")));
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        //t.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);
         //t = (new WebDriverWait(driver, 5)).
        Thread.sleep(15000);

        //Сумма, на которую требуется уменьшить гарантию
        //(тоже+1:??)
                 WebElement element;
        element = driver.findElement(By.xpath("//*[@id=\"__BVID__469\"]"));//*[@id="__BVID__460"] //*[@id="__BVID__460"] //*[@id="__BVID__462"] //*[@id="__BVID__463"]
        element.sendKeys("1");
        t = (new WebDriverWait(driver, 5)).

    //Сохранить заявление

                until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/form/div[16]/button[2]/span")));
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        //t.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);
        Thread.sleep(20000);
        t = (new WebDriverWait(driver, 20)).

        //На подпись
        // *[@id="app"]/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/form/div[12]/button[5]/span
        //*[@id="app"]/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/form/div[12]/button[5]/span
                //*[@id="app"]/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/form/div[12]/button[5]/span
                //*[@id="app"]/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/form/div[12]/button[5]/span
                //*[@id="app"]/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/form/div[12]/button[5]/span
                //*[@id="app"]/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/form/div[12]/button[5]/span
                //*[@id="app"]/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/form/div[12]/button[5]/span
                //*[@id="app"]/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/form/div[12]/button[5]/span

        until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/form/div[12]/button[4]/span"))); //*[@id="app"]/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/form/div[12]/button[5]/span
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        //t.click();
        t = (new WebDriverWait(driver, 15)).

        //Подтвердить действие
        //*[@id="__BVID__549___BV_modal_footer_"]/div/button[2]/span //*[@id="app"]/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/form/div[12]/button[5]/span
                //*[@id="__BVID__551___BV_modal_footer_"]/div/button[2]/span/svg //*[@id="__BVID__551___BV_modal_footer_"]/div/button[2] //*[@id="__BVID__551___BV_modal_footer_"]/div/button[2]
//*[@id="__BVID__552___BV_modal_footer_"]/div/button[2]/span
                //*[@id="__BVID__558___BV_modal_footer_"]/div/button[2]/span/svg
                        //id плавает, каждый раз +1
                until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/form/div[12]/button[5]")));//*[@id="__BVID__549___BV_modal_footer_"]/div/button[2]/span
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        //t.click();
        Thread.sleep(20000);
        t = (new WebDriverWait(driver, 15)).

                //Подписать                                                 //*[@id="app"]/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/form/div[12]/button[5 span(+1-?]/
                //*[@id="app"]/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/form/div[12]/button[4]/span //*[@id="app"]/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/form/div[12]/button[4]/span
                //*[@id="app"]/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/form/div[12]/button[4]
                until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/form/div[12]/button[4]/span")));

        //*[@id="app"]/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/form/div[12]/button[5]/span
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        //t.click();
      //  t = (new WebDriverWait(driver, 10)).

                //Подтвердить действие
              //  until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"__BVID__957___BV_modal_footer_\"]/div/button[2]/span")));
     //   System.out.println(t);
     //   System.out.println(t.isEnabled());
     //   System.out.println(t.isDisplayed());
    //    System.out.println(t.getText());
        //t.click();
       // t = (new WebDriverWait(driver, 5)).
       Thread.sleep(20000);


    }





    @AfterEach
    void tearDown() throws Exception {
        // driver.close();
    }



    @Test
    void test() {

    }



}