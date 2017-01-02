package com;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by localadmin on 02/01/17.
 */
public class PortfolioTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }
    @Test
    public void portfolioConstructor(){
        Portfolio p1 = new Portfolio("Portfolio");
        assertEquals(p1.getName(),"Portfolio");
    }

    @Test
    public void addPortfolio(){
        Portfolio technology = new Portfolio("Tecgnology");
        Stock apple = new Stock("Apple",50);
        technology.addStock(apple);
        assertEquals(technology.getStockList().size(),1);
        Stock google = new Stock("Google",100);
        technology.addStock(google);
        assertEquals(technology.getStockList().size(),2);
    }

}