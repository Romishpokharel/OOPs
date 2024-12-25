package com.romish.StaticExample;

public class Human {
    String name;
    int age;
    int salary;
static long population;
static void message(){
    System.out.println("hey mr!");
}

    public Human(String name,int age,int salary) {
        this.age = age;
        this.salary=salary;
        this.name=name;
        Human.population+=1;
        Human.message();
    }
}
