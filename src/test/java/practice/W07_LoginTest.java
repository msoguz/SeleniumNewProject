package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class W07_LoginTest {
    public static void main(String[] args) {
        //1. Bir class oluşturun: LoginTest
        //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");

        //b. Sign in butonuna basin
        driver.findElement(By.xpath("//*[text()='Sign in']")).click();

        //c. email textbox, password textbox, and signin button elementlerini locate ediniz..
        WebElement emailTextBox=driver.findElement(By.id("session_email"));
        WebElement passwordTextBox=driver.findElement(By.id("session_password"));
        WebElement signInButton=driver.findElement(By.xpath("//*[@class='btn btn-primary']"));


        //d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        //i. Username : testtechproed@gmail.com
        //ii. Password : Test1234!
        emailTextBox.sendKeys("testtechproed@gmail.com");
        passwordTextBox.sendKeys("Test1234!");
        signInButton.click();

        //e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        String expectedUserId="testtechproed@gmail.com";
        WebElement actualUserId=driver.findElement(By.xpath("//*[@class='navbar-text']"));
        if(actualUserId.equals(expectedUserId)){
            System.out.println("User id testi PASSED");
        }else System.out.println(actualUserId.getText());

        //f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        WebElement addressesTexti= driver.findElement(By.xpath("//*[text()='Addresses']"));
        if(addressesTexti.isDisplayed()){
            System.out.println("addressesText testi PASSED");
        }else System.out.println("addressesText testi FAILED");

        WebElement signOutTexti=driver.findElement(By.xpath("//*[text()='Sign out']"));
        if(signOutTexti.isDisplayed()){
            System.out.println("signOutText testi PASSED");
        }else System.out.println("signOutText testi FAILED");

        //3. Sayfada kac tane link oldugunu bulun
        List<WebElement> linkSayisi=driver.findElements(By.tagName("a"));
        System.out.println("link sayisi : " + linkSayisi.size());
    }
}
