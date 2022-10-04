package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class W08_AmazonSearchTest {
    public static void main(String[] args) {
        //1. Bir class oluşturun : AmazonSearchTest
        //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //a.web sayfasına gidin. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //b. Search(ara) “city bike”
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike", Keys.ENTER);

        //c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        WebElement sonucYazisi= driver.findElement(By.xpath("//*[text()='1-16 of 116 results for']"));
        System.out.println(sonucYazisi.getText());

        //d. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
        driver.findElement(By.xpath("(//img[@class='s-image'])[1]")).click();
    }
}
