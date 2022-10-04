package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P01_FirstClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("");
        driver.getCurrentUrl();
        driver.manage().window().maximize();
        driver.getTitle();

        driver.getPageSource();
        driver.getWindowHandle();
        driver.navigate();
        driver.close();
        driver.quit();




    }
}
