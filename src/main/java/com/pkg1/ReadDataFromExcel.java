package com.pkg1;

import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadDataFromExcel {
    public static void main(String[] args) throws IOException {

        File f = new File(System.getProperty("user.dir")+"\\src\\main\\java\\com\\properties\\TestData\\TestData.xls");
        FileInputStream fileInputStream=new FileInputStream(f);

        Workbook workbook = WorkbookFactory.create(fileInputStream);
        Sheet sheet1=workbook.getSheetAt(0);

        Row r0=sheet1.getRow(0);
        Cell c0=r0.getCell(0);

        System.out.println(c0);


        Row r1=sheet1.getRow(1);
        Cell r1c0=r1.getCell(0);

        System.out.println(r1c0);

        for (Row row:sheet1)
        {
            for(Cell cell: row)
            {
                switch(cell.getCellType())
                {
                    case STRING:
                        System.out.print(cell.getStringCellValue()+" ");
                        break;

                    case BOOLEAN:
                        System.out.print(cell.getBooleanCellValue()+" ");
                        break;
                    case NUMERIC:
                        System.out.print(cell.getNumericCellValue()+" ");
                        break;
                    default:
                        break;
                }
            }
            System.out.println();
        }

        fileInputStream.close();



    }
}
