package com.romish.Inheritance;

public class Box {
double l;
double b;
double h;
Box(){
    this.h=-1;
    this.b=-1;
    this.l=-1;


}
//cbe
Box(double side){
    super();//object class
    this.l=side;
    this.b=side;
    this.h=side;

}
Box(double l,double b,double h){
    this.l=l;
    this.b=b;
    this.h=h;

}
Box(Box old){
    this.l=old.l;
    this.b=old.b;
    this.h=old.h;
}
public void Information(){
    System.out.println("running the Box");
}

}
