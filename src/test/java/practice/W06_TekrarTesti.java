package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class W06_TekrarTesti {
    public static void main(String[] args) {
        //1. Yeni bir class olusturun (TekrarTesti)
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını
        //doğrulayın (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.get("https://www.youtube.com");
        String actualTitle= driver.getTitle();
        String expectedTitle="youtube";
        if(expectedTitle.equals(actualTitle)){
            System.out.println("Title testi PASSED");
        }else System.out.println(actualTitle);

        //3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa
        //doğru URL'yi yazdırın.
        String actualUrl= driver.getCurrentUrl();
        String istenenKelime="youtube";
        if(actualUrl.contains(istenenKelime)){
            System.out.println("Url testi PASSED");
        }else System.out.println(actualUrl);

        //4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //5. Youtube sayfasina geri donun
        driver.navigate().back();

        //6. Sayfayi yenileyin
        driver.navigate().refresh();

        //7. Amazon sayfasina donun
        driver.navigate().forward();

        //8. Sayfayi tamsayfa yapin
        driver.manage().window().fullscreen();

        //9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın,
        //Yoksa doğru başlığı(Actual Title) yazdırın.
        String actualBaslik= driver.getTitle();
        String arananKelime="Amazon";
        if(actualBaslik.contains(arananKelime)){
            System.out.println("Sayfa Basligi testi PASSED");
        }else System.out.println(actualBaslik);

        //10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
        //URL'yi yazdırın
        String actualURL= driver.getCurrentUrl();
        String expectedURL="https://www.amazon.com/";
        if(expectedURL.equals(actualURL)){
            System.out.println("expectedURL testi PASSED");
        }else System.out.println(actualURL);

        //11.Sayfayi kapatin
        driver.close();
    }
}
