package com.company;

/**
 * Created by lw4200 on 3/7/2019.
 */
public class Cat {

    //properties
    String species;
    String name;

    //constructor
    public Cat(String Name){
        species = "Cat";
        name = Name;
    }

    //methods
    public void MakeSound(){
        System.out.println("meow");
    }
    public void PrintName(){
        System.out.println(name);
    }
    public void BeHappy(){
        System.out.println("purrr");
        MakeSound();
        SeeLaser();
    }
    public void SeeLaser(){
        System.out.println("*cat pounces*");
    }

}
