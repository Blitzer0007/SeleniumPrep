package SeleniumBasics;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractwithActiveElement {

    public static WebDriver driver;
    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        WebElement activeElement = driver.switchTo().activeElement();
        activeElement.sendKeys("email",
                Keys.TAB,
                "Password",
                Keys.ENTER);
        driver.quit();
    }

}
