package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W11_TekrarTesti {
    public static void main(String[] args) {
        //1-C01_TekrarTesti isimli bir class olusturun
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //2- https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/ ");

        //3- Browseri tam sayfa yapin
        driver.manage().window().fullscreen();

        //4- Sayfayi “refresh” yapin
        driver.navigate().refresh();

        //5 Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String actualTitle=driver.getTitle();
        String arananKelime="Spend less";
        if(actualTitle.contains("Spend less")){
            System.out.println("title testi PASSED");
        }else System.out.println("title testi FAILED");


        //6 Gift Cards sekmesine basin
        driver.findElement(By.linkText("Gift Cards")).click();

        //7 Birthday butonuna basin
        driver.findElement(By.xpath("//img[@alt='Birthday gift cards']")).click();

        //8 Best Seller bolumunden ilk urunu tiklayin
        driver.findElement(By.xpath("(//img[@alt='Amazon.com eGift Card'])[1]")).click();

        //9- Gift card details’den 25 $’i secin
        driver.findElement(By.xpath("(//button[@id='gc-mini-picker-amount-1'])[1]")).click();

        //10-Urun ucretinin 25$ oldugunu test edin
        WebElement ucretTesti= driver.findElement(By.xpath("//span[@id='gc-live-preview-amount']"));
        if(ucretTesti.isDisplayed()){
            System.out.println("ucret testi PASSED");
        }else System.out.println("Ucret testi FAILED");

        //10-Sayfayi kapatin
        driver.close();
    }
}
