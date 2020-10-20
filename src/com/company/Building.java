package com.company;
import java.util.Collections;
import java.util.HashMap;

public class Building {

    private int walls;
    private int roof;
    private String owner;
    private String neighborhood;
    public static HashMap <String, String> list_of_owners = new HashMap<>();



    public Building(int walls, int roof, String owner, String neighborhood) {
        this.walls = walls;
        this.roof = roof;
        this.owner = owner;
        this.neighborhood = neighborhood;
        list_of_owners.put(owner, neighborhood);


    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;

    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }


    public int getWalls() {

        return walls;
    }

    public void setWalls(int walls) {

        this.walls = walls;
    }

    public int getRoof() {

        return roof;
    }

    public void setRoof(int roof) {

        this.roof = roof;
    }


}