package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class W12_RelativeLocators {
    public static void main(String[] args) {

        //Class Work: Relative Locators
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //1) https://www.diemol.com/selenium-4-demo/relative-locators-demo.html adresine gidin
        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");

        //2) Berlin’i 3 farkli relative locator ile locate edin 3
        WebElement NYC= driver.findElement(By.id("pid3_thumb"));
        WebElement sailor= driver.findElement(By.id("pid11_thumb"));
        WebElement boston= driver.findElement(By.id("pid6_thumb"));

        WebElement berlin= driver.findElement(RelativeLocator.with(By.tagName("img")).above(sailor).below(NYC).toRightOf(boston));

        //) Relative locator’larin dogru calistigini test edin
        berlin.click();

    }
}
