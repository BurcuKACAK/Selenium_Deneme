package deneme_03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Task_01 {
    public static void main(String[] args) throws InterruptedException {
        //Techproeducation sayfasına gidelim
        //Çıkan reklamı locate edip kapatalım
        //Arama bölümünde qa aratalım
        //Sayfa başlığının qa içerdiğini doğrulayalım
        //Carrer Opportunities In QA linkinin görünür ve erişilebilir olduğunu doğrulayalım
        //Carrer Opportunities In QA linkine tıklayalım
        //Başlığın Opportunities içerdiğini test edelim
        //Tekrar anasayfaya dönelim ve url'in https://techproeducation.com/ olduğunu doğrulayalım

     /*   System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://techproeducation.com/");
        driver.findElement(By.xpath("//*[@class='eicon-close']")).click();

        driver.findElement(By.xpath("(//*[@id='elementor-search-form-9f26725'])[1]")).sendKeys("QA", Keys.ENTER);

        String actualTitle = driver.getTitle();
        String expectedTitle = "QA";

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Test PASSED");
        } else {
            System.out.println("Test FAILED -> " + actualTitle);
        }

        WebElement qa=driver.findElement(By.xpath("(//*[@href='https://techproeducation.com/software-career-opportunities-qa/'])[1]"));

        System.out.println("qa.isDisplayed() = " + qa.isDisplayed());

        System.out.println("qa.isEnabled() = " + qa.isEnabled());

        qa.click();

        String actualTitle1 = driver.getTitle();
        String expectedTitle1 = "Opportunities";

        if(actualTitle1.contains(expectedTitle1)){
            System.out.println("Test PASSED");
        } else {
            System.out.println("Test FAILED -> " + actualTitle);
        }

        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);

        if (driver.getCurrentUrl().equals("https://techproeducation.com/")){
            System.out.println("Test PASSED");
        } else {
            System.out.println("Test FAILED -> " + actualTitle);
        }

      */

    }
}
