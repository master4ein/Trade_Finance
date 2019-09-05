// Generated by Selenium IDE

//Открытие депонента

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
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
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void test2() {
    driver.get("http://77.244.210.158:8082/");
    driver.manage().window().setSize(new Dimension(1920, 1040));
    driver.findElement(By.id("selectAddress")).click();
    {
      WebElement dropdown = driver.findElement(By.id("selectAddress"));
      dropdown.findElement(By.xpath("//option[. = '0x7a6bd923d6f951d010bc899c96b2411f790ef789 - MANAGER']")).click();
    }
    driver.findElement(By.cssSelector("option:nth-child(3)")).click();
    driver.findElement(By.cssSelector(".btn")).click();
    driver.findElement(By.linkText("Депоненты")).click();
    driver.findElement(By.cssSelector(".fa-plus-square > path")).click();
    js.executeScript("window.scrollTo(0,0)");
    driver.findElement(By.id("fullName")).click();
    driver.findElement(By.id("fullName")).sendKeys("1");
    driver.findElement(By.id("name")).click();
    driver.findElement(By.id("name")).sendKeys("1");
    driver.findElement(By.id("inn")).click();
    driver.findElement(By.id("inn")).sendKeys("1111111111");
    driver.findElement(By.id("kpp")).click();
    driver.findElement(By.id("kpp")).sendKeys("111111111");
    driver.findElement(By.id("ogrn")).click();
    driver.findElement(By.id("ogrn")).sendKeys("1111111111111");
    driver.findElement(By.name("certificateIssueDate")).click();
    driver.findElement(By.cssSelector(".react-datepicker__day--keyboard-selected")).click();
    driver.findElement(By.id("factAdress")).click();
    driver.findElement(By.id("factAdress")).sendKeys("1");
    driver.findElement(By.id("fias")).click();
    driver.findElement(By.id("fias")).sendKeys("1");
    driver.findElement(By.id("postAdress")).click();
    driver.findElement(By.id("postAdress")).sendKeys("1");
    driver.findElement(By.id("phoneNumber")).click();
    driver.findElement(By.id("phoneNumber")).sendKeys("1");
    driver.findElement(By.name("cooperationStartDate")).click();
    driver.findElement(By.cssSelector(".react-datepicker__day--keyboard-selected")).click();
    driver.findElement(By.id("reasonDoc-reasonDocs-0")).click();
    {
      WebElement dropdown = driver.findElement(By.id("reasonDoc-reasonDocs-0"));
      dropdown.findElement(By.xpath("//option[. = '7: WHixZmxqUho.jpg [бтбь] от Тыгыдык №б/н']")).click();
    }
    driver.findElement(By.cssSelector("#reasonDoc-reasonDocs-0 > option:nth-child(3)")).click();
    driver.findElement(By.cssSelector(".btn-primary")).click();
  }
}