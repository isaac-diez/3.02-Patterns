package org.example.Main;

import org.example.Model.MestrePizzer;
import org.example.Model.Pizza;
import org.example.Model.Pizzero;

public class Main {
    public static void main(String[] args) {

        MestrePizzer mestrePizzer = new MestrePizzer();

        Pizzero pizzero = new Pizzero();

        mestrePizzer.buildPizzaHawaiiFamily(pizzero);
        Pizza hawaii = pizzero.getResult();
        System.out.println("Pizza:\n" + hawaii.print());

        mestrePizzer.buildPizzaBBQLarge(pizzero);
        Pizza bbq = pizzero.getResult();
        System.out.println("Pizza:\n" + bbq.print());

        mestrePizzer.buildPizzaVeggieMedium(pizzero);
        Pizza veggie = pizzero.getResult();
        System.out.println("Pizza:\n" + veggie.print());


    }
}