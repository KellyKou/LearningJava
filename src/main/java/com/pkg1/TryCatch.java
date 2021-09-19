package com.pkg1;

public class TryCatch {
    public static void main(String[] args) {
        try {
            int i = 10;
            System.out.println("before division");
            System.out.println(i/0);
        }catch (Throwable t) {
            System.out.println(t.getMessage());
            System.out.println(t.getCause());
            System.out.println(t.getStackTrace());
            t.printStackTrace();
        }
        finally{
            System.out.println("finally block（no matter exception threw or not）");
        }
        System.out.println("after division");
        }

    }


