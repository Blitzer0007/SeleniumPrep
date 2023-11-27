package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHusingIterator {

    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> iterator = windowHandles.iterator();
        String parent = iterator.next();
        String child = iterator.next();

//    String parent = driver.getWindowHandle();
        driver.switchTo().window(child);
        Thread.sleep(5000);
        driver.switchTo().window(parent);
    }

}
