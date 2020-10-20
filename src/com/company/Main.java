package com.company;

import static com.company.Building.list_of_owners;

public class Main {

    public static void main(String[] args) {

        SmallHouse smallHouse1 = new SmallHouse(5,"Jorge", "Santry",1,1,1,1);
        SmallHouse smallHouse2 = new SmallHouse(5,"Michele","Sandyford",1,1,1,1);
        SmallHouse smallHouse3 = new SmallHouse(5,"Janis","GrandCanal",1,1,1,1);
        SmallHouse smallHouse4 = new SmallHouse(5,"Edu","Suton",1,1,1,1);

        list_of_owners ();

    }
}
