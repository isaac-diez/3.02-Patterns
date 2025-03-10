package org.example.Model;

import java.util.ArrayList;

public class Topping {

    private String topping1;
    private String topping2;
    private String topping3;


    public Topping(String topping1, String topping2, String topping3) {
        this.topping1 = topping1;
        this.topping2 = topping2;
        this.topping3 = topping3;
    }

    public String printToppings() {

        String toppings = this.topping1 +", "+ this.topping2 +", "+ this.topping3;

        return toppings;

    }


}
