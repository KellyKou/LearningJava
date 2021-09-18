package com.pkg1;

import com.pkg2.ClassB;

public class ClassA extends ClassB {


    public static void main(String[] args) {
        System.out.println("Access modifiers");
        ClassA ca=new ClassA();

    }

    public int pbVrb=1;//
    int dfVab=2;// only accessible within this package
    private int prVrb=3; // only accessible within this class
    protected int ptVrb=4;// can add extend Class A other package class no;subclass yes

    public void pvM()
    {
        System.out.println("Access modifiers");
    }

    void dfM()
    {

    }

    private void prM()
    {

    }

    protected void ptM()
    {

    }

//Encapsulation -- secure data + validation
    private int length;
    private int height;

    public void setHL(int l,int h)
    {
        if(l>=2 && h>=5)
        {
            System.out.println("sds" + l + " " + h);
        }
        else
        {
            System.out.println("invalid dimension");
        }

    }

    public int setLength(int l)
    {
        if(l>=2)
        {
            length=l;
        }
        else
        {
            System.out.println("INVALID");

    }
        return length;
    }
    public int getLength()
    {
        return length;
    }

    public int setHeight(int h)
    {
        if(h>=10)
        {
            height=h;
        }
        else
        {
            System.out.println("INVALID");

        }
        return height;
    }
    public int getHeight()
    {
        return height;
    }




}
