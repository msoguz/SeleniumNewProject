package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class W09_Homework {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

//2- Add Element butonuna basin
        driver.findElement(By.xpath("//*[text()='Add Element']")).click();

//3 Delete butonu’nun gorunur oldugunu test edin
       WebElement deleteButton= driver.findElement(By.xpath("//button[text()='Delete']"));
       if(deleteButton.isDisplayed()){
           System.out.println("Delete Button testi PASSED");
       }else System.out.println("Delete Button testi FAILED");

//4 Delete tusuna basin
        deleteButton.click();
//5 “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement text=driver.findElement(By.xpath("//h3"));
        if(text.isDisplayed()){
            System.out.println("text testi PASSED");
        }else System.out.println("text testi FAILED");

    }
}
