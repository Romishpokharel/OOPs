package com.romish.StaticExample;
//this is a demo to show initialization of static variable;
public class StaticInt {
    static int a=4;
    static int b;
    //will only run once when 1st object is created when the class is loaded for 1st time;
    static {
        System.out.println("i am in static block");
        b=a*5;

    }

    public static void main(String[] args) {
        StaticInt obj=new StaticInt();
        System.out.println(StaticInt.a+" "+StaticInt.b);

        StaticInt.b+=+3;
        System.out.println(StaticInt.a+ " "+StaticInt.b);
        StaticInt obj1=new StaticInt();
        System.out.println(StaticInt.a+ " "+StaticInt.b);

    }
}
