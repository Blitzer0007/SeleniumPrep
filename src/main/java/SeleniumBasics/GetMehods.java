package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class GetMehods {

    @Test
    public void getMethodss() throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        //enter the url
        driver.get("https://www.google.com/");
        //To get the title of current web page
        String title = driver.getTitle();
        System.out.println("Title: " + title);
        //To get the url of current web page
        String url = driver.getCurrentUrl();
        System.out.println("URL: " + url);

        String pageSource = driver.getPageSource();
        System.out.println("pageSource: " + pageSource);    //Returns all internal source inspect

        //To close the browser
        Thread.sleep(2000);
        driver.close();
    }

}
