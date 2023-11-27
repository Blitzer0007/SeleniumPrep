package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class JSExecutor2 {

    public static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;                             // JavascriptExecutor interface typecasting

        driver.get("https://letcode.in/signin");

//        Fetching the Domain Name of the site. Tostring() change object to name.
        String DomainName = js.executeScript("return document.domain;").toString();
        System.out.println("Domain name of the site = " + DomainName);

//      Fetching the URL of the site. Tostring() change object to name
        String url = js.executeScript("return document.URL;").toString();
        System.out.println("URL of the site = " + url);

//     Method document.title fetch the Title name of the site. Tostring() change object to name
        String TitleName = js.executeScript("return document.title;").toString();
        System.out.println("Title of the page = " + TitleName);

//      Navigate to new Page i.e to generate access page. (launch new url)
        js.executeScript("window.open()");                                                //Open new tab/window
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());         //Switching tab and opening URL
        driver.switchTo().window(tabs.get(1));

        js.executeScript("window.location = 'https://support.google.com/analytics/answer/1012040?hl=en#zippy=%2Cin-this-article'");

//        Vertical scroll down by 600  pixels
        js.executeScript("window.scrollBy(0,800)");                                        //Scrolling down

        WebElement goals = driver.findElement(By.xpath("//a[@href='#how_goals_work']"));
        goals.click();

        driver.close();                                                                    //Closing the second tab

        driver.switchTo().window(tabs.get(0));                                            //Switching back to main/initial tab
    }

}
