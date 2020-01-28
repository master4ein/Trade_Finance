package com.exemple.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.util.List;

import static org.openqa.selenium.By.*;


class Create_and_Save_S1 {

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

                until(ExpectedConditions.presenceOfElementLocated(tagName("button")));

        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);

        //((JavascriptExecutor) driver).executeScript("arguments[0].click()",
        //                                                driver.findElement(By.tagName("button")));
        //Thread.sleep(3000);
        //t = driver.findElement(By.className("btn-success"));
        t = (new WebDriverWait(driver, 3)).



                //Кликнуть кнопку "Выбрать"

                        until(ExpectedConditions.presenceOfElementLocated(xpath("//*[@id=\"__BVID__90___BV_modal_body_\"]/div[2]/button/span")));
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        //t.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);
        t = (new WebDriverWait(driver, 10)).


                //Кликнуть войти в систему
                //*[@id="__BVID__34___BV_modal_body_"]/div[2]/button[2]/span
                        until(ExpectedConditions.presenceOfElementLocated(xpath("//*[@id=\"__BVID__34___BV_modal_body_\"]/div[2]/button[2]/span")));
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
        t = (new WebDriverWait(driver, 240)).

                //Подать заявление
                        until(ExpectedConditions.presenceOfElementLocated(cssSelector("#app > div.wrapper > div.main-panel > div.content > div > div > div > div.card > div.card-body > button > span")));
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        //t.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);
        Thread.sleep(3000);

        //Предполагаемая дата выдачи

        WebElement element_form;
        WebElement element_select;
        WebElement element_cell;
        WebElement element;
        List<WebElement> element_list, element_list2, element_list3;
        element_form = driver.findElement(tagName("form"));

        element_list = element_form.findElements(tagName("input"));
        for (int i = 0; i < element_list.size(); i++) {
            System.out.println("in " + element_list.get(i).getAttribute("type") + " " + String.valueOf(i) + " " + element_list.get(i).getAttribute("id"));
        }
        element_list2 = element_form.findElements(tagName("select"));

        element = element_list.get(2);
        element.sendKeys("27012021");


        //№ соглашения/договора о выдаче гарантии(й)
        element = element_list.get(3);
        element.sendKeys("333");

        //Дата соглашения/договора о выдаче гарантии(й)
        element = element_list.get(4);
        element.sendKeys("15012020");

        //Вид гарантии *
        //1


        //4


        //5
        element_select = element_list2.get(0);

        //6
        element_list3 = element_select.findElements(tagName("option"));

        //7
        element = element_list3.get(1);
        element.click();
        System.out.println(element.getText());
        System.out.println(element.getAttribute("value"));


        //  element.findElement(className("form-control custom-select is-invalid"));
        // element.findElement(name("advance")).click();


        //Гарантия обеспечивает обязательства в соответствии с: *
        element_select = element_list2.get(1);

        //6
        element_list3 = element_select.findElements(tagName("option"));

        //7
        element = element_list3.get(1);
        element.click();
        System.out.println(element.getText());
        System.out.println(element.getAttribute("value"));

        //Гарант*
        element_select = element_list2.get(2);
        element_list3 = element_select.findElements(tagName("option"));
        element = element_list3.get(1);
        element.click();
        System.out.println(element.getText());
        System.out.println(element.getAttribute("value"));

        //Бенефициар*
        element_select = element_list2.get(4);
        element_list3 = element_select.findElements(tagName("option"));
        element = element_list3.get(3);
        element.click();
        System.out.println(element.getText());
        System.out.println(element.getAttribute("value"));

        //Сумма гарантии (цифрами) *
        element = element_list.get(7);

        System.out.println(element.getText());
        System.out.println(element.getAttribute("id"));
        element.sendKeys("333");
        //Валюта
        // driver.findElement(By.xpath("//*[@id=\"__BVID__287\"]/option[3]")).click();

        //Вступление гарантии в силу

        //Окончание срока действия гарантии
        element = element_list.get(13);

        System.out.println(element.getText());
        System.out.println(element.getAttribute("id"));
        element.sendKeys("31122021");

        //ОБЯЗАТЕЛЬСТВО, ИСПОЛНЕНИЕ КОТОРОГО ОБЕСПЕЧИВАЕТСЯ ГАРАНТИЕЙ
        //Номер договора
        element = element_list.get(14);

        System.out.println(element.getText());
        System.out.println(element.getAttribute("id"));
        element.sendKeys("777");

        //Дата*                                 ///html/body/div/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/form/span[1]/div[1]/div[3]/input ////div[@id='app']/div[2]/div[2]/div/div/div/div/div[3]/div[2]/form/span/div/div[3]/input
        element = driver.findElement(xpath("//html/body/div/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/form/span[1]/div[1]/div[3]/input"));

        element.sendKeys("20.08.1983");

        //Наименование договора:
        element = driver.findElement(xpath("/html/body/div/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/form/span[1]/div[2]/div[2]/input"));
        element.sendKeys("Договор_777");

        //Требование по гарантии должно быть представлено, начиная с
        element = element_list.get(19);

        System.out.println(element.getText());
        System.out.println(element.getAttribute("id"));
        element.sendKeys("Test_!!!");

        //СРОК РАССМОТРЕНИЯ ТРЕБОВАНИЯ И ПРИЛОЖЕННЫХ К НЕМУ ДОКУМЕНТОВ
        element = element_list.get(20);

        System.out.println(element.getText());
        System.out.println(element.getAttribute("id"));
        element.sendKeys("7");

        //ПОДСУДНОСТЬ
        element_select = element_list2.get(9);
        element_list3 = element_select.findElements(tagName("option"));
        element = element_list3.get(1);
        element.click();
        System.out.println(element.getText());
        System.out.println(element.getAttribute("value"));
        t = (new WebDriverWait(driver, 10)).


               // Сохранить заявление
                                                                                 ///html/body/div/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/form/div[68]/button[2]/span
                        until(ExpectedConditions.presenceOfElementLocated(xpath("//*[@id=\"app\"]/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/form/div[68]/button[2]/span")));
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        t.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);
        t = (new WebDriverWait(driver, 80)).
        //Thread.sleep(50000);
                                                                                 //html/body/div/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/div[10]/button[4]/span
                //Отправить на подпись                                           /html/body/div/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/div[10]/button[4]/span
             //   element = driver.findElement(xpath("/html/body/div/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/div[10]/button[4]/span"));
       // element.click();
      //  Thread.sleep(5000);
              until(ExpectedConditions.presenceOfElementLocated(xpath("/html/body/div/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/div[10]/button[4]/span")));
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        t.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);
        t = (new WebDriverWait(driver, 80)).



                //Подтвердить действие                                             /html/body/div/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/div[4]/div/div[1]/div/div/footer/div/button[2]/span
                                                                                 //html/body/div/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/div[4]/div/div[1]/div/div/footer/div/button[2]/span
        //element = driver.findElement(xpath("/html/body/div/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/div[4]/div/div[1]/div/div/footer/div/button[2]/span"));
        //element.click();
        //
                until(ExpectedConditions.presenceOfElementLocated(xpath("/html/body/div/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/div[4]/div/div[1]/div/div/footer/div/button[2]")));
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        t.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);
        //t = (new WebDriverWait(driver, 80))
        Thread.sleep(50000);
    }



    @AfterEach
    void tearDown() throws Exception {
        //driver.close();
    }



    @Test
    void test() {

    }



}