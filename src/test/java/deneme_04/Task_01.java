package deneme_04;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Task_01 {
    public static void main(String[] args) {
 /*
        ODEV
        // http://the-internet.herokuapp.com/add_remove_elements/ adresine gidiniz
        // Add Element butonuna 100 defa basınız
        // 100 defa basıldığını test ediniz
        // 90 defa delete butonuna basınız
        // 90 defa basıldığını doğrulayınız
        // Sayfayı kapatınız
         */

        System.setProperty("chromedriver","src/recources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");

        WebElement addButton = driver.findElement(By.xpath("//*[@onclick='addElement()']"));

        for (int i = 1; i <101 ; i++) {
            addButton.click();
        }


       int deleteButton = driver.findElements(By.xpath("//*[text()='Delete']")).size();

       if (deleteButton==100){
           System.out.println("100 Kere Bastim PASS");
        }else System.out.println("Basamadim FAIL");



        for (int i = 1; i <91 ; i++) {
           driver.findElement(By.xpath("//*[text()='Delete']")).click();

        }
        int size = driver.findElements(By.xpath("//*[text()='Delete']")).size();
        System.out.println(size);


        if (size==10){
            System.out.println("90 tane sildim PASS");
        }else System.out.println("Silemedim FAIL");

        driver.close();




    }
}
