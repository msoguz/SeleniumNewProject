package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class W01_GetMethods {
    public static void main(String[] args) throws InterruptedException {
        //1. Yeni bir package olusturalim : day01
        //2. Yeni bir class olusturalim : C03_GetMethods
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //3. Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //4. Sayfa basligini(title) yazdirin
        System.out.println("Sayfa Basligi : " +driver.getTitle());

        //5. Sayfa basliginin “Amazon” icerdigini test edin
        String actualTitle=driver.getTitle();
        String expectedTitle="Amazon";
        if(actualTitle.contains(expectedTitle)){
            System.out.println("title testi PASSED");
        }else System.out.println("Title testi FAILED");

        //6. Sayfa adresini(url) yazdirin
        System.out.println("Sayfa Url'i : " + driver.getCurrentUrl());

        //7. Sayfa url’inin “amazon” icerdigini test edin.
        String actualUrl= driver.getCurrentUrl();
        String expectedUrl="amazon";
        if(actualUrl.contains(expectedUrl)){
            System.out.println("Url Testi PASSED");
        }else System.out.println("Url testi FAILED");

        //8. Sayfa handle degerini yazdirin
        System.out.println(driver.getWindowHandle());

        //9. Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        String istenenKelime="Gateway";
        if(driver.getPageSource().contains(istenenKelime)){
            System.out.println("PageSource testi PASSED");
        }else System.out.println("PageSource testi FAILED");

        //10. Sayfayi kapatin.
        Thread.sleep(3000);
        driver.close();
    }
}
