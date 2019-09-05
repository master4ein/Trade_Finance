package ru.tests.dds;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountOpen {
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
    public void ddsopenAccount() throws InterruptedException {
        driver.get("http://77.244.210.158:8082/");
        driver.manage().window().fullscreen();



        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);


        //Аутентификация
        By.id("selectAddress").findElement(driver).click();
        {
            driver.findElement(By.id("selectAddress")).findElement(By.xpath("//option[. = '0x7a6bd923d6f951d010bc899c96b2411f790ef789 - MANAGER']")).click();
        }
        driver.findElement(By.cssSelector(".btn")).click();



        //Переход в счета

        (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Счета"))).click();

        driver.findElement(By.linkText("Счета")).click();

        //Создание счета
        (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(@href,'/account/new')]"))).click();


        //Указание типа счета
        (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id("accType"))).click();
        {
            driver.findElement(By.id("accType")).findElement(By.xpath("//option[. = 'L10 - Владелец']")).click();
        }

        //Указание номера счета
        driver.findElement(By.id("number")).sendKeys("Selenium_test_5");


        //Указание основания для открытия счета
        driver.findElement(By.id("reasonDoc-openAcc-0")).click();
        driver.findElement(By.cssSelector("#reasonDoc-openAcc-0 > option:nth-child(2)")).click();

        //Указание для приема на обслуживание
        driver.findElement(By.id("reasonDoc-mortgageNew-0")).click();
        driver.findElement(By.cssSelector("#reasonDoc-mortgageNew-0 > option:nth-child(2)")).click();

        //Указание основания для запроса владельца закладной
        driver.findElement(By.id("reasonDoc-ownerRequest-0")).click();
        driver.findElement(By.cssSelector("#reasonDoc-ownerRequest-0 > option:nth-child(2)")).click();

        //Основания соглашения об изменении
        driver.findElement(By.id("reasonDoc-changeAgreement-0")).click();
        driver.findElement(By.cssSelector("#reasonDoc-changeAgreement-0 > option:nth-child(2)")).click();

        //Основание для снятия с обслуживания
        driver.findElement(By.id("reasonDoc-mortgageWithdrawal-0")).click();
        driver.findElement(By.cssSelector("#reasonDoc-mortgageWithdrawal-0 > option:nth-child(2)")).click();

        driver.findElement(By.name("open")).click();
    }
}