package com.upskillagility.tdd;

import org.junit.After;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by Ajit on 2/2/17.
 */
public class GroceryListTest {

    private GroceryList myGroceryList = new GroceryList();



    @Test
    public void getListOfItemsForShopping()
    {
        //Given that we have a new GroceryList
        //When we access the list of items for shopping
        //then we should not get null
        assertNotNull(myGroceryList.getListOfItemForShopping());

    }

    @Test
    public void setListOfItemsForShopping()
    {
        final int initialSizeOfGroceryList = 0;
        //Given we have a new Object to add to our shopping list

        Object itemForShopping = new Object();

        // when we add this new item to the shopping list

        myGroceryList.getListOfItemForShopping().add(itemForShopping);

        //then size of grocerylist increments by 1 and

        assertTrue( (myGroceryList.getListOfItemForShopping().size() == initialSizeOfGroceryList+1));
        assertTrue(myGroceryList.getListOfItemForShopping().indexOf(itemForShopping) == 0 );

    }

    @After
    public void tearDown()
    {
        myGroceryList.dispose();
    }
}
