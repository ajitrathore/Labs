package com.upskillagility.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Ajit on 2/4/17.
 */
public class GroceryListTest {

    //Step 1 - Iitialize the SUT

    GroceryList myGroceryList=createGroceryList();

    @Before
    public void setUp() throws Exception {

    }

    //Step 4 - clean up the environment
    @After
    public void tearDown() throws Exception {
        myGroceryList.dispose();
    }

    @Test
    public void getListOfItemForShopping() throws Exception {



    }

    @Test
    public void setListOfItemForShoppingAssertEqualToSetterObject() throws Exception {

        //Given we have a new List
        List listOfItems=new ArrayList();

        //When  we set the GroceryList's list of items for shopping with this list
        //This is Phase 2 of test design- invoke the function under test
        myGroceryList.setListOfItemForShopping(listOfItems);

        //Then we are able to confirm that our list and GroceryList's list of item is equal
        //This is phase 3 of test design - verify the result
        assertEquals(myGroceryList.getListOfItemForShopping(),listOfItems);



    }



    public static GroceryList createGroceryList()
    {
        return new GroceryList();
    }

}