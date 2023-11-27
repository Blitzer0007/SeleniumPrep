package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ValidationsB {

    public static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.get("https://letcode.in/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//        1. isDisplayed - used to check if the element is visible or rendered

        driver.get("https://letcode.in");
        WebElement logIn = driver.findElement(By.linkText("Log in"));
        boolean displayed = logIn.isDisplayed();
        System.out.println("Login btn: " + displayed);

//        2. isEnabled - if the element is intractable

        driver.get("https://letcode.in/edit");
        WebElement edit = driver.findElement(By.id("noEdit"));
        System.out.println(edit.isEnabled());

        driver.get("https://letcode.in/buttons");
        boolean enabled = driver.findElement(By.id("isDisabled")).isEnabled();
        System.out.println(enabled);

//        getAttribute
        driver.get("https://semantic-ui.com/elements/button.html");
        WebElement btn = driver.findElement(By.xpath("//button[text()[normalize-space()='Followed']]"));
        System.out.println(btn.isEnabled());
        String attribute = btn.getAttribute("class");
        System.out.println(attribute.contains("disabled"));

//        3. isSelected - if the element is already selected - radio, check box

        driver.get("https://letcode.in/radio");
        WebElement remember = driver.findElement(By.xpath("(//label[@class='checkbox']//input)[1]"));
        System.out.println(remember.isSelected());

        driver.quit();

    }

}
