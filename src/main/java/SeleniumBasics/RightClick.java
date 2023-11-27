package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class RightClick {

    public static void main(String[] args) throws InterruptedException, Throwable {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        Actions builder = new Actions(driver);
        WebElement gmail = driver.findElement(By.linkText("Gmail"));
        Thread.sleep(2000);
        builder.contextClick(gmail).perform();
        // Using robot class we can open gmail in new tab
        Robot r=new Robot();
        r.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(2000);

        r.keyRelease(KeyEvent.VK_DOWN);
        Thread.sleep(2000);

        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);

        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println(windowHandles);

        List<String> list = new ArrayList<String>(windowHandles);
        driver.switchTo().window(list.get(1));

        Thread.sleep(2000);

        driver.switchTo().window(list.get(0));

    }

}
