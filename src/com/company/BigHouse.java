package com.company;

public class BigHouse extends SmallHouse {

    private int swimmingPool;
    private int garage;
    private int attic;
    private int basement;



    public BigHouse(int walls, String owner, String neighborhood, int room, int bathroom, int kitchen, int occupants, int swimmingPool, int garage, int attic, int basement) {
        super(walls, owner, neighborhood, room, bathroom, kitchen, occupants);
        this.swimmingPool = swimmingPool;
        this.basement = basement;
        this.garage = garage;
        this.attic = attic;


    }

    public int getSwimmingPool() {
        return swimmingPool;
    }

    public int getAttic() {
        return attic;
    }

    public void setAttic(int attic) {
        this.attic = attic;
    }

    public int getBasement() {
        return basement;
    }

    public void setBasement(int basement) {
        this.basement = basement;
    }

    public void setSwimmingPool(int swimmingPool) {
        this.swimmingPool = swimmingPool;
    }

    public int getGarage() {
        return garage;
    }

    public void setGarage(int garage) {
        this.garage = garage;
    }
    @Override
    public String toString(){
        super.toString();
        System.out.println("It also has "+ swimmingPool+" swimming pool(s), " + attic+" attic(s), "+ basement+" basement(s) and "+garage+" garage(s).");
        return null;
    }


}
