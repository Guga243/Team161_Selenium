package tests.day03_WebElement_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_MahserinUcAtlisi {
    public static void main(String[] args) {

        // otomasyon icin bir class olusturdugumuzda ilk yapmamiz gereken
        // 1- WewbDriver objesi olusturmak ve gerekli ayarlari yapmaktir
        // biz bu islem icin 3 satir kod yazacagiz bunu mahserin 3 atlisi olarak adlandiriyoruz

      //   WebDriverManager.chromedriver().sertup(); eger sirket isterse

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // implicitlywait bilgisayar ve internet veya baglandigimiz web sayfanin serverindeki yavasliklari
        // tolere eder
        // yazdigimiz 10 saniye tolere edecegi 10 saniye max suredir

        // thred.sleep de bekleme yapar  ama kullanisli  degildir


    }
}
