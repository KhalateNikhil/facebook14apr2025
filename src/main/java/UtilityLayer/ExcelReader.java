package UtilityLayer;

import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	FileInputStream fis;
	XSSFWorkbook workbook;

	public ExcelReader(String path) throws IOException {
		fis = new FileInputStream(path);
		workbook = new XSSFWorkbook(fis);
	}

	public int getTotalRowCount(int sheetindex) {
		return workbook.getSheetAt(sheetindex).getLastRowNum() + 1;
	}

	public int getTotalCellCount(int sheetindex) {
		return workbook.getSheetAt(sheetindex).getRow(0).getLastCellNum();

	}

	public Object getSpecificSheetData(int sheetindex, int row, int cell) {
		XSSFCell cells = workbook.getSheetAt(sheetindex).getRow(row).getCell(cell);

		if (cells == null) {
			return "";
		}

		else if (cells.getCellType() == XSSFCell.CELL_TYPE_STRING) {
			return cells.getStringCellValue();
		}

		else if (cells.getCellType() == XSSFCell.CELL_TYPE_NUMERIC) {
			return cells.getRawValue();
		}

		else if (cells.getCellType() == XSSFCell.CELL_TYPE_BOOLEAN) {
			return cells.getBooleanCellValue();
		} else if (cells.getCellType() == XSSFCell.CELL_TYPE_FORMULA) {
			return cells.getCellFormula();
		} else {
			return cells.getErrorCellString();
		}

	}

	public Object getAllSheetData(int sheetindex) {
		int rows = getTotalRowCount(sheetindex);
		int cells = getTotalCellCount(sheetindex);

		Object[][] data = new Object[rows][cells];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cells; j++) {
				data[i][j] = getSpecificSheetData(sheetindex, i, j);
			}
		}
		return data;

	}

}
