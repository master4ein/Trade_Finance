package com.exemple.test;



import static com.codeborne.selenide.Selenide.$;
import static java.sql.DriverManager.getDriver;
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
import org.openqa.selenium.Keys;
import org.openqa.selenium.*;



class Registration_of_payment_on_demand {
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

                //Переход в Список гарантий

                until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/div/ul/li[7]/a")));//*[@id="app"]/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/div/div[1]/button/span
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        //t.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);
        t = (new WebDriverWait(driver, 10)).

                //Обновить список
                        until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/div/div[1]/button/span")));
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        //t.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);
        t = (new WebDriverWait(driver, 20)).

                //Перейти в гарантию                                                //*[@id="__BVID__443"]/tbody/tr[1]/td[11] //*[@id="__BVID__232"]/tbody/tr[1]/td[11]
                        until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"__BVID__232\"]/tbody/tr[1]/td[11]"))); //*[@id="__BVID__442"]/tbody/tr[2]/td[11] //*[@id="__BVID__232"]/tbody/tr[1]/td[11]
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        //t.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);
       t = (new WebDriverWait(driver, 5)).

                //Регистрация платежа по требованию //*[@id="app"]/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/div[6]/button[2]/span //*[@id="app"]/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/div[6]/button[4]/span
               until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/div[6]/button[2]/span"))); //*[@id="__BVID__442"]/tbody/tr[2]/td[11] //*[@id="__BVID__232"]/tbody/tr[1]/td[11]
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        //t.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);
           Thread.sleep(10000);
   //    t = (new WebDriverWait(driver, 10)).



        //Форма представления требования * - иное

        //WebElement element = new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("article[class^='DetailPage__container--'][id^='ride-']>div[class^='DetailPage__highlights--'] button[type='submit']>span")));

       // driver.findElement(By.xpath("//button[.//span[text()='<option value=\"03\">Иное</option>']]")).click();

               //driver.findElement(By.xpath("document.querySelector(\"#__BVID__376 > option:nth-child(4)\")")).click();

       // String Text = driver.findElement(By.id("Иное")).getText();
        //driver.findElement(By.xpath("//button[text()=\"Иное\"]")).click();
       // WebElement previousButton = driver.findElements(By.cssSelector("header[<option value='03'>Иное</option>")).click;
       //$(By.name("Иное")).click();
        //$("#submit").click();
        //*[@id="__BVID__376"]/option[4] <option value="03">Иное</option>
       // driver.findElement(By.name("Иное")).click(); //<option value="03">Иное</option> //*[@id="__BVID__378"]/option[3]
        //driver.findElement(By.linkText("Иное")).click();
        //driver.findElement(By.tagName("<option value=\"03\">Иное</option>")).click();
       // WebElement element = driver.findElement(By.linkText("//div[contains(text(), " + "Иное" + ")]"));
        //element.click();; //*[@id="__BVID__37*"]/option[4]
       /* WebElement element;
        element = driver.findElement(By.partialLinkText("Swift"));
        element.click();*/
       // (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText("Иное"))).click();
          //until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText("Отмена"))); //*[@id="__BVID__442"]/tbody/tr[2]/td[11] //*[@id="__BVID__232"]/tbody/tr[1]/td[11] - работает на ссылку "выход"
               //  until(ExpectedConditions.presenceOfElementLocated(By.className("form-control custom-select")));
                     //  until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("Иное")));
                             //until(ExpectedConditions.presenceOfElementLocated(By.tagName("<option value=\"03\">Иное</option>")));
               // System.out.println(t);

//Значение меняется 376 или 378


       // driver.findElement(By.partialLinkText(".//span[contains(text(),'Иное')]")).click();
      //  driver.findElement(By.id("form-control custom-select")).click();

        driver.findElement(By.xpath("//*[@id=\"__BVID__376\"]/option[4]")).click();
        Thread.sleep(5000);

       // driver.findElement(By.cssSelector("input[type='button'][value=\"03\">Иное</option>']")).click();
     //
        //
        //   driver.findElement(By.id("Иное")).click();

        //Введите форму предоставления требования - ИНОЕ
