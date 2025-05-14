package tests.day05_xPatx_sccLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class C02_XPath {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        //1- adrese gidin
        driver.get("https://www.testotomasyonu.com/");

        //2- browseri tam sayfa yapin
        driver.manage().window().maximize();

        //3- sayfayi "refresh yapin
        driver.navigate().refresh();


        //4-sayfa basliginin "test otomasyonu" ifadesini icerdigini test edin
        String expectedTitle ="Test Otomasyonu";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)){
            System.out.println("title test passed");
        }else {
            System.out.println("title test faild");
        }

        //5- furniture linkine tiklayin
        WebElement furnutareLink = driver.findElement(By.xpath("(//a[text()='Furniture'])[3]"));
        furnutareLink.click();

        // driver objesi ekranda gorunmeyen bir html webelementi kullanabilir mi? kesin cevap yok
        // bazi websayfalarinda olurken bazilarinda olmaz
        // bunun icin kullanacakmis gibi dusunup kodu yazmaliyiz
        // eger herseyi dogru yaptigiiz halde kod calismiyorsa driverin gorunmeyen elemani kullanamadigimi
        // nalariz ve asagdeki kodu yazarak once sayfanin asagi inmesini saglariz

        Actions actions = new Actions(driver);
       actions.sendKeys(Keys.PAGE_DOWN).perform();
       actions.sendKeys(Keys.PAGE_DOWN).perform();







        //6- price range filtresine min degere 40 max degere 200 yazip filtreleyin
        WebElement minPrice = driver.findElement(By.xpath("//input[@class='form-control minPrice']"));
        WebElement maxPrice = driver.findElement(By.xpath("//input[@class='form-control maxPrice']"));

        // min ve max kutularina sayi gonderdigimizde kutuda var olan 0'in sonuna eklendigini gorduk
        // once o 0'i silelim
        minPrice.clear();
        maxPrice.clear();

        minPrice.sendKeys("40");
        maxPrice.sendKeys("200");

        driver.findElement(By.xpath("//*[@*='price-range-button']")).click();

        //7 filtreme sonucunda urun bulunabildigini test edin
        WebElement filtreSonucElement = driver.findElement(By.xpath("//span[@class='product-count-text']"));

        String unExpectedFiltreSonuc = "0 Product Found";
        String actualFiltreSonuc = filtreSonucElement.getText();

        if (actualTitle.equals(unExpectedFiltreSonuc)){
            System.out.println("filtreSonuc test failed");
        }else {
            System.out.println("filtreSonuc test Passed");
        }

        //8 ilk urune tiklayin
        driver.findElement(By.xpath("(//img[@class='lazy'])[1]")).click();


        //9- urun fiyatinin 40 ile 200 arasinda oldugunu test edin
        WebElement fiyatAralikElemet = driver.findElement(By.xpath("//*[@*='priceproduct']"));
       // System.out.println(fiyatAralikElemet.getText()); // $50.00
        // fiyatin hangi formatta geldigini gormek icin yazdirdik
        // string olarak $ arasinda . ile geldigini gorduk
        // once bunu mat olarak karsilastirabilir hale getirmeliyiz'

        // once dolardan kurtulalim
        String urunFiyatiStr = fiyatAralikElemet.getText(); //$50.00
        Thread.sleep(2000);
       urunFiyatiStr = urunFiyatiStr.replace("$","");

       double urunFiyati = Double.parseDouble(urunFiyatiStr);  // 50.00

        if (urunFiyati>=40 && urunFiyati<=200){
            System.out.println("urun fiyati test passed");
        }else {
            System.out.println("urun fiyati test faild");
        }






        Thread.sleep(3000);
        driver.quit();


    }
}
