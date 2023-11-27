package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickNhold {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/drag_drop.html");
        Actions builder = new Actions(driver);
        WebElement source = driver.findElement(By.xpath("//a[normalize-space()='BANK']"));
        WebElement des = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
        Thread.sleep(2000);

        builder.clickAndHold(source).moveToElement(des).release(des).perform();
    }

}
