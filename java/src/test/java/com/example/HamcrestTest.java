package com.example;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by admin on 07/11/16.
 */

public class HamcrestTest {

    private List<Integer> getNumbers() {
        return Arrays.asList(1,2,3,4,5);
    }

    @Test
    public void testHamcrestPass() {
        List<Integer> numbers = getNumbers();
        Assert.assertThat(numbers, CoreMatchers.hasItem(3));
    }

    @Test
    public void testHamcrestFail() {
        List<Integer> numbers = getNumbers();
        Assert.assertThat(numbers, CoreMatchers.hasItem(10));
    }
}
