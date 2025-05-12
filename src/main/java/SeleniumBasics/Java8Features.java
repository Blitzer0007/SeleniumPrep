package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.Collectors;

public class Java8Features {

    @Test
    public void toValidateListElements() throws InterruptedException {

        List<String> ExpectedvisibleProductNames = List.of("ZARA COAT 3", "ADIDAS ORIGINAL", "IPHONE 13 PRO");
        WebDriver driver = new EdgeDriver();
        //enter the url
        driver.get("https://rahulshettyacademy.com/client");
        driver.findElement(By.cssSelector("input[id='userEmail']")).sendKeys("jammytammy.no@gmail.com");
        driver.findElement(By.cssSelector("input[id='userPassword']")).sendKeys("RestAssured5");
        driver.findElement(By.cssSelector("input[id='login']")).click();

        Thread.sleep(2000);
        List<WebElement> productElements = driver.findElements(By.cssSelector(".card-body b"));

        //.filter() takes a predicate (a condition that returns true or false)
        // and returns a stream of elements that match the condition.

        //Stream() converts all list values into stream
        List<String> visibleProductNames = productElements.stream()
                .filter(WebElement::isDisplayed)            //Filtering with condition by using shortand :: notation to call methods
                .map(WebElement::getText)                   //map is getting the text by going through each values in the streams
                .collect(Collectors.toList());

        System.out.println(visibleProductNames);

        productElements.stream()
                .filter(WebElement::isDisplayed)            //Filtering with condition by using shortand :: notation to call methods
                .map(WebElement::getText)                   //map is getting the text by going through each values in the streams
                .filter(name -> name.contains("ZARA") || name.contains("ADIDAS") )
                .forEach(name -> System.out.println("Found: " + name));


        List<String> allMatchProductNames = List.of("ZARA COAT 3 laptop", "ADIDAS ORIGINAL laptop", "IPHONE 13 PRO laptop");

        //Checks if any element matches a condition
        boolean hasError = allMatchProductNames.stream()
                .anyMatch(text -> text.contains("ORIGINAL"));
        System.out.println(hasError);

//Removes duplicate elements — useful for verifying unique values.
        List<String> uniqueStatuses = allMatchProductNames.stream()
                .distinct()
                .toList();

        //Checks if all elements match a condition (like all product names containing "Laptop").
        boolean allAreLaptops = allMatchProductNames.stream()
                .allMatch(name -> name.toLowerCase().contains("laptop"));
        System.out.println(allAreLaptops);

        List<String> laptopsContainsFilter = allMatchProductNames.stream()
                .filter(e -> e.toLowerCase().contains("laptop") && !e.isEmpty()) //IF one of the value satisfies proceeds further
                .map(e -> e.replace(" ", "_"))      //Map can modify
                .filter(f -> f.contains("_"))                           //We can filter & maps depends on needs
                .map(f -> f.replace("_", " "))
                .collect(Collectors.toList());
        System.out.println(laptopsContainsFilter);


        List<String> lowerVisible = visibleProductNames.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        System.out.println(lowerVisible);

        List<String> lowerExpected = ExpectedvisibleProductNames.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        System.out.println(lowerExpected);

        Assert.assertEquals(lowerVisible, lowerExpected, "Product names do not match (case-insensitive comparison)");

    }

}
