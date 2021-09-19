package com;

public class WrapperDemo {
    public static void main(String[] args) {
        int i=10; // primitive data type
        Integer integer1 = new Integer(i); // Wrapping primitive data type into object - Autoboxing
        System.out.println(integer1);

        int j = integer1; // unWrapping -- auto unboxing
        System.out.println(j);
    }
}
