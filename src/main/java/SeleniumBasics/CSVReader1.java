package SeleniumBasics;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;
import org.testng.annotations.DataProvider;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class CSVReader1 {

    public String getCellValue(String testCaseID, String ColName) throws IOException {

        String line;
        String cellValue="";
        boolean blnfound=false;
        BufferedReader br = null;
        int i,colNo=0;

        try {
            br = new BufferedReader(new FileReader("./src/main/resources/register.csv"));

            while ((line = br.readLine())!=null){
                String[] testData = line.split(",");

            try {
                if(blnfound==false){
                    int colcount = testData.length;

                    for (int j = 0; j < colcount; j++) {
                        if (testData[j].equalsIgnoreCase(ColName)){
                            colNo = j;
                            System.out.println(colNo);
                            blnfound = true;
                            break;
                        }
                    }
                }
                if (testData[0].equalsIgnoreCase(testCaseID)){
                    cellValue = testData[colNo];
                }
            } catch (Exception e) {
                cellValue="";
            }

            }


        } catch (IOException e) {
            e.printStackTrace();
        }
        br.close();
        System.out.println(cellValue);
        return cellValue;
    }

    public void updateCell(String testCaseID, String columnName, String newValue) throws IOException {
        String csvFilePath = "./src/main/resources/register.csv";

        List<String[]> allData;

        // Read all rows
        try (CSVReader reader = new CSVReader(new FileReader(csvFilePath))) {
            allData = reader.readAll();
        } catch (CsvException e) {
            throw new RuntimeException(e);
        }

        if (allData.isEmpty()) {
            System.out.println("CSV is empty.");
            return;
        }

        // Find column index
        String[] header = allData.get(0);
        int colIndex = -1;
        for (int i = 0; i < header.length; i++) {
            if (header[i].trim().equalsIgnoreCase(columnName)) {
                colIndex = i;
                break;
            }
        }

        if (colIndex == -1) {
            System.out.println("Column not found: " + columnName);
            return;
        }

        // Update the row where TestCaseID matches
        for (int i = 1; i < allData.size(); i++) {
            String[] row = allData.get(i);
            if (row[0].trim().equalsIgnoreCase(testCaseID)) {
                // Ensure the row has enough columns
                if (row.length <= colIndex) {
                    row = Arrays.copyOf(row, colIndex + 1);
                }
                row[colIndex] = newValue;
                allData.set(i, row);
                break;
            }
        }

        // Write updated data back to CSV
        try (CSVWriter writer = new CSVWriter(new FileWriter(csvFilePath))) {
            writer.writeAll(allData);
        }

        System.out.println("CSV cell updated successfully.");
    }


    public static void main(String[] args) throws IOException {
        CSVReader1 CSV =new CSVReader1();
        CSV.getCellValue("naveen","Course");

        CSV.updateCell("naveen", "Status", "Approved");
    }

//    @DataProvider(name="AddEmployee")
//    public static Object[][] getCSVData() throws IOException, CsvException {
//        CSVReader1 reader1 = new CSVReader1(new FileReader("./src/test/resources/Emp_Data.csv"));
//        reader.readNext();
//        List<String[]> csvdata = reader.readAll();
//        return csvdata.toArray(new String[csvdata.size()][]);
//    }
}
