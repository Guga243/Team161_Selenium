package tests.day04_Locators_Xpath_SccSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_ByClassName {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();


        // adrese git
        driver.get("https://www.testotomasyonu.com/");

        WebElement aramaKutusu = driver.findElement(By.id("global-search"));
        aramaKutusu.sendKeys("phone"+ Keys.ENTER);



        List<WebElement> categoriElementList = driver.findElements(By.className("panel-list"));
        int expectedCategorySayisi =8;
        int actualCategorySayisi = categoriElementList.size();
        if (expectedCategorySayisi == actualCategorySayisi){
            System.out.println("category test passed");
        }else {
            System.out.println("category test faild");
        }

        // System.out.println(categoriElementList);
        // catagory webelemnt oldugu icin direk yazdirlamaz

        // bir for each loop ile herbir webelementi ele alip, ustundeki yaziyi yazdiralim
        for (WebElement each:categoriElementList){
            System.out.println(each.getText());
        }

        Thread.sleep(3000);
        driver.quit();

    }
}
