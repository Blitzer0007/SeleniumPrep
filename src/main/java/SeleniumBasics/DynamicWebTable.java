package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DynamicWebTable {
    public static WebDriver driver;

    @Test
    public void tripDetails() throws InterruptedException  {

//Modify Wait time as per the Network Ability in the Thread Sleep method
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.nyse.com/ipo-center/filings");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(5000);

//Finding number of Rows

        java.util.List<WebElement> rowsNumber = driver.findElements(By.xpath("//*[@id='content - 8b4988b9 - 2ec9 - 4e77 - 9b4d - 9c2994bd9e8a']/div/div/table[1]/tbody/tr[1]/td[1]"));
        int rowCount = rowsNumber.size();
        System.out.println("No of rows in this table : " + rowCount);

//Finding number of Columns

        List<WebElement> columnsNumber = driver.findElements(By.xpath("//*[@id='content - 8b4988b9 - 2ec9 - 4e77 - 9b4d - 9c2994bd9e8a']/div/div/table[1]/thead/tr/th[1]"));
        int columnCount = columnsNumber.size();
        System.out.println("No of columns in this table : " + columnCount);

//Finding cell value at 4th row and 3rd column

//        WebElement cellAddress = Rowtable.findElement(By.xpath(“//*[@id='content-8b4988b9-2ec9-4e77-9b4d-9c2994bd9e8a']/div/div/table[1]/tbody/tr[4]/td[3]”));
//                String value = cellAddress.getText();
//        System.out.println(“The Cell Value is : “+value);

        driver.quit();
    }

}
