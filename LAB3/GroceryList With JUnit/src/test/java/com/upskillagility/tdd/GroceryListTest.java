package com.upskillagility.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Ajit on 2/4/17.
 */
public class GroceryListTest {

    GroceryList myGroceryList=createGroceryList();

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
        dispose();
    }

    @Test
    public void getListOfItemForShopping() throws Exception {



    }

    @Test
    public void setListOfItemForShopping() throws Exception {

    }

    @Test
    public void dispose() throws Exception {

    }

    public static GroceryList createGroceryList()
    {
        return new GroceryList();
    }

}