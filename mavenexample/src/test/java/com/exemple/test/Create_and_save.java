//Создаем заявление на гарантию под оператором Крипто-про

package com.exemple.test;




import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;


class Create_and_save {
    private WebDriver driver;


    @BeforeEach
    void setUp() throws Exception {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--user-data-dir=C:\\Users\\YD052CKF\\AppData\\Local\\Google\\Chrome\\User Data");
        options.addArguments("--profile-directory=Profile");

        options.addExtensions(new File("C:\\Users\\YD052CKF\\Extensions\\1.2.7_1.crx"));

        driver = new ChromeDriver(options);
        driver.get("http://46.182.25.137/v1/#/login");
        Thread.sleep(5000);

        //Выбираем сертификат(крипто-про оператор по умолчанию)

        WebElement t = (new WebDriverWait(driver, 30)).

                until(ExpectedConditions.presenceOfElementLocated(By.tagName("button")));

        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);

        //((JavascriptExecutor) driver).executeScript("arguments[0].click()",
        //                                                driver.findElement(By.tagName("button")));
        //Thread.sleep(3000);
        //t = driver.findElement(By.className("btn-success"));
        t = (new WebDriverWait(driver, 3)).



                //Кликнуть кнопку "Выбрать"

                        until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"__BVID__90___BV_modal_body_\"]/div[2]/button/span")));
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        //t.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);
        t = (new WebDriverWait(driver, 10)).


                //Кликнуть войти в систему
                //*[@id="__BVID__34___BV_modal_body_"]/div[2]/button[2]/span
                        until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"__BVID__34___BV_modal_body_\"]/div[2]/button[2]/span")));
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        //t.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);
        Thread.sleep(50000);
        //t = (new WebDriverWait(driver, 10));

                /*Обходим ошибку
                        until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#__BVID__150___BV_modal_footer_ > div > button")));
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        //t.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);*/
        t = (new WebDriverWait(driver, 50)).

                //Подать заявление
          until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#app > div.wrapper > div.main-panel > div.content > div > div > div > div.card > div.card-body > button > span")));
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        //t.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);
        Thread.sleep(3000);

        //Предполагаемая дата выдачи
        WebElement element;
        element = driver.findElement(By.xpath("//*[@id=\"__BVID__260\"]"));
        element.sendKeys("23122019");

        //№ соглашения/договора о выдаче гарантии(й)
        element = driver.findElement(By.xpath("//*[@id=\"__BVID__261\"]"));
        element.sendKeys("777");

        //Дата соглашения/договора о выдаче гарантии(й)
        element = driver.findElement(By.xpath("//*[@id=\"__BVID__262\"]"));
        element.sendKeys("27112019");
        //Thread.sleep(1000);

        //Вид гарантии *
        driver.findElement(By.xpath("//*[@id=\"__BVID__267\"]/option[2]")).click();

        //Гарантия обеспечивает обязательства в соответствии с: *
        driver.findElement(By.xpath("//*[@id=\"__BVID__270\"]/option[1]")).click();

        //Гарант*
        driver.findElement(By.xpath("//*[@id=\"__BVID__272\"]/option[2]")).click();

        //Бенефициар*
        //*[@id="__BVID__278"]/option[2]
        driver.findElement(By.xpath("//*[@id=\"__BVID__280\"]/option[4]")).click();

        //Сумма гарантии (цифрами) *
        element = driver.findElement(By.xpath("//*[@id=\"__BVID__287\"]"));
        element.sendKeys("99");

        //Валюта
       // driver.findElement(By.xpath("//*[@id=\"__BVID__287\"]/option[3]")).click();

        //Вступление гарантии в силу

        //Окончание срока действия гарантии
        element = driver.findElement(By.xpath("//*[@id=\"__BVID__295\"]"));
        element.sendKeys("27112020");

        //ОБЯЗАТЕЛЬСТВО, ИСПОЛНЕНИЕ КОТОРОГО ОБЕСПЕЧИВАЕТСЯ ГАРАНТИЕЙ
        //Номер договора
        element = driver.findElement(By.xpath("//*[@id=\"__BVID__297\"]"));
        element.sendKeys("777");
        //*[@id="__BVID__295"]

        //Дата*
        element = driver.findElement(By.xpath("//*[@id=\"__BVID__392\"]"));
        element.sendKeys("01012019");

        //Наименование договора:
        element = driver.findElement(By.xpath("//*[@id=\"__BVID__394\"]"));
        element.sendKeys("Договор_777");
        //*[@id="__BVID__392"]

        //Требование по гарантии должно быть представлено, начиная с
        element = driver.findElement(By.xpath("//*[@id=\"__BVID__316\"]"));
        element.sendKeys("Событие_777");

        //СРОК РАССМОТРЕНИЯ ТРЕБОВАНИЯ И ПРИЛОЖЕННЫХ К НЕМУ ДОКУМЕНТОВ
        element = driver.findElement(By.xpath("//*[@id=\"__BVID__318\"]"));
     //   element.sendKeys("7");

        //ПОДСУДНОСТЬ
        driver.findElement(By.xpath("//*[@id=\"__BVID__339\"]/option[2]")).click(); //*[@id="__BVID__339"]/option[2]
        t = (new WebDriverWait(driver, 10)).


                //Сохранить заявление

                        until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/form/div[68]/button[2]/span")));
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        t.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);
        Thread.sleep(80000);
        //t = (new WebDriverWait(driver, 1)).


    }



    @AfterEach
    void tearDown() throws Exception {
        //driver.close();
    }



    @Test
    void test() {

    }



}