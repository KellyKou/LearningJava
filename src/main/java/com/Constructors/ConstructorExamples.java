package com.Constructors;

public class ConstructorExamples {
    // no return type
    // same name as the class name
    public ConstructorExamples()
    {
        System.out.println("no argument Cons");
    }
    public ConstructorExamples(int i)
    {
        System.out.println("int Cons");
    }
    public ConstructorExamples(int i,String j)
    {
        System.out.println("2 Cons");
    }
    public static void main(String[] args) {
        ConstructorExamples ce = new ConstructorExamples(5);

    }
}
