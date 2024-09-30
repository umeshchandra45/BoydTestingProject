package com.Boyd.utils;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ExcelUtils {
	
	public static Map<String, String> readExcelData(File file, String sheetName) {
        Map<String, String> dataMap = new HashMap<>();
        try (FileInputStream fis = new FileInputStream(file);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheet(sheetName);
            if (sheet == null) {
                throw new IllegalArgumentException("Sheet with name " + sheetName + " does not exist.");
            }

            int rowCount = sheet.getPhysicalNumberOfRows();
            for (int i = 1; i < rowCount; i++) {
                Row row = sheet.getRow(i);
                if (row != null) {
                    Cell keyCell = row.getCell(0);
                    Cell valueCell = row.getCell(1);

                    if (keyCell != null && valueCell != null) {
                        String key = keyCell.getStringCellValue().trim();
                        String value = "";
                        switch (valueCell.getCellType()) {
                            case STRING:
                                value = valueCell.getStringCellValue();
                                break;
                            case NUMERIC:
                                if (DateUtil.isCellDateFormatted(valueCell)) {
                                    value = valueCell.getLocalDateTimeCellValue().toString();
                                } else {
                                    value = String.valueOf(valueCell.getNumericCellValue());
                                }
                                break;
                            case BOOLEAN:
                                value = String.valueOf(valueCell.getBooleanCellValue());
                                break;
                            case BLANK:
                                value = "";
                                break;
                            default:
                                value = "";
                        }
                        dataMap.put(key, value);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dataMap;
    }

    public static void writeExcelData(File file, String sheetName, Map<String, String> data) {
        try (FileInputStream fis = new FileInputStream(file);
             Workbook workbook = new XSSFWorkbook(fis);
             FileOutputStream fos = new FileOutputStream(file)) {

            Sheet sheet = workbook.getSheet(sheetName);
            if (sheet == null) {
                sheet = workbook.createSheet(sheetName);
            }

            int rowCount = sheet.getPhysicalNumberOfRows();
            for (Map.Entry<String, String> entry : data.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();

                Row row = sheet.getRow(rowCount);
                if (row == null) {
                    row = sheet.createRow(rowCount);
                }

                Cell keyCell = row.createCell(0);
                keyCell.setCellValue(key);

                Cell valueCell = row.createCell(1);
                valueCell.setCellValue(value);

                // Add Pass/Fail status
                Cell statusCell = row.createCell(2);
                statusCell.setCellValue(value.equals("ExpectedValue") ? "Pass" : "Fail");

                rowCount++;
            }

            workbook.write(fos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


