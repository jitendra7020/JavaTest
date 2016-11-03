package com.example;

/**
 * Created by admin on 03/11/16.
 */

public final class Calculator {

    private static final String TAG = "Calculator";

    public static int sum(int a, int b) {
        int sum = a + b;
        System.out.print(TAG + "-> sum = " + sum);
        return sum;
    }
}
