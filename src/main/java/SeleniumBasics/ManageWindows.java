package SeleniumBasics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ManageWindows {

    public static void main(String[] args) throws InterruptedException {
        //To open the browser

        WebDriver driver = new EdgeDriver();
        Thread.sleep(2000);

        //To delete cookies
        driver.manage().deleteAllCookies();

        //To set the size of the window
        Dimension d = new Dimension(500, 500);  //Dimension - size
        driver.manage().window().setSize(d);
        Thread.sleep(2000);

        //To set the position of the window
        Point p = new Point(250, 250);
        driver.manage().window().setPosition(p);            //Point - position
        Thread.sleep(2000);

        //To maximize the window
        driver.manage().window().maximize();
    }

}
