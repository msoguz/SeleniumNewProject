package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_GetMethodlari {
    public static void main(String[] args) {
        /*
        Amazon sayfasina gidiniz,
        Arama kutusunu locate ediniz,
        Arama kutusunun tagName'inin input oldugunu test ediniz,
        Arama kutusunun name atributu'nun degerini field-keywords oldugunu test ediniz.
        Sayfayi kapatiniz
         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //        Amazon sayfasina gidiniz,
        driver.get("https://www.amazon.com");

        //        Arama kutusunu locate ediniz,
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));

        //        Arama kutusunun tagName'inin input oldugunu test ediniz,
        String expectedTagName="input";
        String actualTagName=aramaKutusu.getTagName();
        if(actualTagName.equals(expectedTagName)){
            System.out.println("Tagname testi PASSED : " + actualTagName);
        }else System.out.println("Tagname testi FAILED");

        //        Arama kutusunun name atributu'nun degerini field-keywords oldugunu test ediniz.
        String expectedAtributName="field-keywords";
        String actualAtributName=aramaKutusu.getAttribute("name");
        if(actualAtributName.equals(expectedAtributName)){
            System.out.println("Atribute testi PASSED");
        }else System.out.println("Atrunete testi FAILED");


        //        Sayfayi kapatiniz
        driver.close();
    }
}
