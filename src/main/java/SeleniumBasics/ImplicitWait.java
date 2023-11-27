package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWait {

    public static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
//        driver.manage().window().maximize();
        driver.get("https://letcode.in/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //One time declaration -- FindElement & FindElements works
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.name("email")).sendKeys("ahsja@gmail.com"); //Waited 20 sec for element to be visible
        driver.findElement(By.name("password")).sendKeys("Pass123$");

    }

}
