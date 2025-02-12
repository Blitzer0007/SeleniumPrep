package SeleniumBasics;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {

    public static WebDriver driver;
    public static WebDriverWait wait;

     private static By ALLLink = By.linkText("Al");

    public static void main(String[] args) throws IllegalAccessException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.get("https://letcode.in/waits");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));        //Works only for findElement and findElements

//        Wait for Alert
//        driver.findElement(By.id("accept")).click();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));    //Use Duration.ofSeconds(60) above 1.8 supported
//        Alert until = wait.until(ExpectedConditions.alertIsPresent());            //Waiting for alert to display
//        System.out.println(until.getText());
////        until.accept();                                                            //Alternate way to accept
//        driver.switchTo().alert().accept();                                        //Common way to accept


//        Wait for visibility n invisibility                                        //Element click intercepted error
//        driver.get("https://letcode.in/signin");
//        driver.findElement(By.name("email")).sendKeys("harishk4078@gmail.com");
//        driver.findElement(By.name("password")).sendKeys("Letcode4078");
//        driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
//        WebElement toast = driver.findElement(By.xpath("//div[@role='alertdialog']"));
//        wait.until(ExpectedConditions.visibilityOf(toast));                        //Wait until visibility of alertdialog
//        System.out.println(toast.getText());
//        wait.until(ExpectedConditions.invisibilityOf(toast));                    //Wait until invisibility of alertdialog
//        driver.findElement(By.linkText("Sign out")).click();

//        Wait for visibility
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
    //    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
   //     driver.findElement(By.xpath("//button[.='✕']")).click();
        driver.findElement(By.xpath("//div[.='Electronics']")).click();
        WebElement elec = driver.findElement(By.xpath("//span[.='Electronics']"));
        Actions builder = new Actions(driver);
        builder.moveToElement(elec).perform();
       // WebElement apple = driver.findElement(By.linkText("Al"));            //Wait until visibility of Apple
     //   By apple1 = By.linkText("All");
     //   wait.until(ExpectedConditions.visibilityOf(apple));
        waitUntilVisible(ALLLink,"All",1);
        driver.findElement(ALLLink).click();
        wait.until(ExpectedConditions.titleContains("All"));                    //Wait for dynamic title to load
        System.out.println(driver.getTitle());
    }


    public static void waitUntilVisible(By element, String txt, int retry) throws IllegalAccessException {
        while (retry <=3){
            try {
                wait.until(ExpectedConditions.presenceOfElementLocated(element));
                return;
            }catch (StaleElementReferenceException e){
                By newByVariable = getByFromString(reassignElement(element));
                waitUntilVisible(newByVariable,txt,++retry);
            }
            catch (Exception e){
                e.printStackTrace();
                ++retry;
            }
            ++retry;
        }
    }

    public static String reassignElement(By element){
        return element.toString();
    }

    public static By getByFromString(String StringVariable) throws IllegalAccessException {
    String[] elementArray = StringVariable.split(": ",2);
    String locator = elementArray[0].split("\\.")[1];
    String locatorValue = elementArray[1];

    switch (locator){
        case "id":
        {
            return By.id(locatorValue);
        }
        case "name":
        {
            return By.name(locatorValue);
        }
        case "xpath":
        {
            return By.xpath(locatorValue);
        }
        case "className":
        {
            return By.className(locatorValue);
        }
        case "cssSelector":
        {
            return By.cssSelector(locatorValue);
        }
        default:
            throw new IllegalAccessException(locator);
    }

    }
}
