package com.example.coffee;

/**
 * Describes the type of coffee
 */

public enum CoffeeType {

    Espresso (7, 0),

    Latte (7, 227);


    private final int requiredBeans;
    private final int requiredMilk;

    CoffeeType(int requiredBeans, int requiredMilk) {
        this.requiredBeans = requiredBeans;
        this.requiredMilk = requiredMilk;
    }

    public int getRequiredBeans() {
        return requiredBeans;
    }

    public int getRequiredMilk() {
        return requiredMilk;
    }
}
