package com.pkg2;

public class Circle extends Shapes
{
    public static void main(String[] args)
    {
        Circle c= new Circle();
        c.colorShape();
        c.drawShape();


    }

    @Override
    public void drawShape() {
        System.out.println("Dc");
    }
}
