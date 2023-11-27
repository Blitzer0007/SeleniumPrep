package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class WindowHandling {

    public static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://letcode.in/windows");

        String windowHandle = driver.getWindowHandle();      //ctrl+2,L
        System.out.println("first window: "+windowHandle);                    //Main window or first window

        driver.findElement(By.id("home")).click();                //Open homepage / new tab

        Set<String> windowHandles = driver.getWindowHandles(); //More than 1 window, Window handle--set--linkedlist follows insertion order
        System.out.println(windowHandles);

//        System.out.println(driver.getCurrentUrl());          //To check where is the focus for driver. https://letcode.in/windows first window.

        List<String> list = new ArrayList<String>(windowHandles);
        driver.switchTo().window(list.get(1));
        System.out.println(driver.getCurrentUrl());            //To change the focus to second page using list and switchTo() https://letcode.in/test

        driver.switchTo().window(list.get(0));                //Closing the first/parent tab by switching it by list index and using close() not quit()
        System.out.println(driver.getTitle());
//        driver.close();

        driver.switchTo().window(list.get(1));                //Closing the child tab by switching it by list index and using close() not quit()
        System.out.println(driver.getTitle());
//        driver.close();

        driver.switchTo().window(list.get(0));

        driver.findElement(By.id("multi")).click();
//        List<String> multiWindow = new ArrayList<String>(windowHandles);
//        driver.switchTo().window(multiWindow.get(2));
//        System.out.println(driver.getTitle());
//        driver.switchTo().window(list.get(2));
//        System.out.println(driver.getTitle());
    }

}
