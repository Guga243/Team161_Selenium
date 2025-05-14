package tests.day03_WebElement_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_WebElement {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // test oomasyonu ana sayfaya gidin
        driver.get("https://www.testotomasyonu.com/");


        // arama kutusuna phoee yazip aratin
        WebElement aramaKutusu = driver.findElement(By.id("global-search"));
        aramaKutusu.sendKeys("phone");
        aramaKutusu.submit();
        Thread.sleep(3000);
        // id genelde unique olur



        // arama sonucunda urun buluna bildigini test edin ve sayfayi kapatin
        WebElement aramaSonucElementi = driver.findElement(By.className("product-count-text"));
        // webelement'i
        System.out.println(aramaSonucElementi.getText()); // 4 Products Found

        // bu yazidan urunun bulunabildigini test edelim
        // gorunuyorsa 4 products olur yoksada 0 olur
        String unExpectedSonucYazisi = "0 Products Found";
        String actualSonucYazisi =aramaSonucElementi.getText();

        if (actualSonucYazisi.equals(unExpectedSonucYazisi)){
            System.out.println("Test Faild");
        }else {
            System.out.println("Test Passed");
        }


        driver.quit();




    }
}
