package org.example;

import java.util.ArrayList;

public class DataStructureDemo {
    public static void main(String[] args){
        String[] strArray = new String[20];
        Employee[] empArray = new Employee[20];
        strArray[0]="Sahil";

        //strArray[1]=new Employee();
        //org.example.Employee cannot be converted to java.lang.String

        ArrayList l = new ArrayList();
        //int --> Integer
        l.add("Sahil");
        l.add(new Employee());
        //ArrayList -> it can accept both types og Objects

        //String name = l.get(0);
        //java: incompatible types: java.lang.Object cannot be converted to java.lang.String

        //String name = (String) l.get(0);
        //this will work

        //Employee name = (Employee) l.get(0);
        //class java.lang.String cannot be cast to class org.example.Employee
        // (java.lang.String is in module java.base of loader 'bootstrap'; org.example.Employee
        // is in unnamed module of loader 'app')
        //	at org.example.DataStructureDemo.main(DataStructureDemo.java:26)






    }
}
