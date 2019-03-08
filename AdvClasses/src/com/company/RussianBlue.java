package com.company;

/**
 * Created by lw4200 on 3/7/2019.
 */
public class RussianBlue {

    //properties
    String species;
    String name;

    //constructor
    public RussianBlue(String Name){
        species = "cat";
        name = Name;
    }

    //methods
    public void MakeSound(){
        System.out.println("Hisss");
    }
    public void PrintName() {
        System.out.println(name);
    }
    public void BeHappy(){
        System.out.println("purrr");
        SeeLaser();
    }
    public void SeeLaser(){
        System.out.println("*cat pounces*");
    }
}
