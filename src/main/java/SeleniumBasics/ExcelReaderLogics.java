package SeleniumBasics;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReaderLogics {

    public String getCellValue(String testCaseID, String colName) throws IOException {

        String cellValue = "";
        int colNo = -1;  // Default to -1 to indicate column not found
        boolean blnfound = false;

        // Open the Excel file
        FileInputStream fis = new FileInputStream(new File("./src/main/resources/OpenCartTestData.xlsx"));
        Workbook workbook = new XSSFWorkbook(fis);

        // Get the first sheet (you can specify a sheet name or index here)
        Sheet sheet = workbook.getSheetAt(0);

        // Iterate through the first row to find the column index for the provided column name
        Row headerRow = sheet.getRow(0);  // Assuming first row is header row
        int colCount = headerRow.getPhysicalNumberOfCells();

        for (int j = 0; j < colCount; j++) {
            Cell cell = headerRow.getCell(j);
            if (cell != null && cell.getStringCellValue().equalsIgnoreCase(colName)) {
                colNo = j;  // Found the column, store the index
                blnfound = true;
                break;
            }
        }

        if (!blnfound) {
            System.out.println("Column name not found: " + colName);
            fis.close();
            return cellValue;
        }

        // Iterate through the rows to find the testCaseID and retrieve the cell value for the column
        int rowCount = sheet.getPhysicalNumberOfRows();
        for (int i = 1; i < rowCount; i++) {  // Start from row 1 to skip the header row
            Row row = sheet.getRow(i);
            if (row != null) {
                Cell testCaseCell = row.getCell(0);  // Assuming testCaseID is in the first column (index 0)
                if (testCaseCell != null && testCaseCell.getStringCellValue().equalsIgnoreCase(testCaseID)) {
                    // Once the testCaseID matches, get the value from the required column
                    Cell targetCell = row.getCell(colNo);
                    if (targetCell != null) {
                        // Format the cell value correctly
                        DataFormatter dataFormatter = new DataFormatter();
                        cellValue = dataFormatter.formatCellValue(targetCell);
                    }
                    break;
                }
            }
        }

        // Close resources

        fis.close();

        // Print the result (optional)
        System.out.println("Cell Value: " + cellValue);

        return cellValue;
    }

    public static void main(String[] args) throws IOException {
        ExcelReaderLogics reader = new ExcelReaderLogics();
        String value = reader.getCellValue("Arti", "password");  // Example usage
        System.out.println("Retrieved Value: " + value);
    }
}

