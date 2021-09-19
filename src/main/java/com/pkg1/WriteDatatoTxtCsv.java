package com.pkg1;

import java.io.*;
import java.util.Properties;

public class WriteDatatoTxtCsv {
        public static void main(String[] args) throws IOException {

File f = new File(System.getProperty("user.dir")+"\\src\\main\\java\\com\\properties\\TestData\\TestDataNew.csv");
            //Step1:Creat an object of FileReader Class
            //Charater files
            FileWriter fileWriter = new FileWriter(f,true);
            //read streams of raw byte
            //FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\properties\\TestData\\TestData.properties");
            //FileOutputStream fos= new FileOutputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\properties\\TestData\\TestData2.properties");

            //Step2:change fileWriter to BufferedWriter
            BufferedWriter br = new BufferedWriter(fileWriter);

            //Step3 write data
            for(int i=1;i<10;i++) {
                br.write("success" + ",");
            }
            //Step4 Close file
            System.out.println("success");
            br.close();




    }


}
