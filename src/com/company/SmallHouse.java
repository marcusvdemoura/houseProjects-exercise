package com.company;

public class SmallHouse extends Building {

    private String owner;
    private int room;
    private int bathroom;
    private int kitchen;
    private int occupants;



    public SmallHouse( int walls, String owner, String neighborhood, int room, int bathroom, int kitchen, int occupants) {
        super(walls, 1, owner, neighborhood);
        this.bathroom = bathroom;
        this.room = room;
        this.kitchen = kitchen;
        this.owner = owner;
        this.occupants = occupants;

    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public int getBathroom() {
        return bathroom;
    }

    public void setBathroom(int bathroom) {
        this.bathroom = bathroom;
    }

    public int getKitchen() {
        return kitchen;
    }

    public void setKitchen(int kitchen) {
        this.kitchen = kitchen;
    }

    public int getOccupants() {
        return occupants;
    }

    public void setOccupants(int occupants) {
        this.occupants = occupants;
    }

    public String toString (){
        System.out.println("This house belongs to "+ owner + " and it has " + room + " room(s), " +
                bathroom + " bathroom(s), " + kitchen+" kitchen(s) and " + occupants + " occupants.");
        return null;
    }
}
