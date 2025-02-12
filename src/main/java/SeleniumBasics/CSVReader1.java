package SeleniumBasics;

import com.opencsv.exceptions.CsvException;
import org.testng.annotations.DataProvider;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class CSVReader1 {

    public String getCellValue(String testCaseID, String ColName) throws IOException {

        String line;
        String cellValue="";
        Boolean blnfound=false;
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

    public static void main(String[] args) throws IOException {
        CSVReader1 CSV =new CSVReader1();
        CSV.getCellValue("naveen","Course");
    }

//    @DataProvider(name="AddEmployee")
//    public static Object[][] getCSVData() throws IOException, CsvException {
//        CSVReader1 reader1 = new CSVReader1(new FileReader("./src/test/resources/Emp_Data.csv"));
//        reader.readNext();
//        List<String[]> csvdata = reader.readAll();
//        return csvdata.toArray(new String[csvdata.size()][]);
//    }
}
