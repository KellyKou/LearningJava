package com.pkg2;

import com.pkg1.ClassA;

public class ClassB {
    public static void main(String[] args) {
        ClassA a = new ClassA();
          int m = a.setHeight(10);
        int n = a.setLength(5);

        System.out.println(a.getHeight()+a.getLength());
        a.setHL(m,n);
    }
    // compile time polymorphism -- same method name with different parameters
public void login(String s,String f)
{

}

    public void login(int s,String f)
    {

    }

    //runtime polymorphism -- override -- same method name with same parameters

    public void mN()
    {
        System.out.println("noise");
    }




}
