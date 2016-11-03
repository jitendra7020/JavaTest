package com.example.coffee;

/**
 * Created by admin on 03/11/16.
 */

public final class Cafe {

    private int beanInStock = 0;
    private int milkInStock = 0;

    public Coffee brew(CoffeeType coffeeType) {
        return brew(coffeeType, 1);
    }

    public Coffee brew(CoffeeType coffeeType, int quantity) {
        requirePositive(quantity);

        int requiredBean = coffeeType.getRequiredBeans();
        int requiredMilk = coffeeType.getRequiredMilk();

        if(requiredBean > beanInStock || requiredMilk > milkInStock) {
            throw  new IllegalStateException("Insufficient milk or bean");
        }

        beanInStock -= requiredBean;
        milkInStock -= requiredMilk;

        return new Coffee(coffeeType, requiredBean, requiredMilk);
    }

    public void restockBean(int weightInGrams) {
        requirePositive(weightInGrams);
        beanInStock += weightInGrams;
    }

    public void restockMilk(int weightInGrams) {
        requirePositive(weightInGrams);
        milkInStock += weightInGrams;
    }

    private void requirePositive(int value) {
        if(value < 1) {
            throw  new IllegalStateException("value is less than 1");
        }
    }

    public int getBeanInStock() {
        return beanInStock;
    }

    public int getMilkInStock() {
        return milkInStock;
    }
}
