package com.romish.Inheritance;

public class BoxPrice extends BoxWeight{
    double price;
    BoxPrice() {
        super();
        this.price = -1;
    }
       BoxPrice(BoxPrice other){
        super((other));
        this.price=other.price;
       }
       BoxPrice(double l,double b,double h,double weight,double price){
        super(l,b,h,weight);
        this.price=price;
    }
    BoxPrice(double side,double weight, double price){
        super(side,weight);//it means the construct BoxWeight should have two constructor;
        this.price=price;


    }



    }

