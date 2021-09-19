package com.pkg1;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteDataToExcel {
    public static void main(String[] args) throws IOException {
        //
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet1=workbook.createSheet("S1");
        Row r0 = sheet1.createRow(0);
        Cell c0 = r0.createCell(0);
        c0.setCellValue("kelly");

        Row r1 = sheet1.createRow(1);
        Cell c1 = r1.createCell(1);
        c1.setCellValue("Henry");

        //create file
        File f=new File(System.getProperty("user.dir")+"\\src\\main\\java\\com\\properties\\TestData\\TestData.xls");
        FileOutputStream fileOutputStream = new FileOutputStream(f);
        //Write into work book
        workbook.write(fileOutputStream);
        //close workbook &
        fileOutputStream.close();
        workbook.close();

        System.out.println("success");




    }

}
