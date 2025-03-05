package SeleniumBasics;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
public class DateHandling {

    public static WebDriver driver;

    String month = "February 2025";

    @DataProvider(name="AddEmployee")
    public static Object[][] getCSVData() throws IOException, CsvException {
        CSVReader reader = new CSVReader(new FileReader("./src/test/resources/Emp_Data.csv"));
        reader.readNext();
        List<String[]> csvdata = reader.readAll();
        return csvdata.toArray(new String[csvdata.size()][]);
    }




        public static  void main(String[] args) throws IOException {
            //Create an object of File class to open xlsx file
            File file =    new File("./src/main/resources/OpenCartTestData.xlsx");

            //Create an object of FileInputStream class to read excel file
            FileInputStream inputStream = new FileInputStream(file);

            //creating workbook instance that refers to .xls file
            XSSFWorkbook wb=new XSSFWorkbook(inputStream);

            //creating a Sheet object
            XSSFSheet sheet=wb.getSheet("register");

            //get all rows in the sheet
            int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();

            //iterate over all the row to print the data present in each cell.
            for(int i=0;i<=rowCount;i++){

                //get cell count in a row
                int cellcount=sheet.getRow(i).getLastCellNum();

                //iterate over each cell to print its value
                System.out.println("Row "+ i+" data is :");

                for(int j=0;j<cellcount;j++){
                    System.out.print(sheet.getRow(i).getCell(j).getStringCellValue() +",");
                }
                System.out.println();
            }
        }








    @Test
    public void dateTest() throws InterruptedException {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://phptravels.net/flights");
        Thread.sleep(6000);
        WebElement element = driver.findElement(By.xpath("//input[@id='departure']"));
        element.click();

        WebElement currentmonth = driver.findElement(By.xpath("(//div[@class='datepicker-days'])[1]//th[contains(@class,'switch')]"));
        String curtmonth = currentmonth.getText();
        System.out.println(curtmonth);

        WebElement nxtMonth = driver.findElement(By.xpath("(//div[@class='datepicker-days'])[1]//th[@class='next']"));

        while (true){
            if(!curtmonth.equals(month)){
                break;
            }
            else {
                Thread.sleep(4000);
                nxtMonth.click();
                String text = currentmonth.getText();
                if(text.equalsIgnoreCase("June 2025")){
                    System.out.println(text);
                    break;
                }
                System.out.println(text);

            }
        }
    }


}
