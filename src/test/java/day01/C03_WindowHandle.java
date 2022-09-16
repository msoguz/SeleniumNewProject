package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_WindowHandle {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");

        driver.manage().window().maximize();
        System.out.println(driver.getWindowHandle());//CDwindow-45B8094BC8FD1E6D41BD5BA864FBB75B
        //Farkli pencereler arasinda gezinebilmek icin getWindowHandle() method'unu kullaniriz.

    }
}
