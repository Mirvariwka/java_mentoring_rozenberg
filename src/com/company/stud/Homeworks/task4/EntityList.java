package com.company.stud.Homeworks.task4;

import java.util.ArrayList;

public class EntityList {
    public static void main(String[] args) {
        Entity en1 = new Entity("Ole4ka");
        Entity en2 = new Entity("Lyuda");
        Entity en3 = new Entity("Marfa");
        Entity en4 = new Entity("Klava");
        Entity en5 = new Entity("Oliviya");
        ArrayList<Entity> enList = new ArrayList<>();
        enList.add(en1);
        enList.add(en3);
        enList.add(en4);
        enList.add(en5);
        System.out.println(enList);
    }


}
