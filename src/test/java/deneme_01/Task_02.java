package deneme_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Task_02 {
/*
        ODEV
        Yeni bir Class olusturalim.C05_NavigationMethods
        Youtube ana sayfasina gidelim . https://www.youtube.com/
        Amazon soyfasina gidelim. https://www.amazon.com/
        Tekrar YouTube’sayfasina donelim
        Yeniden Amazon sayfasina gidelim
        Sayfayi Refresh(yenile) yapalim
        Sayfayi kapatalim / Tum sayfalari kapatalim
         */
public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdirver.chrome.driver","src/resources/drivers/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    driver.get("https://www.youtube.com/");
    Thread.sleep(1000);

    driver.navigate().to("https://www.amazon.com/");
    Thread.sleep(1000);

    driver.navigate().back();
    Thread.sleep(1000);

    driver.navigate().forward();
    Thread.sleep(1000);

    driver.navigate().refresh();
    Thread.sleep(1000);

    driver.quit();
}
}
