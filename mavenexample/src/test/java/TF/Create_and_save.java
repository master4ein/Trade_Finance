package TF;

//Создаем заявление на гарантию под оператором Крипто-про в статусе проект и сохраняем






import static org.junit.Assert.fail;
import static org.openqa.selenium.By.*;


import java.io.File;
import java.util.ArrayList;
import java.util.List;


import com.google.gson.internal.$Gson$Types;
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
import org.openqa.selenium.WebElement.*;

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
        WebElement element_cell;
        WebElement element;
        List<WebElement> element_list, element_list2;
        element_form = driver.findElement(tagName("form"));

        element_list = element_form.findElements(tagName("input"));
        element_list2 = element_form.findElements(tagName("select"));

        element = element_list.get(2);
        element.sendKeys("15012020");


        //№ соглашения/договора о выдаче гарантии(й)
        element = element_list.get(3);
        element.sendKeys("333");

        //Дата соглашения/договора о выдаче гарантии(й)
        element = element_list.get(4);
        element.sendKeys("15012020");

        //Вид гарантии *
        element = element_list2.get(0);
        element.findElement(ByTagName(By.className()));
        driver.findElement(tagName("select"));

        element.click();


        //  element.findElement(className("form-control custom-select is-invalid"));
       // element.findElement(name("advance")).click();


        //Гарантия обеспечивает обязательства в соответствии с: *
        driver.findElement(xpath("//*[@id=\"__BVID__303\"]/option[1]")).click();

        //Гарант*
        driver.findElement(xpath("//*[@id=\"__BVID__305\"]/option[2]")).click();

        //Бенефициар*
        //*[@id="__BVID__278"]/option[2]
        driver.findElement(xpath("//*[@id=\"__BVID__313\"]/option[4]")).click();

        //Сумма гарантии (цифрами) *
        element = driver.findElement(xpath("//*[@id=\"__BVID__320\"]"));
        element.sendKeys("202");

        //Валюта
        // driver.findElement(By.xpath("//*[@id=\"__BVID__287\"]/option[3]")).click();

        //Вступление гарантии в силу

        //Окончание срока действия гарантии
        element = driver.findElement(xpath("//*[@id=\"__BVID__328\"]"));
        element.sendKeys("31112099");

        //ОБЯЗАТЕЛЬСТВО, ИСПОЛНЕНИЕ КОТОРОГО ОБЕСПЕЧИВАЕТСЯ ГАРАНТИЕЙ
        //Номер договора
        element = driver.findElement(xpath("//*[@id=\"__BVID__330\"]"));
        element.sendKeys("777");
        //*[@id="__BVID__295"]

        //Дата*
        element = driver.findElement(xpath("//*[@id=\"__BVID__425\"]"));
        element.sendKeys("01012019");

        //Наименование договора:
        element = driver.findElement(xpath("//*[@id=\"__BVID__427\"]"));
        element.sendKeys("Договор_777");
        //*[@id="__BVID__392"]

        //Требование по гарантии должно быть представлено, начиная с
        element = driver.findElement(xpath("//*[@id=\"__BVID__349\"]"));
        element.sendKeys("Событие_777");

        //СРОК РАССМОТРЕНИЯ ТРЕБОВАНИЯ И ПРИЛОЖЕННЫХ К НЕМУ ДОКУМЕНТОВ
        element = driver.findElement(xpath("//*[@id=\"__BVID__351\"]"));
        element.sendKeys("7");

        //ПОДСУДНОСТЬ
        driver.findElement(xpath("//*[@id=\"__BVID__372\"]/option[2]")).click(); //*[@id="__BVID__339"]/option[2]
        t = (new WebDriverWait(driver, 10)).


                //Сохранить заявление

                        until(ExpectedConditions.presenceOfElementLocated(xpath("//*[@id=\"app\"]/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/form/div[68]/button[2]/span")));
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        t.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);
                t = (new WebDriverWait(driver, 80)).

                //Отправить на подпись
        until(ExpectedConditions.presenceOfElementLocated(xpath("//*[@id=\"app\"]/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/div[10]/button[4]/span")));
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        t.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);
        t = (new WebDriverWait(driver, 10)).

                //Подтвердить действие
          until(ExpectedConditions.presenceOfElementLocated(xpath("//*[@id=\"__BVID__586___BV_modal_footer_\"]/div/button[2]/span")));
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        t.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);
        Thread.sleep(80000);
        //t = (new WebDriverWait(driver, 1)).



        //*[@id="__BVID__585___BV_modal_footer_"]/div/button[2]/span
//*[@id="app"]/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/div[10]/button[4]/span

    }



    @AfterEach
    void tearDown() throws Exception {
        //driver.close();
    }



    @Test
    void test() {

    }



}