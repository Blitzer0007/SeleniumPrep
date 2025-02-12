package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class CalendarHandling {

    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.path2usa.com/travel-companions");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        Actions builder = new Actions(driver);

        JavascriptExecutor js = (JavascriptExecutor)driver;                        //JavascriptExecutor interface typecasting
        js.executeScript("window.scrollBy(0,800)");

        //April 23
        WebElement element = driver.findElement(By.xpath("//div//input[@id='form-field-travel_comp_date']"));
        Thread.sleep(10000);
        element.click();

//        String text1 = element.getText();
//        System.out.println(text1);
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));    //Use Duration.ofSeconds(60) above 1.8 supported
//       wait.until(ExpectedConditions.elementToBeClickable(element));
//        builder.moveToElement(element).doubleClick();
//Thread.sleep(3000);

        while(!driver.findElement(By.xpath("//div[@class='flatpickr-current-month']")).getText().contains("November 2025"))
        {
            driver.findElement(By.xpath("//div[@class='flatpickr-month']//span[@class='flatpickr-next-month']")).click();
        }


       // List<WebElement> dates= driver.findElements(By.xpath("//div[@class='dayContainer']//span[@class='flatpickr-day ']"));
        //Grab common attribute//Put into list and iterate
        List<WebElement> alldates=driver.findElements(By.xpath("//div[@class='dayContainer']//span[@class='flatpickr-day ']"));
Thread.sleep(10000);
      //  int count = alldates.size();
       // System.out.println(count);

        for (WebElement date:alldates) {
            String text = date.getText();
            if(text.equalsIgnoreCase("29"))
                date.click();
        }



//        for(int i=0;i<count;i++)
//        {
//            String text=driver.findElements(By.className("flatpickr-days")).get(i).getText();
//            if(text.equalsIgnoreCase("21"))
//            {
//                driver.findElements(By.className("flatpickr-days")).get(i).click();
//                break;
//            }
//
//        }
    }
}
