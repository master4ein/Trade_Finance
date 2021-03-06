package ru.stqa.pft.coolbox;// Generated by Selenium IDE
//mport org.junit.Test;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;
public class Test2Test {
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
  public void test1() {
    driver.get("http://77.244.210.158:8082/");
    driver.manage().window().setSize(new Dimension(935, 1039));
    driver.findElement(By.id("selectAddress")).click();

    {
      WebElement dropdown = driver.findElement(By.id("selectAddress"));
      dropdown.findElement(By.xpath("//option[. = '0x7a6bd923d6f951d010bc899c96b2411f790ef789 - MANAGER']")).click();
    }
    driver.findElement(By.id("selectAddress")).click();
    driver.findElement(By.cssSelector(".btn")).click();
    driver.findElement(By.cssSelector(".btn > span")).click();
  }
}