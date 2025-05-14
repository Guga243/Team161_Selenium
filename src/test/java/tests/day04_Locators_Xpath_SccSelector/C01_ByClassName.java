package tests.day04_Locators_Xpath_SccSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.Locale;

public class C01_ByClassName {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        // testotomasyonuna gidin
        driver.get("https://www.testotomasyonu.com/");



        // phone icin arama yapin
        WebElement aramaKutusu = driver.findElement(By.className("search-input"));

        aramaKutusu.sendKeys("phone"+ Keys.ENTER);
        // aramaKutusu.submit();

        Thread.sleep(3000);

        // arama sonucu urun bulundu mu test edin
        WebElement aramaSonucuElementi = driver.findElement(By.className("product-count-text"));
        System.out.println(aramaSonucuElementi.getText()); // 4 Products Found
        // bu yazidan urunun bulunabildigini test edelim
        // gorunuyorsa 4 products olur yoksada 0 olur
        String unExpectedSonucYazisi = "0 Products Found";
        String actualSonucYazisi =aramaSonucuElementi.getText();

        if (actualSonucYazisi.equals(unExpectedSonucYazisi)){
            System.out.println("Test Faild");
        }else {
            System.out.println("Test Passed");
        }

        Thread.sleep(3000);


        // bulundugu urunun ilksine tiklayin
        //class atributi genel olarak ayni gorunen weblementleri gruplandirmak icin kullanilir'
        // bu durumda lacate unique olmaz\ o gornume sahip kac element varsa
        // hepsi isaret eder

        List<WebElement> bulunanUrunElementleriList = driver.findElements(By.className("prod-img"));
        bulunanUrunElementleriList.get(0).click();

        // by.classNmae locatory kullanirken yazdigimiz locate  "product-box my-2  py-1" space olmamasina
        // dikkat etmemiz gerekir eger bosluk varsa byclassname saglikli calismaz




        // acilan urun sayfasindeki urun aciklamisinda
        // case sensetive olmaksinizin "phone" bulundugunu test edin

        Thread.sleep(3100);
        //WebElement urunAciklamaElement = driver.findElement(By.className("prod-detail"));
        WebElement urunAciklamaElement = driver.findElement(By.xpath("//div[@class=' heading-sm mb-4']"));


        String expectedElementAciklama  = "phone";
        String actualElementAciklama = urunAciklamaElement.getText().toLowerCase(Locale.ROOT);
        // case sensetive olmamasi icin hepsjni kucuk veya buyuk harfe ceviririz

        if (actualElementAciklama.contains(expectedElementAciklama)){
            System.out.println("aciklama  testti passed");
        }else {
            System.out.println("aciklama testi faild");
        }

        Thread.sleep(3000);



        // sayfayi kapain
        driver.quit();
    }
}
