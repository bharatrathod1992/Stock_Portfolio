package com;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;

/**
 * Created by localadmin on 02/01/17.
 */
public class ClientTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void clientConstructorTest(){
        Client c1 = new Client("bharath","male",24);
        assertEquals(c1.getName(),"bharath");
        assertEquals(c1.getGender(),"male");
        assertEquals(c1.getAge(),24);

    }

    @Test
    public void deposit_itDepositsTheFunds(){
        Client c1 = new Client("bharath","male",24);
        assertEquals(c1.getFunds(),0);

        c1.deposit(150);
        assertEquals(c1.getFunds(),150);

        c1.deposit(150);
        assertEquals(c1.getFunds(),300);

    }

    @Test
    public void Withdrawl_itWithdrawsFunds(){
        Client c1 = new Client("bharath","male",24);
        assertEquals(c1.getFunds(),0);


        try {
            c1.deposit(300);
            c1.withdrawl(150);
            assertEquals(c1.getFunds(), 150);
            c1.withdrawl(100);
            assertEquals(c1.getFunds(), 50);
            c1.withdrawl(200);
        }catch(Exception e1){
            assertEquals(e1.getLocalizedMessage(),"No balance dude");
        }
    }


}