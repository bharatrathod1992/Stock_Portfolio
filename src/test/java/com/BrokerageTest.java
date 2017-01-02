package com;

import com.Brokerage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by localadmin on 02/01/17.
 */
public class BrokerageTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void brokerageConstructorTest(){
        Brokerage b1 = new Brokerage("shree");
        assertEquals(b1.getName(),"shree");

    }

    @Test
    public void brokerage_addClient(){
        Brokerage b = new Brokerage("shree");
        Client c1 = new Client("bharat","male",24);
        b.addClient(c1);
        assertEquals(b.getClientList().size(),1);


        Client c2 = new Client("bharat2","male",26);
        b.addClient(c2);
        assertEquals(b.getClientList().size(),2);
    }


}