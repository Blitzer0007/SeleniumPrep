package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getAttributeValue {

    public static void main(String[] args) {

        WebDriver driver=new FirefoxDriver();
        driver.get("http://www.adactin.com/HotelApp/index.php");
        driver.findElement(By.id("username")).sendKeys("vengat16");
        driver.findElement(By.id("password")).sendKeys("Karthick");
        String s = driver.findElement(By.id("username")).getAttribute("value");
        String s1 = driver.findElement(By.id("password")).getAttribute("value");
        System.out.println(s);
        System.out.println(s1);
    }
}
