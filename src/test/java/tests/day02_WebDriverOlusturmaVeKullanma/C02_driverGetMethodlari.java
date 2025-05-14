package tests.day02_WebDriverOlusturmaVeKullanma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_driverGetMethodlari {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.testotomasyonu.com");
        System.out.println(driver.getTitle()); // Test Otomasyonu - Test Otomasyonu

        System.out.println(driver.getCurrentUrl()); // https://www.testotomasyonu.com/

      //  System.out.println(driver.getPageSource()); // web'in htlm kodlarini getirir

        System.out.println(driver.getWindowHandle()); // 7E3DAAB02F4ED36536D04B1C394C81FE (HERDEFA FAZRKLI)

        System.out.println(driver.getWindowHandles()); // [7E3DAAB02F4ED36536D04B1C394C81FE (HERDEFA FAZRKLI)

        // SELENIUM BIRLGISAYARDA WAR OLAN BROWSERLARI DEGIL KENDI OLUSTURDUGU KOPYA BROWSER'LARI KULLANIR
        // HER OLUSTURDUGU KOPYA BROWSER'A DA UNIQE HANDLE DEGERI ATAMA YAPAR

        // EGER TEST SIRASINDA SADECE BIR WINDOW ACILDIYSA IKISIDE AYNNI DEGERI GETIRIR
        // BIRI DEGERI GETIRIRKEN DIGERI [] ICINDE GETIRIR
        //getWindowHandle()
        // // getWindowHandles()


        // EGER TEST SIRASINDE BIRDEN FAZLA WINDOW ACILDIYSA IKIISDE FARKLI DEGER GETIRIR
        //getWindowHandle()
       // getWindowHandles() TUM WINDOWLARIN HENDLE DEGERLERINI SET OLARAK GETIRIR

        // WINDOWHANDLE DEGERI TEST SIRASINDA BIRDEN FAZLA WINDOW ACILDIGINDA BU WINDOW'LAR
        // ARASINDA GECIS ICIN KULLANILIR


        Thread.sleep(3000);
        driver.quit();
    }
}
