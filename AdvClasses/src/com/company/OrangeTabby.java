package com.company;

/**
 * Created by lw4200 on 3/7/2019.
 */
public class OrangeTabby {

    //properties
    String species;
    String name;

    //constructor
    public OrangeTabby(String Name){
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
        LayOnLap();
        System.out.println("*takes a nap*");
    }
    public void LayOnLap(){
        System.out.println("*cuddles in owner's lap");
    }
    public void SeeLaser(){
        System.out.println("*cat pounces*");
    }
}
