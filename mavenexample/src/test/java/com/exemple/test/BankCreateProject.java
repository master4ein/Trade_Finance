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

class BankCreateProject {
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

                //Авторизация ГПБанк
                        until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"__BVID__91\"]/label[2]/span")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);
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
        t = (new WebDriverWait(driver, 5)).

                //Обходим ошибку
                        until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#__BVID__150___BV_modal_footer_ > div > button")));
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        //t.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);
        t = (new WebDriverWait(driver, 5)).

                //Обновить список
                until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/div[1]/button/span"))); //*[@id="app"]/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/div[1]/button/span
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        //t.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);
        t = (new WebDriverWait(driver, 15)).

        //Перейти в отправленную заявку


                until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"__BVID__209\"]/tbody/tr[1]/td[9]"))); //*[@id="__BVID__209"]/tbody/tr[1]/td[9]
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        //t.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);
        //Thread.sleep(3000);
        t = (new WebDriverWait(driver, 30)).

               //Создать проект гарантии
                        until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/div[10]/button[3]/span")));
        //*[@id="app"]/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/div[10]/button[3]/span
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        t.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);
                        t = (new WebDriverWait(driver, 3)).

                //Сохранить
                        until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/div[2]/button[2]")));
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        t.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);
        Thread.sleep(45000);
        t = (new WebDriverWait(driver, 45)).


            //Отправить на подпись
            until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/div[6]/button[3]/span")));
        //*[@id="app"]/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/div[6]/button[3]/span
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        t.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);
        Thread.sleep(30000);
     // t = (new WebDriverWait(driver, 30)).


        //Подтвердить действие
       // t = (new WebDriverWait(driver, 5)).
                      //  until(ExpectedConditions.presenceOfElementLocated(By.linkText("Да")));

      //  System.out.println(t.getText());
        //driver.findElement(By.linkText("Да")).click();;
              //Значение id каждый раз +1 (1162 последний в раз был) !!! //*[@id="__BVID__1164___BV_modal_footer_"]/div/button[2]/span
                      //WebElement element = driver.findElement(By.partialLinkText("text"));//*[@id="__BVID__1169___BV_modal_footer_"]/div/button[2]
                //*[@id="__BVID__1824___BV_modal_footer_"]/div/button[2]/span/svg

              //  WebElement button = driver.findElement(By.cssSelector("header[id^='Да-']"));

      //  WebElement userName = driver.findElement(By.xpath(".//*[text()='Да']/.."));

        //*[@id="__BVID__1171___BV_modal_footer_"]/div/button[2]

               /*until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"__BVID__1167___BV_modal_footer_\"]/div/button[2]/span")));
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        t.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);
        //*[@id="__BVID__1160___BV_modal_footer_"]/div/button[2]/span
        //*[@id="__BVID__1160___BV_modal_footer_"]/div/button[2]
       // #__BVID__1805___BV_modal_footer_ > div > button.btn.btn-success.btn-fill.float-right.with-icon > span
//*[@id="__BVID__1805___BV_modal_footer_"]/div/button[2]
        //*[@id="__BVID__1434___BV_modal_footer_"]/div/button[2]/span
        //*[@id="__BVID__1311___BV_modal_footer_"]/div/button[2]/span
//html/body/div/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/div[2]/div/div[1]/div/div/footer/div/button[2]/span
//*[@id="__BVID__1311___BV_modal_footer_"]/div/button[2]
        //*[@id="__BVID__1311___BV_modal_footer_"]/div/button[2]
                //*[@id="__BVID__1159___BV_modal_footer_"]/div/button[2]
        //*[@id="__BVID__1159___BV_modal_footer_"]/div/button[2]/span
        //*[@id="__BVID__1826___BV_modal_footer_"]/div/button[2]/span
            /*until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("//#__BVID__1157___BV_modal_footer_ > div > button.btn.btn-success.btn-fill.float-right.with-icon"))); //*[@id="__BVID__1156___BV_modal_footer_"]/div/button[2] //*[@id="__BVID__1156___BV_modal_footer_"]/div/button[2]/span
        //*[@id="__BVID__1158___BV_modal_footer_"]/div/button[2]/span
        //*[@id="__BVID__1157___BV_modal_footer_"]/div/button[2]
        // #__BVID__1157___BV_modal_footer_ > div > button.btn.btn-success.btn-fill.float-right.with-icon
        //*[@id="__BVID__1157___BV_modal_footer_"]/div/button[2]/span
        //*[@id="__BVID__1157___BV_modal_footer_"]/div/button[2]/span
        //*[@id="__BVID__1155___BV_modal_footer_"]/div/button[2]/span
        //*[@id="__BVID__1155___BV_modal_footer_"]/div/button[2]
        //*[@id="__BVID__1155___BV_modal_footer_"]/div/button[2]/span/svg

        //#__BVID__1157___BV_modal_footer_ > div > button.btn.btn-success.btn-fill.float-right.with-icon
#__BVID__1805___BV_modal_footer_ > div > button.btn.btn-success.btn-fill.float-right.with-icon > span > svg
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        t.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);
        Thread.sleep(45000);*/
        t = (new WebDriverWait(driver, 45)).


                        until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/div[6]/button[3]/span")));
            System.out.println(t);                                                      //*[@id="app"]/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/div[6]/button[3]/span
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        //t.click();


                ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);
        t = (new WebDriverWait(driver, 45)).

            //Подтвердить действие
                    //Значение id каждый раз +1 (1253  - в последний раз был) !!! //*[@id="__BVID__1253___BV_modal_footer_"]/div/button[2]
                    until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"__BVID__1256___BV_modal_footer_\"]/div/button[2]/span"))); //*[@id="__BVID__1249___BV_modal_footer_"]/div/button[2]/span/svg
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        //t.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);
        Thread.sleep(45000);


        //*[@id="__BVID__1244___BV_modal_footer_"]/div/button[2]

        //*[@id="__BVID__1137___BV_modal_footer_"]/div/button[2]/span

        //driver.findElement(By.xpath("//*[@id=\"__BVID__402\"]/tbody/tr[1]/td[9]")).click();
        //* [@id="__BVID__209"]/tbody/tr[1]/td[1]
        //*[@id="__BVID__402"]/tbody/tr[1]/td[9]
        //*[@id="__BVID__593"]/tbody/tr[2]/td[9]

        // "#app > div.wrapper > div.main-panel > footer"


    }


// //*[@id="__BVID__150___BV_modal_footer_"]/div/button

    @AfterEach
    void tearDown() throws Exception {
        //driver.close();
    }



    @Test
    void test() {

    }



}