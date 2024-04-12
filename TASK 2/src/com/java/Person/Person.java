package com.java.Person;

public class Person {
String name;
int age = 18;//Default age of a person

    public static void main(String[] args) {
        Person person = new Person();//obj creation
        person.name = "guvi";
        person.display();

    }
    //method to display
    void display (){
        System.out.println(name);
        System.out.println(age);
    }

}

