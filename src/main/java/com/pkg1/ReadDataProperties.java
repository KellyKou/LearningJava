package com.pkg1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadDataProperties {
    public static void main(String[] args) throws IOException {


    //Step1:Creat an object of FileReader Class
        //Charater files
    //FileReader fr = new FileReader("C:\\Users\\xueti\\IdeaProjects\\LearningJava\\src\\main\\java\\com\\properties\\TestData\\TestData.properties");
       //read streams of raw byte
    FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\properties\\TestData\\TestData.properties");
    //Step2:Create an object of property class
    Properties p = new Properties();

    //Step3: Load the file
        //p.load(fr);
        p.load(fis);

        // Step4: Use GetProperty Method
        System.out.println(p.getProperty("url"));
        System.out.println(p.getProperty("user"));

    }


}
