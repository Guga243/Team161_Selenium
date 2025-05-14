package tests.day03_WebElement_Locators;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_driverManageMethodlari {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.testotomasyonu.com/");
        // driver manage methodlari sayesinde driverin actigi browserin boyutlarini kontrol edebiliriz

        System.out.println("baslangicdeki boyut "+driver.manage().window().getSize()); // (1051, 798)
        System.out.println("baslangicdeki konum "+driver.manage().window().getPosition());

        driver.manage().window().setSize(new Dimension(500,500));

        Thread.sleep(5000);

        driver.manage().window().setPosition(new Point(100,100));

        System.out.println("duzeltmeden sonra boyut "+driver.manage().window().getSize()); // (1051, 798)
        System.out.println("duzeltmeden sonra konum "+driver.manage().window().getPosition());

        driver.manage().window().maximize(); // her test basinda tam ekran yapariz
        Thread.sleep(5000);
        driver.manage().window().fullscreen(); // tamami ile kapli
        Thread.sleep(5000);
        System.out.println("duzeltmeden sonra boyut "+driver.manage().window().getSize()); // (1051, 798)
        Thread.sleep(5000);
        System.out.println("duzeltmeden sonra konum "+driver.manage().window().getPosition());
        Thread.sleep(5000);


        driver.quit();
    }
}
