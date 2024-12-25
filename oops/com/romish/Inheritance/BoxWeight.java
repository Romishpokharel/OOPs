package com.romish.Inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight() {
        this.weight =-1;
    }

    public BoxWeight(BoxWeight other) {
        super(other);
        this.weight = other.weight;
    }


    public BoxWeight(double h, double b, double l, double weight){
         super(l,b,h);//this is calling parent class constructor;
        //used to initialize value in the constructor;
        this.weight=weight;

    }
    public BoxWeight(double side,double weight){
super(side );//it will call the constructor with one paramether i.e Box(double side){}
this.weight=weight;
    }


}
