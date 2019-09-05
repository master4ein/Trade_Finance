package com.exemple.test;// Generated by Selenium IDE
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;
public class Test4Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  //@After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void test3() {
    driver.get("http://77.244.210.158:8082/");
    driver.manage().window().setSize(new Dimension(1920, 1048));
    driver.findElement(By.id("selectAddress")).click();
    {
      WebElement dropdown = driver.findElement(By.id("selectAddress"));
      dropdown.findElement(By.xpath("//option[. = '0xaeff011d5c1daf4c5ccb2f1239ffb7207a95c817 - ADMIN']")).click();
    }
    driver.findElement(By.cssSelector("option:nth-child(2)")).click();
    driver.findElement(By.cssSelector(".btn")).click();
    driver.findElement(By.linkText("Системные настройки")).click();
  }
}
