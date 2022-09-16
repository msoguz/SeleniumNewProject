package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_HomeWork {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

       // Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");
       // Sayfa basligini(title) yazdirin
        System.out.println("Sayfa Basligi : " + driver.getTitle());

       // Sayfa basliginin "Amazon" icerdigini test edin
        String actualTitle= driver.getTitle();
        String istenenKelime="Amazon";
        if(actualTitle.contains(istenenKelime)){
            System.out.println("Title testi PASS");
        }else System.out.println("Title testi FAILED");

       // Sayfa adresini(url) yazdirin
        System.out.println("Sayfanin Url'i : " + driver.getCurrentUrl());

       // Sayfa url'inin "amazon" icerdigini test edin.
        String actualUrl=driver.getCurrentUrl();
        String arananKelime="amazon";
        if(actualUrl.contains(arananKelime)){
            System.out.println("Url Testi PASS");
        }else System.out.println("Url Testi FAILED");

       // Sayfa handle degerini yazdirin
        System.out.println(driver.getWindowHandle());

       // Sayfa HTML kodlarinda "Gateway" kelimesi gectigini test edin
        String actualPageSource=driver.getCurrentUrl();
        String htmlArananKelime="Gateway";
        if(actualUrl.contains(arananKelime)){
            System.out.println("Sourcecode Testi PASS");
        }else System.out.println("Sourcecode Testi FAILED");
       //Sayfayi kapatin.
        driver.close();
    }
}
