package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_SinifCalismasi {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // Main method oluşturun ve aşağıdaki görevi tamamlayın.
        //        a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");
        //        b. Sign in butonuna basin
        driver.findElement(By.linkText("Sign in")).click();


        //        c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        WebElement emailTextbox=driver.findElement(By.id("session_email"));
        WebElement password=driver.findElement(By.id("session_password"));
        WebElement signin=driver.findElement(By.name("commit"));


        //        d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        //        i. Username : testtechproed@gmail.com
        //        ii. Password : Test1234!
        emailTextbox.sendKeys("testtechproed@gmail.com");
        password.sendKeys("Test1234!");
        signin.click();

        //        e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        //******************** I. YOL  ******************************"

        WebElement expectedUser= driver.findElement(By.className("navbar-text"));
        if(expectedUser.isDisplayed()){
            System.out.println("ExpectedUser testi PASSED " + expectedUser.getText());
        }else{
            System.out.println("ExpectedUser testi FAILED");
        }
        //TODO : Bir webelementin uzerindeki yaziyi consolda gorebilmek icin getText() methodu kullanilir.
        //-----

        //********************** II. YOL   *******************************

        String istenenUserYazisi="testtechproed@gmail.com";
        String actualUserYazisi=expectedUser.getText();
        if(actualUserYazisi.equals(istenenUserYazisi)){
            System.out.println("TEST PASSED");
        }else{
            System.out.println("TEST FAILED");
        }




        //        f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        WebElement addresses=driver.findElement(By.linkText("Addresses"));
        WebElement signOut=driver.findElement(By.linkText("Sign out"));
        if(addresses.isDisplayed()){
            System.out.println("Addresses testi PASSED");
        }else{
            System.out.println("Addresses testi FAILED");
        }
        if(signOut.isDisplayed()){
            System.out.println("signOut testi PASSED");
        }else{
            System.out.println("signOut testi FAILED");
        }
        //        3. Sayfada kac tane link oldugunu bulun.
        List<WebElement> linklerListesi = driver.findElements(By.tagName("a"));
        System.out.println("linklerin sayisi : "+ linklerListesi.size());
        System.out.println(linklerListesi);

        //        4. Linkleri yazdiriniz
        for (WebElement each:linklerListesi) {
        System.out.println("Linkler listesi : " + each.getText());

        }
        //        5. Linkleri lambda ile yazdiriniz
        linklerListesi.forEach(t-> System.out.println(t.getText()));

        //        6. Sayfayi kapatiniz
        driver.close();
    }
}
