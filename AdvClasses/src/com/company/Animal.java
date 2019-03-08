package com.company;

import javax.naming.Name;

/**
 * Created by lw4200 on 3/5/2019.
 */
public class Animal {

    //properties
    String species;
    String name;

    //constructor(s)
    public Animal(String Species, String Name) {
        name = Name;
        species = Species;
    }
    //methods
    public void MakeSound(){
        System.out.println("grrr");
    }
    public void PrintName(){
        System.out.println(name);
    }
}
