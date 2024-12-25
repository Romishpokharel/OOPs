package com.romish.polymorphism;

import java.awt.*;

public class Main{
    public static void main(String[] args) {
        Shapes shape=new Shapes();
        Circle c=new Circle();
        Triangle t=new Triangle();
        Shapes  s=new Square();//i
        s.Area();//iw will have the access to the one in the object i.e Square;
        /*c.Area();
        t.Area();
        s.Area();*/

        int result=Numbers.sum(5,6);
        System.out.println(result);


        }
    }

