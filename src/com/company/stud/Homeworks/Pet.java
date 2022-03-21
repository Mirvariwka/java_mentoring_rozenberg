package com.company.stud.Homeworks;

public enum Pet {
    KITTY("kitty meowing cute"), DOGGY("doggy barking and jumping"), FISH("fish swims in a circe");
    private String umenie;

    Pet(String umenie) {
        this.umenie = umenie;
    }

    public String getUmenie() {
        return umenie;
    }
}
