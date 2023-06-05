package deneme_01;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Task_01 {
    /*ODEV
    Yeni bir package olusturalim : day01
    Yeni bir class olusturalim : C03_GetMethods
    Amazon sayfasina gidelim. https://www.amazon.com/
    Sayfa basligini(title) yazdirin
    Sayfa basliginin “Amazon” icerdigini test edin
    Sayfa adresini(url) yazdirin
    Sayfa url’inin “amazon” icerdigini test edin.
    Sayfa handle degerini yazdirin
    Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
    Sayfayi kapatin.
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.amazon.com/");

        System.out.println("Amazon Page Title : " + driver.getTitle());

        String actualTitle = driver.getTitle();
        if (actualTitle.contains("Amazon")){
            System.out.println("Page Title = Test PASSED");
        }else {
            System.out.println("Page Title = Test FAILED -> " + actualTitle);
        }

        System.out.println("Amazon Page Url = " + driver.getCurrentUrl());

        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains("amazon")){
            System.out.println("Page Url = Test PASSED");
        }else {
            System.out.println("Page Url = Test FAILED -> " + actualUrl);
        }

        System.out.println("driver.getWindowHandle() = " + driver.getWindowHandle());//6460D48502C0CF2110EB1173FCF7D4D9

        boolean r1 = driver.getPageSource().contains("Gateway");

        if (r1){
            System.out.println("Is Contain Gateway = Test PASSED");
        }else {
            System.out.println("Is Contain Gateway = Test FAILED");
        }

        driver.close();
        driver.quit();


    }

}
