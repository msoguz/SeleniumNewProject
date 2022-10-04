package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W05_Homework {
    public static void main(String[] args) {
        //1.Yeni bir class olusturalim (Homework)
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
        //oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        driver.get("https://www.facebook.com");

        String actualTitleYazisi= driver.getTitle();
        String expectedTitle="facebook";
        if(expectedTitle.equals(actualTitleYazisi)){
            System.out.println(expectedTitle);
        }else System.out.println("Dogru baslik : " + actualTitleYazisi);


        //3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
        //yazdirin.
        String actualUrl= driver.getCurrentUrl();
        String istenenKelime="facebook";
        if(actualUrl.contains("facebook")){
            System.out.println("Url facebook iceriyor, test PASSED");
        }else System.out.println("Actuel Url : " + actualUrl);


        //4.https://www.walmart.com/ sayfasina gidin.
        driver.get("https://www.walmart.com/");

        //5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String actualTitle= driver.getTitle();
        String arananKelime="Walmart.com";
        if(actualTitle.contains(arananKelime)){
            System.out.println("Aranan Title testi PASSED");
        }else System.out.println("Aranan Title testi FAILED");

        //6. Tekrar “facebook” sayfasina donun
        driver.navigate().back();

        //7. Sayfayi yenileyin
        driver.navigate().refresh();

        //8.Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();

        //9.Browser’i kapatin
        driver.close();
    }
}
