package com.example.coffee;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by admin on 03/11/16.
 */

public class CafeTest {

    @Test
    public void canBrewEspresso() {

        //Given
        Cafe cafe = new Cafe();
        cafe.restockBean(7);

        //When
        Coffee coffee = cafe.brew(CoffeeType.Espresso);

        //Then
        Assert.assertEquals(CoffeeType.Espresso, coffee.getCoffeeType());
        Assert.assertEquals(0, coffee.getMilk());
        Assert.assertEquals(7, coffee.getBean());
    }

    @Test
    public void brewingEspressoConsumeBeans() {

        //Given
        Cafe cafe = new Cafe();
        cafe.restockBean(7);

        //When
        Coffee coffee = cafe.brew(CoffeeType.Espresso);

        //Then
        Assert.assertEquals(0, cafe.getBeanInStock());
    }
}
