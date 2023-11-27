package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonHandling {

    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();

        JavascriptExecutor js = (JavascriptExecutor) driver;                             // JavascriptExecutor interface typecasting

//        driver.manage().window().maximize();
//
//        driver.get("https://www.makemytrip.com/");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//
//        driver.findElement(By.xpath("(//p[contains(text(),'Senior Citizen')])[1]")).click();
//
//        Dimension size = driver.findElement(By.xpath("//ul[contains(@class,'specialFareNew')]")).getSize();
//        System.out.println(size);                                    //Dimension size (x,y) using getSize() useful in js executor
//
//        System.out.println(driver.findElements(By.xpath("//ul[contains(@class,'specialFareNew')]")).size());

        driver.get("http://www.echoecho.com/htmlforms10.htm");

        //driver.findElement(By.xpath("//input[@value='Milk']")).click();

        Dimension size = driver.findElement(By.xpath("//input[@name='group1']")).getSize();
        System.out.println(size);

        js.executeScript("window.scrollBy(13,13)");

        int count =driver.findElements(By.xpath("//input[@name='group1']")).size();  //Count of radio buttons
        System.out.println(count);

        for(int i=0;i<count;i++)

        {

            //driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();        //Click each radio button once

            String text = driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value"); //works only if attribute is there

            if(text.equals("Butter"))

            {

                driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();

            }

        }

    }

}
