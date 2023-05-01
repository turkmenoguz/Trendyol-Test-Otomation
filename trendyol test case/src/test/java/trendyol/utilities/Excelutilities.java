package trendyol.utilities;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;

public class Excelutilities {

    private Sheet workSheet;
    private Workbook workBook;
    private String path;

    public Excelutilities(String path, String sheetName) {
        this.path = path;
        try {
            FileInputStream ExcelFile = new FileInputStream(path);

            workBook = WorkbookFactory.create(ExcelFile);
            workSheet = workBook.getSheet(sheetName);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public String getCellData(int rowNum, int colNum) {
        Cell cell;
        try {
            cell = workSheet.getRow(rowNum).getCell(colNum);
            String cellData = cell.toString();
            return cellData;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
