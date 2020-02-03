package TEST_AUTOMATION;

//Создание гарнтии на основе созданной

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

import static org.openqa.selenium.By.tagName;
import static org.openqa.selenium.By.xpath;

public class S5_Сreation_of_a_guarantee_based {

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
        t = (new WebDriverWait(driver, 120)).
        //t = (new WebDriverWait(driver, 10));

        //Перейти в созданную гарантию(статус "На подпись")               /html/body/div/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/div[2]/table/tbody/tr[1]/td[9]
                until(ExpectedConditions.presenceOfElementLocated(xpath("/html/body/div/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/div[2]/table/tbody/tr[1]/td[9]")));
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        //t.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);
        t = (new WebDriverWait(driver, 50)).


                //Создать на основе
                        until(ExpectedConditions.presenceOfElementLocated(xpath("/html/body/div/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/div[10]/button[2]/span")));
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        //t.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);
        t = (new WebDriverWait(driver, 10)).


                //Подтвердить действие "Да"                                         ///html/body/div/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/div[3]/div/div[1]/div/div/footer/div/button[2]
                        until(ExpectedConditions.presenceOfElementLocated(xpath("/html/body/div/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/div[9]/div/div[1]/div/div/footer/div/button[2]")));
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        //t.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);
        t = (new WebDriverWait(driver, 10)).

                //Предполагаемая дата выдачи

                                                                    ///html/body/div/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/form/div[4]/div[2]/input
        until(ExpectedConditions.presenceOfElementLocated(xpath("//html/body/div/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/form/div[4]/div[2]/input")));
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        t.sendKeys("01012021");
        //((JavascriptExecutor) driver).executeScript("arguments[0].sendKeys(01012021)", t);
        t = (new WebDriverWait(driver, 10)).



                //Дата соглашения/договора о выдаче гарантии(й)
                      until(ExpectedConditions.presenceOfElementLocated(xpath("/html/body/div/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/form/div[6]/div[2]/input")));
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        t.sendKeys("01012021");
        //((JavascriptExecutor) driver).executeScript("arguments[0].sendKeys(01012020)", t);
        t = (new WebDriverWait(driver, 10)).


                //Сумма гарантии цифрами                                        /html/body/div/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/form/div[14]/div[2]/input
                        until(ExpectedConditions.presenceOfElementLocated(xpath("/html/body/div/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/form/div[6]/div[2]/input")));
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        t.sendKeys("5");
        //((JavascriptExecutor) driver).executeScript("arguments[0].sendKeys(01012020)", t);
        t = (new WebDriverWait(driver, 10)).


                //Окончание срока действия гарантии


                until(ExpectedConditions.presenceOfElementLocated(xpath("/html/body/div/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/form/div[19]/div[2]/input")));
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        t.sendKeys("01012021");
       // ((JavascriptExecutor) driver).executeScript("arguments[0].sendKeys(01012021)", t);
        t = (new WebDriverWait(driver, 10)).

                //Сохранить заявление

                        until(ExpectedConditions.presenceOfElementLocated(xpath("/html/body/div/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/form/div[68]/button[2]")));
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        //t.sendKeys("01012021");
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);
        t = (new WebDriverWait(driver, 120)).

                   //Отправить на подпись
                                                                                    ///html/body/div/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/div[10]/button[4]
                        until(ExpectedConditions.presenceOfElementLocated(xpath("/html/body/div/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/div[10]/button[4]")));
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
       //t.sendKeys("01012021");
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);
        t = (new WebDriverWait(driver, 10)).

            //Подтвердить действие
                    until(ExpectedConditions.presenceOfElementLocated(xpath("/html/body/div/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/div[4]/div/div[1]/div/div/footer/div/button[2]")));
        System.out.println(t);
        System.out.println(t.isEnabled());
        System.out.println(t.isDisplayed());
        System.out.println(t.getText());
        //t.sendKeys("01012021");
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", t);
        //t = (new WebDriverWait(driver, 10)).
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
