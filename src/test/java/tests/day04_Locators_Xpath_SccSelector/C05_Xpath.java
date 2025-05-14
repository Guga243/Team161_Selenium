package tests.day04_Locators_Xpath_SccSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_Xpath {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        //1- adrese git
        driver.get("https://www.testotomasyonu.com/addremove");

        //2 add element butonuna basin
        WebElement addButonu = driver.findElement(By.xpath("//button[@id='sub-btn']"));
        addButonu.click();

        // 3 remove butinunun gorunur oldugunu test edin
        WebElement removeButonuIs = driver.findElement(By.xpath("//button[@class='remove-btn']"));
        System.out.println("remove butonu gorunur mu ? "+removeButonuIs.isDisplayed());

        //4 remove tusuna basin
        removeButonuIs.click();


        // 5 add / remove element yazisinin gorunur oldugunu test edin
        WebElement addRemoveYazisi = driver.findElement(By.xpath("//h2"));
        if (addRemoveYazisi.isDisplayed()){
            System.out.println("addRemove test is Passed");
        }else {
            System.out.println("addRemove test is Faild");
        }

        driver.quit();



    }
}
