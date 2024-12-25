package com.romish.StaticExample;

public class Main {
    public static void main(String[] args) {


    Human romish=new Human("Romish POkharel",22,20000);
    Human robin=new Human("Robin POkharel",18,15000);
        /*System.out.println(robin.population);
        System.out.println(romish.population);*/
       //it will still work
        System.out.println(Human.population);
        System.out.println(Human.population);
//fun();
        fun();

}
//this is not dependent on object
    //but the function you are using in it does not depend on instances
static void fun(){
        Main obj =new Main();
        obj.greeting();
        obj.fun2();
//greeting();
    System.out.println("hi romish");
    //you cannnot access non static stuff without referncing their instances in a static content
}
//we know something that is not static,belongs to an object;

void greeting(){
    System.out.println("greting from");
//we can access static in non static;
    //fun();
}
void fun2(){
        greeting();
    System.out.println("i am fucking busy");


}

}




