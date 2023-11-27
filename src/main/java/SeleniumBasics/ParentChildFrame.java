package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChildFrame {

    public static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://letcode.in/frame");

        //Switched to Parent Frame -- by NAME firstFr
        driver.switchTo().frame("firstFr");

        WebElement childframe = driver.findElement(By.cssSelector("iframe.has-background-white"));

        //Switched to Child Frame

        driver.switchTo().frame(childframe);

        driver.findElement(By.name("email")).sendKeys("333@hgdfh");

        driver.switchTo().parentFrame();

        driver.findElement(By.name("fname")).sendKeys("ItsMeeee");

        System.out.println("Success");
    }

}
