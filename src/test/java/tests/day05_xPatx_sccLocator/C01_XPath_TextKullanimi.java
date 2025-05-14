package tests.day05_xPatx_sccLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_XPath_TextKullanimi {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();


        //1- adrese git
        driver.get("https://testotomasyonu.com/addremove/");

        //2-ADD ekement butona tilayin
        driver.findElement(By.xpath("//button[text()='Add']")).click();
        // eger tag onemli degil yazisi "add" olsun istersek button yerine * yazilabilir

        //3- remove butonunun gorunurlugunu test edin
        WebElement removeButtonIsD = driver.findElement(By.xpath("//button[text()='Remove']"));
        if (removeButtonIsD.isDisplayed()){
            System.out.println("remove test passed");
        }else {
            System.out.println("temove test faild");
        }

        //4- remove tusuna basin
        removeButtonIsD.click();

        // 5- add/remove elements yazisinin gorunurlugunu test edin
        WebElement addRemoveYazisi = driver.findElement(By.xpath("//h2[text()='Add/Remove Elements']"));
        if (addRemoveYazisi.isDisplayed()){
            System.out.println("add/remove test passed");
        }else {
            System.out.println("add/remove test failed");
        }




        Thread.sleep(2000);
        driver.quit();

    }
}
