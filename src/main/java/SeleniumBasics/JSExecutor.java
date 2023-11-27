package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class JSExecutor {

    public static WebDriver driver;

    public static void main(String[] args) {
        driver = new EdgeDriver();
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor)driver;                        //JavascriptExecutor interface typecasting

        driver.get("https://letcode.in/signin");
        driver.findElement(By.name("email")).sendKeys("harishk4078@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Letcode4078");

        WebElement button = driver.findElement(By.xpath("//button[text()='LOGIN']"));

        js.executeScript("arguments[0].click();", button);                        //Executing using arguments n webelement

        js.executeScript("alert('Logged In');");    //To generate Alert window using JavascriptExecutor. Display the alert message
    }

}
