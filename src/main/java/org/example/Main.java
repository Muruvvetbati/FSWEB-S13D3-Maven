package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Person person = new Person("John", "Doe", 20);

        System.out.println("Firstname: " + person.getFirstName());

        System.out.println("LastName: " + person.getLastName());

        System.out.println("Age: " + person.getAge());

        System.out.println("Hobies: " + person.getHobies());

        System.out.println("*********************" );

        Person secondPerson = new Person("Muruvvet","Batı",30,20000,Boolean.FALSE,new String[]{"camping","reading"});
        System.out.println("Firstname: " +secondPerson.getFirstName());

        System.out.println("LastName: " + secondPerson.getLastName());

        System.out.println("Age: " + secondPerson.getAge());

        System.out.println("Hobies: " + Arrays.toString(secondPerson.getHobies()));






        Wall wall = new Wall(5,4);

        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);

        System.out.println("width= " + wall.getWidth());

        System.out.println("height= " + wall.getHeight());

        System.out.println("area= " + wall.getArea());
    }



}
