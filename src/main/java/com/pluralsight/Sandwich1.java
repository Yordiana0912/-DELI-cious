package com.pluralsight;

// enum Bread {WHITE, WHEAT, RYE, WRAP}
// enum SandwichSize{SIZE_4_INCH("4 inch", 5.50), SIZE_8_INCH ("8 inch", 7.00), SIZE_12_INCH("12 inch", 8.50);
  //   private final String sizeDetails;
   //  SandwichSize(String sizeDetails, double v) {this.sizeDetails = sizeDetails;
   //  }
   //  enum Meats {
    //     STEAK(SIZE_4_INCH , 1.00, SIZE_8_INCH, 2.00, SIZE_12_INCH, 3.00  ),
//    HAM(SIZE_4_INCH, 1.00, SIZE_8_INCH, 2.00, SIZE_12_INCH , 3.00),
   //      SALAMI(SIZE_4_INCH, 1.00, SIZE_8_INCH, 2.00, SIZE_12_INCH , 3.00),
      //   ROAST_BEEF(SIZE_4_INCH, 1.00, SIZE_8_INCH, 2.00, SIZE_12_INCH, 3.00),
//   CHICKEN(SIZE_4_INCH, 1.00, SIZE_8_INCH, 2.00, SIZE_12_INCH, 3.00),
      //   BACON(SIZE_4_INCH, 1.00, SIZE_8_INCH, 2.00, SIZE_12_INCH, 3.00);
//  Meats(SandwichSize size4Inch, double v, SandwichSize size8Inch, double v1, SandwichSize size12Inch, double v2) {
        // }

import java.util.List;
public class Sandwich1 {
          private String Bread;
          private String Size;
          private List<String> toppings;
          private List<String> sauces;
          private boolean toasted ;

    public Sandwich1(String bread, String size, List<String> toppings, List<String> sauces, boolean toasted) {
        Bread = bread;
        Size = size;
        this.toppings = toppings;
        this.sauces = sauces;
        this.toasted = toasted;
    }

    public String getBread() {
        return Bread;
    }

    public void setBread(String bread) {
        Bread = bread;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
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
        return Size + " " + Bread + " sandwich";
}}



