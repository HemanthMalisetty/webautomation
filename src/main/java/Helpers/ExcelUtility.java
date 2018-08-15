package Helpers;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.TestException;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class ExcelUtility {

    private static final String extension= ".xlsx";
    public static final Path    Unicorn = Paths.get("src/test/resources/AppData/Unicorn" + extension);
    public static Map<String, String> getDataFromVerticalSheetMap(Path path, String sheetName, String key) { ;
        // Initialize variables
        final String filename = path.toString();//+ File.separator + strFileName;
        DataFormatter df = new DataFormatter();
        Map<String, String> column = new HashMap<>();

        // Create Workbook
        try (XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(new File(filename)))) {
            // Navigate to sheet
            XSSFSheet sheet = workbook.getSheet(sheetName);
            // Variable for holding our header reference
            int keyColumnIndex = 0;
            // Get all rows in sheet
            Iterator<Row> rowIterator = sheet.iterator();

            // Find header that has the key passed in and set the reference
            if (rowIterator.hasNext()) {
                Row headerRow = rowIterator.next();
                // Go through headers to find match
                for( Cell cell : headerRow)
                    if(cell.getStringCellValue().trim().equalsIgnoreCase(key.trim())) {
                        keyColumnIndex = cell.getColumnIndex();
                        break;
                    }


                // Iterate through the rows of that column and add all
                // non-empty key/value pairs to the map.
                while (rowIterator.hasNext()) {
                    Row innerRow = rowIterator.next();
                    String keyValue = df.formatCellValue(innerRow.getCell(0)).trim(); //key is always first column
                    String value = df.formatCellValue(innerRow.getCell(keyColumnIndex)).trim();

                    if(key.isEmpty() || value.trim().isEmpty())
                        continue;

                    column.put(keyValue, value);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new TestException("Unable to create the data provider.", e);
        }

        return column;
    }

}
