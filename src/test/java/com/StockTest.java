package com;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by localadmin on 02/01/17.
 */
public class StockTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void stockConstructor(){
        Stock apple = new Stock("Apple",50);
        assertEquals(apple.getName(),"Apple");
        assertEquals(apple.getPrice(),50);
    }

}