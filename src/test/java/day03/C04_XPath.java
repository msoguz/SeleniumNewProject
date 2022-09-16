package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_XPath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        // Add Element butonuna basin
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[text()='Add Element']")).click();

        //Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButonu = driver.findElement(By.xpath("//*[@class='added-manually']"));

        if (deleteButonu.isDisplayed()) {
            System.out.println("Test PASSED");
        } else{
            System.out.println("Test FAILED");

    }
        //Delete tusuna basin
        // “Add/Remove Elements” yazisinin gorunur oldugunu test edin




    }
}
