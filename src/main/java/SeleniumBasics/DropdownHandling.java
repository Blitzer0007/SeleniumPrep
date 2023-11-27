package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class DropdownHandling {

    public static WebDriver driver;

    public static void main(String[] args) {
        driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.spicejet.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.findElement(By.xpath("//div[text()='Passengers']")).click();

        for (int i = 1; i < 10; i++) {                             //Looping dropdown selecting multiple times

            driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
        }

        driver.findElement(By.xpath("(//div[contains(@class,'css-1dbjc4n r-obd0qt')]//div)[1]")).click();


//        driver.findElement(By.xpath("//div[contains(text(),'From')]")).click();
//        driver.findElement(By.xpath("//div[normalize-space()='Pandit Deen Dayal Upadhyay Airport']")).click();
//        driver.findElement(By.xpath("//div[normalize-space()='Indira Gandhi International Airport']")).click();
    }

}
