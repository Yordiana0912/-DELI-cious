package com.pluralsight;

import java.util.List;
public class Sandwich1 {
          private String bread;
          private String size;
          private List<String> toppings;
          private List<String> sauces;
          private boolean toasted ;

          private double sandwichTotal;
          private String meatChoice;
          private boolean extraCheese;
          private boolean extraMeat;

    public Sandwich1(String bread, String size, List<String> toppings, List<String> sauces, boolean toasted, double sandwichTotal, String meatChoice, boolean extraCheese, boolean extraMeat) {
        this.bread = bread;
        this.size = size;
        this.toppings = toppings;
        this.sauces = sauces;
        this.toasted = toasted;
        this.sandwichTotal = sandwichTotal;
        this.meatChoice = meatChoice;
        this.extraCheese = extraCheese;
        this.extraMeat = extraMeat;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public void setExtraCheese(boolean extraCheese) {
        this.extraCheese = extraCheese;
    }

    public boolean isExtraMeat() {
        return extraMeat;
    }

    public void setExtraMeat(boolean extraMeat) {
        this.extraMeat = extraMeat;
    }

    public String getMeatChoice() {
        return meatChoice;
    }

    public void setMeatChoice(String meatChoice) {
        this.meatChoice = meatChoice;
    }

    public double getSandwichTotal() {
        return sandwichTotal;
    }

    public void setSandwichTotal(double sandwichTotal) {
        this.sandwichTotal = sandwichTotal;
    }



    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        bread = bread;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        size = size;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    public List<String> getSauces() {
        return sauces;
    }

    public void setSauces(List<String> sauces) {
        this.sauces = sauces;
    }

    public boolean isToasted() {
        return toasted;
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }
    @Override
    public String toString() {
        return size + " " + bread + " sandwich";
}}



