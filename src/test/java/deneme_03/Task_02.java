package deneme_03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Task_02 {
    public static void main(String[] args) throws InterruptedException {
        //https://id.heroku.com/login sayfasina gidin
//Bir mail adersi giriniz
//Bir password giriniz
//Login butonuna tiklayiniz
//"There was a problem with your login." texti gorunur ise
//"kayit yapilamadi" yazdiriniz
//eger yazi gorunur degilse "kayit yapildi" yazdiriniz
//sayfayı kapatiniz

        System.setProperty("chromedriver","src/recources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://id.heroku.com/login");

        driver.findElement(By.xpath("//*[@class='form-control']")).sendKeys("hakanyilmazhy1987@gmail.com",Keys.TAB,"hhhh", Keys.TAB,Keys.ENTER);

        String actualText = driver.getPageSource();
        String expectedText = "There was a problem with your login";
        if (actualText.contains(expectedText)){
            System.out.println("Kayıt yapılamadı");
        }else {
            System.out.println("Kayıt yapıldı");
        }
        Thread.sleep(3000);
        //sayfayı kapatiniz
        driver.close();


    }
}
