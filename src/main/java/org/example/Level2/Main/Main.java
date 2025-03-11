package org.example.Level2.Main;

import org.example.Level2.Model.*;

public class Main {
    public static void main(String[] args) {

        StockMovement stockMovement = new StockMovement("GOGL");

        Agency agency1 = new Agency("Lehman");
        Agency agency2 = new Agency("Standard");

        stockMovement.addObserver(agency1);
        stockMovement.addObserver(agency2);

        stockMovement.setStockMovement(true, "up");

    }
}