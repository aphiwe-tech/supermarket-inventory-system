package text_file;

import java.io.File;
import acsse.csc2a.supermarket.file.FoodHandler;
import acsse.csc2a.supermarket.model.Food;
import acsse.csc2a.supermarket.model.Store;

public class Main {
    public static void main(String[] args) {
        System.out.println("west");
        
        String[] files = {"data/supermarket-large.txt"}; // Adjust path
        
        for(String file: files) {
            File myFile = new File(file);
            
            // Get the store from FoodHandler
            Store myStore = FoodHandler.readStore(myFile);
            
            // Print the store contents
            if (myStore != null && myStore.getStoreFood() != null) {
                System.out.println("Store contains " + myStore.getStoreFood().size() + " items:");
                
                for (Food food : myStore.getStoreFood()) {
                    System.out.println(food.toString());
                }
            } else {
                System.out.println("No food items found in the store.");
                //display this massage if the store is actually emapty 
            }
        }
    }
}
