package SeleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert3Handling {

    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://letcode.in/alert");

//        Simple Alert One button`
        driver.findElement(By.id("accept")).click();

        Alert alert = driver.switchTo().alert();

        String text = alert.getText();
        System.out.println("Simple alert text "+text);
        alert.accept();
//    alert.dismiss(); both doing same cuz only one button is available

// Confirm Alert two button
        driver.findElement(By.id("confirm")).click();
        String text1 = alert.getText();
        System.out.println("Simple alert text "+text1);
        alert.dismiss();

//Prompt`
        Thread.sleep(3000);
        driver.findElement(By.id("prompt")).click();
        String text2 = alert.getText();
        alert.sendKeys("haris");
        alert.accept();
        System.out.println("Simple alert text "+text2);

        String name = driver.findElement(By.id("myName")).getText();
        System.out.println(name);
    }

}
