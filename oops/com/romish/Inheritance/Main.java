package com.romish.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box=new Box();
       Box box1=new Box(box);
        System.out.println(box.h +" "+box.b + " "+box.h);

/*BoxWeight b1=new BoxWeight(5,6,7,8);
        System.out.println(b1.h +" "+b1.b + " "+b1.l + " "+b1.weight);
      BoxWeight b2=new BoxWeight(b1);
        System.out.println(b2.weight);*/
        /*Box box3=new BoxWeight();
        System.out.println(box3.l);*/
        BoxPrice bp=new BoxPrice(4,5,6);
BoxWeight bw = new BoxWeight(4,6,7,8);
        System.out.println(bw.weight);


}
    }

