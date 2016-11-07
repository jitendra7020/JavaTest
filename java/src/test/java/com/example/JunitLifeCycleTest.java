package com.example;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by admin on 07/11/16.
 */

public class JunitLifeCycleTest {


    public JunitLifeCycleTest() {
        System.out.print("constructor \n");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.print("before class \n");
    }

    @AfterClass
    public static void afterClass() {
        System.out.print("after class \n");
    }

    @Before
    public void before() {
        System.out.print("before \n");
    }

    @After
    public void after() {
        System.out.print("after \n");
    }

    @Test
    public void testLifeCycle() {
        System.out.print("This is Junit lifecycle test \n");
    }
}
