package deneme_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Task_05 {
    public static void main(String[] args) {
        /*
        ODEV
        Yeni bir class olusturalim (Homework)
        ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
        oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
        yazdirin.
        https://www.walmart.com/ sayfasina gidin.
        Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        Tekrar “facebook” sayfasina donun
        Sayfayi yenileyin
        Sayfayi tam sayfa (maximize) yapin  9.Browser’i kapatin
            */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https:facebook.com");

        String actualTitle = driver.getTitle();

        if (actualTitle.equals("facebook")){
            System.out.println("Test PASSED");
        } else System.out.println(actualTitle);

        driver.get("https://www.walmart.com/");

        String actualTitle2 = driver.getTitle();

        if (actualTitle2.contains("Walmart.com")){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");

        driver.navigate().back();

        driver.navigate().refresh();

        driver.manage().window().maximize();

        driver.quit();

    }
}
