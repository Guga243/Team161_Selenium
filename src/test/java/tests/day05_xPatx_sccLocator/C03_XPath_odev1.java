package tests.day05_xPatx_sccLocator;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class C03_XPath_odev1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        //1- adrese git
        driver.get("https://www.saucedemo.com");

        //2- username kutusuna standard_user yazin
        WebElement userKutusu = driver.findElement(By.xpath("//*[@*='user-name']"));
        WebElement paswordKutusu = driver.findElement(By.xpath("//input[@id='password']"));

        //3- pasword kutusuna secret_source yazin
        userKutusu.sendKeys("standard_user");
                paswordKutusu.sendKeys("secret_sauce");

        //4- login butonuna basin
        WebElement loginButton = driver.findElement(By.xpath("//*[@*='login-button']"));
        loginButton.click();
        Thread.sleep(3000);




        //5- ilk urun ismini kaydedin ve o urun sayfasina gidin
        WebElement urunIsmi = driver.findElement(By.xpath("//*[text()='Sauce Labs Backpack']"));
        System.out.println(urunIsmi.getText());
        urunIsmi.click();
        Thread.sleep(4000);

        //6- add to cart butonuna basin
        WebElement addToCartButton = driver.findElement(By.xpath("//*[@id='add-to-cart']"));
        addToCartButton.click();

        //alisveris sepetine tiklayin
        WebElement shoppingSepet = driver.findElement(By.xpath("//*[@*='shopping_cart_badge']"));
        shoppingSepet.click();

        //sectigimiz urunun sepete basarili sekilde eklendigini test edin
        WebElement eklenenUrunIsmi = driver.findElement(By.xpath("//*[text()='Sauce Labs Backpack']"));
        String expetcedUrunElement = "Sauce Labs Backpack";
        String actualUrunElement = eklenenUrunIsmi.getText();

        if (actualUrunElement.equals(expetcedUrunElement)){
            System.out.println("urun basarili sekilde eklendi, test passed");
        }else {
            System.out.println("urun ekleme test faild");
        }

        driver.quit();


         /* ornek-2
         
        https://babayigit.net/test adresine gidip adres çubuğuna
        1-Vizontele aratıp sonuç sayısını yazdırın
        2-12 Angry men aratıp sonuç sayısını yazdırın
        3-Saving Private Ryan aratıp sonuç sayısını yazdırın
        4-3 Idiots aratıp sonuç sayısını yazdırın

        */




    }
}
