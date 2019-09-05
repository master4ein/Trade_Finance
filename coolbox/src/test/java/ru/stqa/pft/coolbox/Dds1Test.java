package ru.stqa.pft.coolbox;// Generated by Selenium IDE
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;
public class Dds1Test {
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
  public void dds1() {
    driver.get("http://77.244.210.158:8082/");
    driver.manage().window().setSize(new Dimension(1339, 1040));
    driver.findElement(By.id("selectAddress")).click();
    {
      WebElement dropdown = driver.findElement(By.id("selectAddress"));
      dropdown.findElement(By.xpath("//option[. = '0x7a6bd923d6f951d010bc899c96b2411f790ef789 - MANAGER']")).click();
    }
    driver.findElement(By.cssSelector("option:nth-child(3)")).click();
    driver.findElement(By.cssSelector(".btn")).click();
    driver.findElement(By.linkText("Закладные")).click();
    driver.findElement(By.linkText("17/144/100")).click();
    driver.findElement(By.linkText("Карточка ценной бумаги")).click();
    js.executeScript("window.scrollTo(0,0)");
    driver.findElement(By.cssSelector(".btn:nth-child(2)")).click();
    driver.findElement(By.cssSelector(".btn > span")).click();
  }
}