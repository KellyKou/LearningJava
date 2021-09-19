package com.pkg1;

import java.io.*;
import java.util.Properties;

public class WriteDataProperties {
    public static void main(String[] args) throws IOException {


        //Step1:Creat an object of FileReader Class
        //Charater files
        FileWriter fileWriter = new FileWriter("C:\\Users\\xueti\\IdeaProjects\\LearningJava\\src\\main\\java\\com\\properties\\TestData\\TestData.properties",true);
        //read streams of raw byte
        //FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\properties\\TestData\\TestData.properties");
        FileOutputStream fos= new FileOutputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\properties\\TestData\\TestData2.properties");

        //Step2:Create an object of property class
        Properties p = new Properties();


        // Step3: Use SetProperty Method
        p.setProperty("Name","Kelly");
        p.store(fileWriter,"this is comments");


        FileReader fr = new FileReader("C:\\Users\\xueti\\IdeaProjects\\LearningJava\\src\\main\\java\\com\\properties\\TestData\\TestData.properties");
// read again
        p.load(fr);
        System.out.println(p.getProperty("url"));
        System.out.println(p.getProperty("user"));
        System.out.println(p.getProperty("Name"));

        Properties p1 = new Properties();
        p1.setProperty("s","Kk");
        p1.store(fos,"this is comments");
        FileReader fr1 = new FileReader(System.getProperty("user.dir")+"\\src\\main\\java\\com\\properties\\TestData\\TestData1.properties");
// read again
        p1.load(fr1);
        System.out.println(p1.getProperty("url"));
        System.out.println(p1.getProperty("user"));
        System.out.println(p1.getProperty("Name"));
    }


}

