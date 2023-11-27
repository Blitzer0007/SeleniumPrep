package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AutoSuggestiveDropdowns {

    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.makemytrip.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement fromCity = driver.findElement(By.xpath("//input[@id='fromCity']"));
        fromCity.click();
        WebElement enterCity = driver.findElement(By.xpath("//input[@placeholder='From']"));
        Thread.sleep(4000);
        enterCity.clear();
        enterCity.sendKeys("Chennai");
        Thread.sleep(4000);                                            //Important wait time
        enterCity.sendKeys(Keys.ARROW_DOWN);
        enterCity.sendKeys(Keys.ENTER);
//        enterCity.sendKeys(Keys.ARROW_DOWN);

    }

}