//Значение меняется 417 или 415

        WebElement
        element = driver.findElement(By.xpath("//*[@id=\"__BVID__415\"]"));
        element.sendKeys("ТЕСТ_Регистрация платежа по требованию");

       // WebElement element = driver.findElement(By.name("Иное"));
       // element.click();

        //Дата требования

        element = driver.findElement(By.xpath("//*[@id=\"__BVID__378\"]"));
        element.sendKeys("05122019");
        //*[@id="__BVID__378"] ТЕСТ_Регистрация платежа по требованию

        //Дата получения требования Гарантом *
        element = driver.findElement(By.xpath("//*[@id=\"__BVID__380\"]"));
        element.sendKeys("05122019");

        //Номер требования Бенифициара *
        element = driver.findElement(By.xpath("//*[@id=\"__BVID__382\"]"));
        element.sendKeys("№ 7");

        //Референс Гаранта *
        element = driver.findElement(By.xpath("//*[@id=\"__BVID__384\"]"));
        element.sendKeys("%;:*()?:%№;");


        //Сумма требования (цифрами) *
        element = driver.findElement(By.xpath("//*[@id=\"__BVID__389\"]"));
        element.sendKeys("1");

        //Сумма платежа (цифрами) *
        element = driver.findElement(By.xpath("//*[@id=\"__BVID__394\"]"));
        element.sendKeys("1");

        //Валюта
        driver.findElement(By.xpath("//*[@id=\"__BVID__396\"]/option[3]")).click();

        //Дата платежа по требованию *
        element = driver.findElement(By.xpath("//*[@id=\"__BVID__398\"]"));
        element.sendKeys("05123333");

        //Сумма уменьшения (цифрами) *
        element = driver.findElement(By.xpath("//*[@id=\"__BVID__403\"]"));
        element.sendKeys("1");

        //Валюта
        driver.findElement(By.xpath("//*[@id=\"__BVID__405\"]/option[3]")).click();
        t = (new WebDriverWait(driver, 10)).

        //Сохранить
        until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/form/div[16]/button[2]/span"))); //*[@id="__BVID__442"]/tbody/tr[2]/td[11] //*[@id="__BVID__232"]/tbody/tr[1]/td[11]
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        //t.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);
        Thread.sleep(30000);
        t = (new WebDriverWait(driver, 30)).

        //На подпись
                until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/form/div[15]/button[5]/span"))); //*[@id="__BVID__442"]/tbody/tr[2]/td[11] //*[@id="__BVID__232"]/tbody/tr[1]/td[11]
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        //t.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);
        t = (new WebDriverWait(driver, 5)).


                //Подтвердить действие
                        until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"__BVID__480___BV_modal_footer_\"]/div/button[2]/span"))); //*[@id="__BVID__442"]/tbody/tr[2]/td[11] //*[@id="__BVID__232"]/tbody/tr[1]/td[11]
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        //t.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);
        Thread.sleep(30000);
       t = (new WebDriverWait(driver, 30)).

        //Подписать
                until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/form/div[15]/button[4]/span"))); //*[@id="__BVID__442"]/tbody/tr[2]/td[11] //*[@id="__BVID__232"]/tbody/tr[1]/td[11]
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        //t.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);
           //  t = (new WebDriverWait(driver, 5)).
        t = (new WebDriverWait(driver, 5)).

        //Подтвердить действия
        until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"__BVID__531___BV_modal_footer_\"]/div/button[2]/span"))); //*[@id="__BVID__442"]/tbody/tr[2]/td[11] //*[@id="__BVID__232"]/tbody/tr[1]/td[11]
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        //t.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);
        //  t = (new WebDriverWait(driver, 5)).
        Thread.sleep(90000);
        //*[@id="__BVID__529___BV_modal_footer_"]/div/button[2]

                /*Подписать
                        until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"__BVID__533___BV_modal_footer_\"]/div/button[2]/span"))); //*[@id="__BVID__442"]/tbody/tr[2]/td[11] //*[@id="__BVID__232"]/tbody/tr[1]/td[11]
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        //t.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);
        Thread.sleep(30000);
        //t = (new WebDriverWait(driver, 30)).     */






    }




    @AfterEach
    void tearDown() throws Exception {
        //driver.close();
    }



    @Test
    void test() {

    }



}