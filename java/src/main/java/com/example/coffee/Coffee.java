package com.example.coffee;

/**
 * Created by admin on 03/11/16.
 */

public final class Coffee {

    private final CoffeeType coffeeType;
    private final int bean;
    private final int milk;

    public Coffee(CoffeeType coffeeType, int bean, int milk) {
        this.coffeeType = coffeeType;
        this.bean = bean;
        this.milk = milk;
    }

    public CoffeeType getCoffeeType() {
        return coffeeType;
    }

    public int getBean() {
        return bean;
    }

    public int getMilk() {
        return milk;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "coffeeType=" + coffeeType +
                ", bean=" + bean +
                ", milk=" + milk +
                '}';
    }
}
