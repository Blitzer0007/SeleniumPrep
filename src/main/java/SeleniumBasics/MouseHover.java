package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.greenstechnologys.com/");

        WebElement courses = driver.findElement(By.linkText("COURSES"));

        Actions builder=new Actions(driver);
        builder.moveToElement(courses).perform();   //Hovering the cursor over the specific element
        Thread.sleep(2000);
        WebElement devOpTraining =
                driver.findElement(By.xpath("//span[text()='DevOps Training']"));
        builder.click(devOpTraining).perform();     //Click the inside element after hovering over
    }
}
