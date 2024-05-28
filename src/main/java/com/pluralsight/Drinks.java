package com.pluralsight;

public class Drinks {
    private String drinkName;
    private String size;

    public Drinks(String drinkName, String size) {
        this.drinkName = drinkName;
        this.size = size;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    @Override
    public String toString() {
        return size + " " + drinkName + " drink";
    }
}
