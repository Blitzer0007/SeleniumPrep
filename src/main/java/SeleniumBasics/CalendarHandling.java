package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class CalendarHandling {

    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new EdgeDriver();
        driver.get("https://www.path2usa.com/travel-companions");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        Actions builder = new Actions(driver);

        //April 23
        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Date of travel']"));
        builder.moveToElement(element).click();


        while(!driver.findElement(By.xpath("//div[@class='flatpickr-current-month']")).getText().contains("November 2023"))
        {
            driver.findElement(By.xpath("//span[@class='flatpickr-next-month']")).click();
        }


        List<WebElement> dates= driver.findElements(By.className("flatpickr-days"));
        //Grab common attribute//Put into list and iterate
        int count=driver.findElements(By.className("flatpickr-days")).size();

        for(int i=0;i<count;i++)
        {
            String text=driver.findElements(By.className("flatpickr-days")).get(i).getText();
            if(text.equalsIgnoreCase("21"))
            {
                driver.findElements(By.className("flatpickr-days")).get(i).click();
                break;
            }

        }
    }
}
