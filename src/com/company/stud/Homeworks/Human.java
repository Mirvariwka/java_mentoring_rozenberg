package com.company.stud.Homeworks;

import static com.company.stud.Homeworks.Pet.*;

public class Human {
    public Pet pet;

    public Human(Pet pet) {
        this.pet = pet;

    }

    public void playWithMyPet() {
        System.out.println("I have a " + this.pet);
        System.out.println("I play with my " + this.pet);
        System.out.println(this.pet.getUmenie());
    }

    public void playWithAll() {
        System.out.print("I play with " + KITTY);
        System.out.println(KITTY.getUmenie());
        System.out.print("I play with " + DOGGY);
        System.out.println(DOGGY.getUmenie());
        System.out.print("I play with " + FISH);
        System.out.println(FISH.getUmenie());
    }
}
