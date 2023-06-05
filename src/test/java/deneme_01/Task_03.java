package deneme_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Task_03 {
/*
        ODEV
        1.Yeni bir Class olusturalim.C06_ManageWindow
        2.Amazon soyfasina gidelim. https://www.amazon.com/
        3.Sayfanin konumunu ve boyutlarini yazdirin
        4.Sayfayi simge durumuna getirin
        5.simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        6.Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        7.Sayfayi fullscreen yapin
        8.Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        9.Sayfayi kapatin
         */
public static void main(String[] args) throws InterruptedException {

    System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    driver.get("https://www.amazon.com/");

    System.out.println("Size of Page = " + driver.manage().window().getSize());

    System.out.println("Position of Page = " + driver.manage().window().getPosition());

    driver.manage().window().minimize();
    Thread.sleep(3000);

    driver.manage().window().maximize();
    Thread.sleep(3000);

    System.out.println("Position of Page = " + driver.manage().window().getPosition());

    System.out.println("Size of Page = " + driver.manage().window().getSize());

    driver.manage().window().fullscreen();
    Thread.sleep(3000);

    System.out.println("Position of Page = " + driver.manage().window().getPosition());

    System.out.println("Size of Page = " + driver.manage().window().getSize());

    driver.quit();



}
}
