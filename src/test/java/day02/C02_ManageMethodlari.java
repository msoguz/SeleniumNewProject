package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_ManageMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");
        // Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Pencere Konumu : " + driver.manage().window().getPosition());//Acilan browser'in konumunu verir
        System.out.println("Pencere olculer : " + driver.manage().window().getSize()); //Acilan browser'in olculerini verir.
        //Sayfayi simge durumuna getirin
        driver.manage().window().minimize();

        //simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Thread.sleep(3000);
        driver.manage().window().maximize();

        //Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        System.out.println("Yeni Pencere Konumu : " + driver.manage().window().getPosition());
        System.out.println("Yeni pencere olculeri : " +driver.manage().window().getSize());
        Thread.sleep(3000);
        //Sayfayi fullscreen yapin
        driver.manage().window().fullscreen();
        //Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println("Fullscreen pencere konumu : " + driver.manage().window().getPosition());
        System.out.println("Fullscreen Pencere olculeri:" + driver.manage().window().getSize());
        Thread.sleep(3000);
        //Sayfayi kapatin
        driver.close();
    }
}
