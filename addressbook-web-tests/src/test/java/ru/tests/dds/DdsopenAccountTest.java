package ru.tests.dds;// Generated by Selenium IDE

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class DdsopenAccountTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
 // @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void ddsopenAccount() throws InterruptedException {
    driver.get("http://77.244.210.158:8082/");
    driver.manage().window().setSize(new Dimension(1339, 1040));


          driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

    By.id("selectAddress").findElement(driver).click();
    {
      WebElement dropdown = driver.findElement(By.id("selectAddress"));
      dropdown.findElement(By.xpath("//option[. = '0x7a6bd923d6f951d010bc899c96b2411f790ef789 - MANAGER']")).click();
    }
    driver.findElement(By.cssSelector(".btn")).click();



    driver.findElement(By.linkText("Счета")).click();
    driver.findElement(By.cssSelector(".fa-plus-square > path")).click();
    {
      WebElement dropdown = driver.findElement(By.id("accType"));
      dropdown.findElement(By.xpath("//option[. = 'L10 - Владелец']")).click();
    }
    driver.findElement(By.cssSelector("#accType > option:nth-child(4)")).click();
    driver.findElement(By.id("number")).click();
    driver.findElement(By.id("number")).sendKeys("Selenium_test_5");
    driver.findElement(By.id("reasonDoc-openAcc-0")).click();
    {
      WebElement dropdown = driver.findElement(By.id("reasonDoc-openAcc-0"));
      dropdown.findElement(By.xpath("//option[. = '13: L5AZpQ5UKeM.jpg [grgrgg] от aft-tz-003 №б/н']")).click();
    }
    driver.findElement(By.cssSelector("#reasonDoc-openAcc-0 > option:nth-child(2)")).click();
    driver.findElement(By.id("reasonDoc-mortgageNew-0")).click();
    {
      WebElement dropdown = driver.findElement(By.id("reasonDoc-mortgageNew-0"));
      dropdown.findElement(By.xpath("//option[. = '13: L5AZpQ5UKeM.jpg [grgrgg] от aft-tz-003 №б/н']")).click();
    }
    driver.findElement(By.cssSelector("#reasonDoc-mortgageNew-0 > option:nth-child(2)")).click();
    driver.findElement(By.id("reasonDoc-ownerRequest-0")).click();
    {
      WebElement dropdown = driver.findElement(By.id("reasonDoc-ownerRequest-0"));
      dropdown.findElement(By.xpath("//option[. = '13: L5AZpQ5UKeM.jpg [grgrgg] от aft-tz-003 №б/н']")).click();
    }
    driver.findElement(By.cssSelector("#reasonDoc-ownerRequest-0 > option:nth-child(2)")).click();
    driver.findElement(By.id("reasonDoc-changeAgreement-0")).click();
    {
      WebElement dropdown = driver.findElement(By.id("reasonDoc-changeAgreement-0"));
      dropdown.findElement(By.xpath("//option[. = '13: L5AZpQ5UKeM.jpg [grgrgg] от aft-tz-003 №б/н']")).click();
    }
    driver.findElement(By.cssSelector("#reasonDoc-changeAgreement-0 > option:nth-child(2)")).click();
    driver.findElement(By.id("reasonDoc-mortgageWithdrawal-0")).click();
    {
      WebElement dropdown = driver.findElement(By.id("reasonDoc-mortgageWithdrawal-0"));
      dropdown.findElement(By.xpath("//option[. = '13: L5AZpQ5UKeM.jpg [grgrgg] от aft-tz-003 №б/н']")).click();
    }
    driver.findElement(By.name("open")).click();
  }
}
