package com.upskillagility.TDD;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ajit on 2/2/17.
 */
public class GroceryList {

    private static void assertTrue(boolean condition) throws Exception {
        if (! condition)
            throw new Exception("Test failed");
    }
/*
    Run this class, right click on GrocertList and choose recompile and then run
 */
    public static void main(String[] args)
    {
        try {
        //When we have a new list for shopping

        List listOfItemsForShopping = new ArrayList();

        //then initial size of list is 0

         assertTrue(listOfItemsForShopping.size()==0) ;

        //When we add an object in the shopping list

        Object objANewGroceryItem= new Object(  );

        listOfItemsForShopping.add(objANewGroceryItem);

        // then the size of shoppinglist should be 1

        /*
            Implement your first automated test here -
             use aserttrue method like above to compare
             the size of shopping list and confirm that size is 1

             */

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
