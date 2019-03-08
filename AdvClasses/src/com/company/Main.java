package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Dog doggy = new Dog("jerry", true);
        doggy.MakeSound();
        doggy.PrintName();
        doggy.GetDockedTail();

        Cat kitty = new Cat("jim");
        kitty.PrintName();
        kitty.BeHappy();

        OrangeTabby john = new OrangeTabby("jimbo");

        RussianBlue tim = new RussianBlue("donny");

        Garfield garfield = new Garfield();

        Animal animalMan = new Animal("man","animal");
    }
}
