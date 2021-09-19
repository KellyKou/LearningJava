package com.pkg1;

import java.io.*;

public class ReadDataFromCsvTxt {
    public static void main(String[] args) throws IOException {

        File f = new File(System.getProperty("user.dir")+"\\src\\main\\java\\com\\properties\\TestData\\TestDataNew.csv");
        //Step1:Creat an object of FileReader Class
        //Charater files
        FileReader fileReader = new FileReader(f);
        //read streams of raw byte
        //FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\properties\\TestData\\TestData.properties");
        //FileOutputStream fos= new FileOutputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\properties\\TestData\\TestData2.properties");

        //Step2:change fileWriter to BufferedReader
        BufferedReader br = new BufferedReader(fileReader);

        //Step3 Read data
        System.out.println(br.readLine());
        System.out.println(br.readLine());
        System.out.println(br.read());

        //Step4 Close file
        System.out.println("success");
        br.close();
    }
}
