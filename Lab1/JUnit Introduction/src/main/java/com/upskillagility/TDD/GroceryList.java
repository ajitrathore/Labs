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

    public static void main(String[] args)
    {
        try {
        //Given that we have a new shopping list
        List listOfItemsForShopping = new ArrayList();


           assertTrue(listOfItemsForShopping.size()==0) ;

        //When we add an object in the shopping list

        Object objANewGroceryItem= new Object(  );

        listOfItemsForShopping.add(objANewGroceryItem);

        // then the size of shoppinglist should be 1

            assertTrue(listOfItemsForShopping.size()== 1) ;

        } catch (Exception e) {
            e.printStackTrace();
        }


    }



}
