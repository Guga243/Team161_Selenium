package tests.day02_WebDriverOlusturmaVeKullanma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_IlkTestOtomasyonu {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
      //  1. testotomasyonu sayfasina gidelim. https://www.testotomasyonu.com/
       driver.get("https://www.testotomasyonu.com/");

      //  2. Sayfa basligini(title) yazdirin
        System.out.println(driver.getTitle());

        // 3. Sayfa basliginin “Test Otomasyonu” icerdigini test edin

        String expectedTitle ="Test Otomasyonu";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedTitle)){
            System.out.println("title test passed");
        }else {
            System.out.println("title test faild");
        }
        //  4. Sayfa adresini(url) yazdirin
        System.out.println(driver.getCurrentUrl());

        //  5. Sayfa url’inin https://testotomasyonu.com/ oldugunu test edin.
        String expectedUrl ="https://testotomasyonu.com/";
        String actualUrl = driver.getCurrentUrl();
        if (expectedUrl.equals(actualUrl)){
            System.out.println("URL test passed");
        }else {
            System.out.println("URL test faild");
        }
        /*
        BIR TESTER OLARAK BIZE DUSEN GOREV BIZE TESTIN PASSED OLMASINI SAGLAMAK DEGIL
        REQUAREMENTS'DA BELIRLENMIS SARTLARIN GERCEKLESIP GERCEKLESMEDIGINI TEST ETMEKTIR
        EGER UYGUN DEGILSE TEST FAIL OLMALIDIR BIZDE BUNU RAPORLAMALIYIZ

        BUG ILLA CALISMAYI ENGELLEYEN BIR HATA ALMAK ZIRUNDA DEGILDIR
        REQUIREMENTSA UYMAYAN HERSEYI BUG OLARAK RAPOR EDILIR

        BIZ RAPPOR ETTIKTEN SONRA REQUIRMENTSI HAZIRLAYAN DUZELTIR
        YA DEGISTIRILIR YADA ACTUAL SONUCUN REQUIRMENTS'A UYMASI SAGLANIR
         */

      //  6. Sayfa handle degerini yazdirin
        System.out.println(driver.getWindowHandle());

       // 7. Sayfa HTML kodlarinda “otomasyon” kelimesi gectigini test edin
        String expectedHTML ="otomasyon";
        String actualHTML = driver.getPageSource();

        if (actualHTML.contains(expectedHTML)){
            System.out.println("html test passed (otomasyon) ");
        }else {
            System.out.println("html test failed (otomasyon)");
        }

      //  8. Sayfayi kapatin.
        driver.quit();





    }
}
