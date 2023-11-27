package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CssSelectors {

    public static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.get("https://letcode.in/");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//        driver.findElement(By.cssSelector("a[href='/signin']")).click();                            //tagName[attribute='value']
//        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("ahsja@gmail.com");         //tagName#id
//        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("Pass123$");            //tagName.className


        driver.get("https://www.rediff.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath("//a[contains(@title,'Sign in')]")).click();      //tagName[contains(@attribute,'value')]
        //Find unique text in large text

        driver.findElement(By.cssSelector("a[title*='new Rediffmail']")).click();    //tagName[attribute*='value']
        //Find unique text in large text
    }

}
