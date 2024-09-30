package com.Boyd.utils;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
public class ExcelOperations {
	String filePath;
    Sheet sheet;
    Workbook workbook;

    public ExcelOperations(String filePath, String sheetName) {
        this.filePath = filePath;
        File file = new File(filePath);

        try {
            FileInputStream fis = new FileInputStream(file);
            workbook = new XSSFWorkbook(fis);
            sheet = workbook.getSheet(sheetName);
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public HashMap<String, String> readRow(int rowNumber) {
        HashMap<String, String> hm = new HashMap<>();

        Row row = sheet.getRow(rowNumber);
        if (row != null) {
            for (int i = 0; i < row.getLastCellNum(); i++) {
                Cell cell = row.getCell(i);
                String key = sheet.getRow(0).getCell(i).toString();
                String value = getCellValueAsString(cell);
                hm.put(key, value);
            }
        }
        return hm;
    }

    private String getCellValueAsString(Cell cell) {
        String cellValue;
        if (cell == null) {
            cellValue = "";
        } else {
            switch (cell.getCellType()) {
                case STRING:
                    cellValue = cell.getStringCellValue();
                    break;
                case NUMERIC:
                    if (DateUtil.isCellDateFormatted(cell)) {
                        cellValue = cell.getLocalDateTimeCellValue().toString();
                    } else {
                        cellValue = String.valueOf(cell.getNumericCellValue());
                    }
                    break;
                case BOOLEAN:
                    cellValue = String.valueOf(cell.getBooleanCellValue());
                    break;
                case BLANK:
                    cellValue = "";
                    break;
                default:
                    cellValue = "";
            }
        }
        return cellValue;
    }

    public void writeResult(int rowNumber, String key, String result) {
        Row row = sheet.getRow(rowNumber);
        if (row == null) {
            row = sheet.createRow(rowNumber);
        }

        int columnIndex = getColumnIndex(key);

        Cell cell = row.getCell(columnIndex);
        if (cell == null) {
            cell = row.createCell(columnIndex);
        }
        cell.setCellValue(result);

        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            workbook.write(fos);
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private int getColumnIndex(String columnName) {
        for (int i = 0; i < sheet.getRow(0).getLastCellNum(); i++) {
            Cell cell = sheet.getRow(0).getCell(i);
            if (cell != null && cell.toString().equals(columnName)) {
                return i;
            }
        }
        return -1;
    }

    public int getRowCount() {
        return sheet.getLastRowNum() + 1;
    }

    public int getColumnCount() {
        return sheet.getRow(0).getLastCellNum();
    }

    public void closeWorkbook() {
        try {
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
