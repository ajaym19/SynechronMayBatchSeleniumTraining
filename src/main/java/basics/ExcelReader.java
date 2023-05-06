package basics;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public XSSFWorkbook wb;
	public XSSFSheet sheet;

	public ExcelReader(String filePath, String sheetName) {
		try {
			wb = new XSSFWorkbook(filePath);
			sheet = wb.getSheet(sheetName);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public int getRowCount() {
		return sheet.getPhysicalNumberOfRows();
	}

	public int getColCount() {
		return sheet.getRow(0).getLastCellNum();
	}

	public String getCellValue(int rownum, int colnum) {
		return sheet.getRow(rownum).getCell(colnum).getStringCellValue();
	}

	public Object[][] getData() {
		Object[][] data = new Object[getRowCount() - 1][getColCount()];
		for (int row = 1; row < getRowCount(); row++) {
			for (int col = 0; col < getColCount(); col++) {
				data[row - 1][col] = getCellValue(row, col);
			}
		}
		return data;
	}

}
