package com.exemple.test;



import static org.junit.Assert.fail;



import java.io.File;
import java.util.ArrayList;



import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
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


class Test_TF {
    private WebDriver driver;


    @BeforeEach
    void setUp() throws Exception {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--user-data-dir=C:\\Users\\YD052CKF\\AppData\\Local\\Google\\Chrome\\User Data");
        options.addArguments("--profile-directory=Profile");

        options.addExtensions(new File("C:\\Users\\YD052CKF\\Extensions\\1.2.7_1.crx"));

        driver = new ChromeDriver(options);
        driver.get("http://5.178.84.102/cbg/#/login");

       // Thread.sleep(3000);

        //driver.manage().window().setSize(new Dimension(1920, 1040));
        WebElement t = (new WebDriverWait(driver, 30)).
                //until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#__BVID__33___BV_modal_body_ > div.buttons-footer > button > span")));
                until(ExpectedConditions.presenceOfElementLocated(By.tagName("button")));

        //WebElement t = t1.findElement(By.xpath(".//button[@class='buttons-footer']"));

      //  System.out.println(t);
       // System.out.println(t.getText());
     //   System.out.println(t.isDisplayed());
      //  System.out.println(t.isEnabled());
     //   System.out.println(t.isSelected());
       // Thread.sleep(2000);
        try {
            t.click();
            ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);
            System.out.println("Clicked");
        }

        catch (Exception e) {
            System.out.println(e);
        }


        //t.click();

        //driver.findElement(By.cssSelector("#\\__BVID__33___BV_modal_body_ .icon-text")).click();
        //driver.findElement(By.cssSelector(".btn-outline-primary:nth-child(2) > span")).click();
       // driver.findElement(By.cssSelector(".btn-success:nth-child(1) > .icon-text")).click();
        //driver.findElement(By.cssSelector(".float-left > .icon-text")).click();
       // driver.findElement(By.cssSelector("#\\__BVID__153___BV_modal_footer_ .fa-icon")).click();
      //  driver.findElement(By.cssSelector(".btn-info > .icon-text")).click();

    }



    @AfterEach
    void tearDown() throws Exception {
        //driver.close();
    }



    @Test
    void test() {

    }



}