package tests.day02_WebDriverOlusturmaVeKullanma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkOtomasyon {
    public static void main(String[] args) throws InterruptedException {

        /*
        selenium ile test otomasyonu yapmak icin elimiz ve gozumuz ile yapacagimiz
        klave ve maus kullanarak yaptigimiz cogu islemi

        bizim yerimize Selenium Webdriver objesi yapar

        bir test otomasyonu yapmak istedigimizde ilk
        yapmamiz gereken bir verdriver objesi edinmektir

         */

        // WebDriver driver = new WebDriver();
        // webdriver bir interfacedir ve direkt olarak obje olusturulamaz
        // obje olusturmak icin child classlarinin constructoru kullanilabilir

        WebDriver driver = new ChromeDriver();
        // yazdigimiz url'e goturur
        driver.get("https://www.testotomasyonu.com");

        Thread.sleep(3000);


        driver.close(); // test sirasinda birden fazla window acilirsa sadece
        // son kullandigini kapatir\ oncekiler acik kalir sadece bir window aciliyorsa sorunyok


        driver.quit(); // birden fazla window acilirsa kendi actigi tum windowlari kapatir

        /*
        notlar;
        1- consolda gorulen her kirmizi yazi javada ki gibi hata anlamina gelmez
        0 yazisi varsa kod sorunsuzdur

        2- webdriver olustursak ama objeyi hic kullanmazsak ne olur
        Selenium bos bir browser olusturur ve emirleri bekler

        3- selenium bilgisayardeki browseri degil var olan browserin selenium tarafindan
        olusturulan kopyasini kullanir

        4- url adresi yazarken www kullanmazsak?
        da driver istenen url'e gider ammaa https yazilmazsa kod calismaz

        5- oluturulan driver objesi gorevi bitirdiginde kapatilmalidir

        6- otomasyonla calistirilan testlerin mumkun oldugunca kisa surede bitmesi
        // tercih edilir, ancak test adimlarinizi gormek veya bir sunum sirasinda
        // test adimlarinizi gostermemk isterseniz kodlari tread.sleep() ile
        belirli bir sure bekletebilirsiniz

        7- test uzerinde ilk calisirken veya sunum yaparken koyacagimiz Thread.sleep'leri
        calismamiz bittiginde silmek mantiklidir\ zaman bos gitmesin

        compile time exeption verir ya throws kullaniriz yada try catch ile exeptionu handle etmeliyiz
         */
    }
}
