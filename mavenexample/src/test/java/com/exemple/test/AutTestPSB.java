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


class AutTestPSB {
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
   //t = (new WebDriverWait(driver, 30)).

              /*    until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#app > div.wrapper > div.main-panel > div.content > div > div > div > div.card > div.card-body > button > span")));
    System.out.println(t);
    System.out.println(t.isEnabled());
    System.out.println(t.isDisplayed());
    System.out.println(t.getText());
    //t.click();
    ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);*/




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