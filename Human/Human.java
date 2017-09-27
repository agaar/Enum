package com.company;

import java.util.ArrayList;
import java.util.List;

public class Human {
    private String name;
    private int age;
    private EyeColour eyeColour;
    private HairColour hairColour;

    public Human(String name, int age, EyeColour eyeColour, HairColour hairColour) {
        this.name = name;
        this.age = age;
        this.eyeColour = eyeColour;
        this.hairColour = hairColour;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public EyeColour getEyeColour() {
        return eyeColour;
    }

    public HairColour getHairColour() {
        return hairColour;
    }

    public static void main(String[] args) {
        List<Human> humanList = new ArrayList<>();
        Human michael = new Human("Michael", 35,  EyeColour.BLUE, HairColour.BLACK);
        Human sarah = new Human("Sarah", 30,  EyeColour.BROWN, HairColour.BROWN);
        humanList.add(michael);
        humanList.add(sarah);

        for (Human h: humanList) {
            System.out.println(h.getName() + " is " + h.getAge()+ ", has " +
                    h.getEyeColour().toString().toLowerCase() + " eyes and " +
                    h.getHairColour().toString().toLowerCase() + " hair.");
        }
    }
}