package com.example.coffee;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by admin on 03/11/16.
 */

public class CafeTest {

    private final int ESPRESSO_BEANS = CoffeeType.Espresso.getRequiredBeans();
    private final int NO_MILK = 0;
    private final int NO_BEAN = 0;
    private final int LATTE_BEANS = CoffeeType.Latte.getRequiredBeans();
    private final int LATTE_MILK = CoffeeType.Latte.getRequiredMilk();

    private Cafe cafeWithBeans() {
        Cafe cafe = new Cafe();
        cafe.restockBean(ESPRESSO_BEANS);
        return cafe;
    }

    @Test
    public void canBrewEspresso() {

        //Given
        Cafe cafe = cafeWithBeans();

        //When
        Coffee coffee = cafe.brew(CoffeeType.Espresso);

        //Then
        Assert.assertEquals("Wrong coffee type", CoffeeType.Espresso, coffee.getCoffeeType());
        Assert.assertEquals("Wrong amount of milk", NO_MILK, coffee.getMilk());
        Assert.assertEquals("Wrong number of beans", ESPRESSO_BEANS, coffee.getBean());
    }

    @Test
    public void canBrewLatte() {

        //Given
        Cafe cafe = new Cafe();
        cafe.restockBean(LATTE_BEANS);
        cafe.restockMilk(LATTE_MILK);

        //When
        Coffee coffee = cafe.brew(CoffeeType.Latte);

        //Then
        Assert.assertEquals("Wrong coffee type", CoffeeType.Latte, coffee.getCoffeeType());
        Assert.assertEquals("Wrong amount of milk", LATTE_MILK, coffee.getMilk());
        Assert.assertEquals("Wrong number of beans", LATTE_BEANS, coffee.getBean());
    }

    @Test
    public void brewingEspressoConsumeBeans() {

        //Given
        Cafe cafe = cafeWithBeans();

        //When
        Coffee coffee = cafe.brew(CoffeeType.Espresso);

        //Then
        Assert.assertEquals(NO_MILK, cafe.getBeanInStock());
    }


    //Then
    @Test (expected = IllegalStateException.class)
    //@Test
    public void latteRequireMilk() {

        //Given
        Cafe cafe = cafeWithBeans();

        //When
        Coffee coffee = cafe.brew(CoffeeType.Latte);
    }
}
