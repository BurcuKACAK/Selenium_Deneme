package deneme_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Task_02 {

    public static void main(String[] args) {
             /*
          https://www.amazon.com/ adresine gidin
          Browseri tam sayfa yapin
          Sayfayi “refresh” yapin
          Sayfa basliginin “Spend less” ifadesi icerdigini test edin
          Gift Cards sekmesine basin
          Birthday butonuna basin
          Best Seller bolumunden ilk urunu tiklayin
          Gift card details’den 25 $’i secin
          Urun ucretinin 25$ oldugunu test edin
          Sayfayi kapatin
              */
        System.setProperty("chromedriver","src/recources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.amazon.com/");

        driver.manage().window().fullscreen();

        driver.navigate().refresh();

        String actualTitle = driver.getTitle();
        String expectedTitle = "Spend less";

        if (actualTitle.contains(expectedTitle)){
            System.out.println("PASS");
        }else System.out.println("FAIL ==> "+actualTitle);

        driver.findElement(By.xpath("//*[@href='/gift-cards/b/?ie=UTF8&node=2238192011&ref_=nav_cs_gc']")).click();

        driver.findElement(By.xpath("//*[@alt='Birthday']")).click();

        driver.findElement(By.xpath("(//*[@id='acs-product-block-0'])[1]")).click();

        WebElement element = driver.findElement(By.xpath("(//*[@id='gc-mini-picker-amount-1'])[1]"));

        element.click();

        WebElement text25$ = driver.findElement(By.xpath("//*[text()='$25.00'][1]"));

        System.out.println("control2.getText() = " + text25$.getText());

        String text25$Str = text25$.getText();

        if (text25$Str.contains("$25.00")) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        driver.close();


    }
}
