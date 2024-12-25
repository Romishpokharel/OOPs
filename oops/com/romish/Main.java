package com.romish;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Audi", 550000);
        System.out.println(car);

        car.changeName("BMW");
        car.greeting();
        Car car1 = new Car("sumo", 1234);
        car1.changeName("Scorpio");
        car1.greeting();
        Car random = new Car(car1);
        System.out.println(random.name);
        Car random1 = new Car();
        System.out.println(random1.price);
        Car one = new Car();
        Car two = one;
        one.name = "Romish car";
        System.out.println(two.name);
         A kunal = new A("subash");
        kunal.name = "Rohit";
        System.out.println(kunal.name);
        //we can't do this kunal=new com.romeo.A("sohna")//when a final is non primitive you cannot reassign it;


    }


}
      class Car{
        String name;
        int price;
        void greeting(){
            System.out.println("my car name is " +this.name);

         }
         void changeName(String naam){
            this.name=naam;
         }

    Car(String name,int price){
        this.name=name;
        this.price=price;}
         //
         Car()//this is how you call a constructor from another constructor;
         {//internally  new com.romeo.Car( Duster,55888)
            this("Duster",55888);
         }
         Car(Car other ) {
             this.name = other.name;
             this.price = other.price;}
          public String toString() {
              return "com.romeo.Car Name: " + name + ", Price: $" + price;
          }

      }

class A {
    String name;
    final int num = 10;

    A(String name) {
        this.name = name;


    }


}
        




