package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_CssSelector {
    public static void main(String[] args) throws InterruptedException {
        //1. Bir class oluşturun : Locators_css
        //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
        driver.get("http://a.testaddressbook.com/sign_in");

        //b. Locate email textbox
        Thread.sleep(2000);
        WebElement emailtextBox= driver.findElement(By.cssSelector(".form-control"));
        emailtextBox.sendKeys("testtechproed@gmail.com");

        //c. Locate password textbox ve
        Thread.sleep(2000);
        // WebElement passwordTextBox= driver.findElement(By.cssSelector("input[id='session_password']"));
        //Css ile uzun sekilde yazilis
        WebElement passwordTextBox= driver.findElement(By.cssSelector("#session_password"));
        //Css ile kisa sekilde yazilis
        // WebElement passwordTextBox=driver.findElement(By.xpath("(//input[@class='form-control'])[2]"));
        //Xpath ile yazilis
        passwordTextBox.sendKeys("Test1234!");

        //d. Locate signin button
        WebElement signinButtonu= driver.findElement(By.cssSelector("input[type='submit']")); // css ile
        //WebElement signinButtonu= driver.findElement(By.xpath("//input[@type='submit']")); //xpath ile
        signinButtonu.click();

        //e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
        //i. Username : testtechproed@gmail.com
        //ii. Password : Test1234!
        //NOT: cssSelector kullanarak elementleri locate ediniz.
    }
}
