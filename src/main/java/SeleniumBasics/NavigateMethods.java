package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NavigateMethods {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        //To maximize the window
        driver.manage().window().maximize();

        //To delete the cookies
        driver.manage().deleteAllCookies();
        driver.get("https://www.google.com/");

        //To enter the url
        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(1000);

        //To navigate to previous page
        driver.navigate().back();
        Thread.sleep(1000);

        //To navigate to next page
        driver.navigate().forward();
        Thread.sleep(1000);

        //Refresh current web page
        driver.navigate().refresh();
    }

}
