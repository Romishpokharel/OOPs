package com.romish.StaticExample;

//outside class cannot be static
public class InnerClass {
    //inner class can be static
    //static class can exist without needing an instance of outer class,
    // if the inner class were non static you would need instance of outer class
    //Declaring a class static does NOT make the members of the class (fields and methods) static.
    static class Test{
        String name;

        public Test(String name) {
            this.name = name;
        }

        public static void main(String[] args) {
            Test obj1=new Test("rohit");
            Test obj2=new Test("Suresh");
            System.out.println(obj1.name);
            System.out.println(obj2.name);
        }

    }

}
