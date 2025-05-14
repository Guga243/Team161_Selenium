package tests.day04_Locators_Xpath_SccSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_ByLinkText {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        // sayfaya git
        driver.get("https://www.automationexercise.com/");

        Thread.sleep(1500);

        // sayfada cookie cikarsa elle mudahale edip kabul edecegiz

        // sayfada 147 adet link bulunduguu test edin
        List<WebElement> linkElementleriList = driver.findElements(By.tagName("a"));

        int expectedLinkSayisi =147;
        int actualLinkSayisi = linkElementleriList.size();

        if (expectedLinkSayisi == actualLinkSayisi){
            System.out.println("link test passed");
        }else {
            System.out.println("link test failed");
        }

        // producta linkine tiklayin
      //  WebElement productWebElemet = driver.findElement(By.linkText(" Products"));
        // eger tum yaziyi yazmak istersek
        WebElement productWebelement = driver.findElement(By.partialLinkText("Products"));
        productWebelement.click();


        // special offer yazisinin gorunurlugunu test edin
        WebElement specilOfferYaziElementi = driver.findElement(By.id("sale_image"));
        if (specilOfferYaziElementi.isDisplayed()){
            System.out.println("yazi gorunur passed");
        }else {
            System.out.println("yazi gorunmuyor failed");
        }






        Thread.sleep(2500);
        driver.quit();


    }
}
