package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class W03_ManageWindow {
    public static void main(String[] args) throws InterruptedException {

        //1. Yeni bir Class olusturalim.C06_ManageWindow
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //2. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //3. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Sayfa konumu : " + driver.manage().window().getPosition());
        System.out.println("Sayfa boyutlari : "+driver.manage().window().getSize());


        //4. Sayfayi simge durumuna getirin
        driver.manage().window().minimize();

        //5. simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Thread.sleep(3000);
        driver.manage().window().maximize();

        //6. Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        System.out.println("Sayfanin max konumu : " +driver.manage().window().getPosition());
        System.out.println("Sayfa max boyutlari : "+driver.manage().window().getSize());

        //7. Sayfayi fullscreen yapin
        driver.manage().window().fullscreen();

        //8. Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println("Sayfanin fullsecreen konumu : " +driver.manage().window().getPosition());
        System.out.println("Sayfa fullsecreen boyutlari : "+driver.manage().window().getSize());

        //9. Sayfayi kapatin
        driver.close();
    }
}
