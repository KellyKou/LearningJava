package com.pkg1;

import org.apache.batik.swing.gvt.Interactor;

import java.util.ArrayList;
import java.util.Iterator;

import java.util.Objects;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        // add item in Arraylist
        arrayList.add(10);
        arrayList.add("Kelly");
        arrayList.add('K');
        arrayList.add(true);
        arrayList.add("Kelly");
        arrayList.add(false);
        arrayList.add("Henry");
        System.out.println(arrayList.size());
        System.out.println(arrayList);


        // Remove
        arrayList.remove(3);
        System.out.println(arrayList);

        // get particular item -- Fetch(go for and bring back)
        System.out.println(arrayList.get(0));

        // for loop
        for(int i=0;i<arrayList.size();i++)
        {
            System.out.println(arrayList.get(i));
        }

        //for each loop
        for(Object obj:arrayList)
        {
            System.out.println(obj);
        }

        Iterator itr = arrayList.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }


        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        integerArrayList.add(10);
        integerArrayList.add(20);
        integerArrayList.add(30);
        integerArrayList.add(40);

        int d = (Integer)arrayList.get(0);
        String d2 = (String)arrayList.get(1);
        System.out.println(d+" "+d2);

        int m=integerArrayList.get(1);
        System.out.println(m);









    }
}
