package tests.day02_WebDriverOlusturmaVeKullanma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverNevigateMethodlari {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        // testotomasyonu sayfaya gidin
        driver.get("https://www.testotomasyonu.com/");

        // wisequrter ana sayfaya gidin
        driver.navigate().to("https://www.wisequarter.com/");

        // tekrar testotomasyonu sayfaya geri donun
        driver.navigate().back();


        // yeniden wisequrter ana sayfaya gidin
        driver.navigate().forward();


        // kapat
        driver.quit();

    }
}
