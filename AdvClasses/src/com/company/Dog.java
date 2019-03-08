package com.company;

/**
 * Created by lw4200 on 3/6/2019.
 */
public class Dog {

    //properties
    String species;
    String name;
    boolean dockedTail;

    //constructor
    public Dog(String Name, boolean DockedTail){
        species = "Dog";
        name = Name;
        dockedTail = DockedTail;
    }

    //methods
    public void MakeSound(){
        System.out.println("woof");
    }
    public void PrintName(){
        System.out.println(name);
    }
    public void PlayFetch(){
        System.out.println("*chases ball five times then quits*");
    }
    public boolean GetDockedTail(){
        return dockedTail;
    }
}
