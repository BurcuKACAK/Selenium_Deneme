package deneme_02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Task_01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

       //-ÖDEV-
        //Amazon sayfasına gidiniz
        driver.get("https://amazon.com");

        //iphone aratınız
        driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys(" iphone", Keys.ENTER);

        //çıkan sonuç yazısını konsola yazdırınız
        WebElement element = driver.findElement(By.xpath(" (//*[@class='a-section a-spacing-small a-spacing-top-small'])[1]"));
        System.out.println("Sonuc Yazisi = " + element.getText());

        //çıkan ürünlerden ilk 5 tanesine tıklayıp sayfa başlıklarını yazdırınız




        for (int i = 0; i <5 ; i++) {
            List<WebElement> liste = driver.findElements(By.xpath("//*[@class='a-section aok-relative s-image-fixed-height']"));
            System.out.println((i+1)+". Urun basligi= " +driver.getTitle());
            liste.get(i).click();
            driver.navigate().back();
        }
        driver.close();

    }
}
