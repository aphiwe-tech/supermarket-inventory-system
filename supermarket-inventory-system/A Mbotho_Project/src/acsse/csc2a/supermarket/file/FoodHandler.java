package acsse.csc2a.supermarket.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import acsse.csc2a.supermarket.model.CannedFood;
import acsse.csc2a.supermarket.model.EDietType;
import acsse.csc2a.supermarket.model.FrozenFood;
import acsse.csc2a.supermarket.model.Store;

public class FoodHandler {
    
    //Pattern cannedFood
    //[A-Z]{4}[0-9]{2}[A-Z]{2}\t\w+\t[0-9]+\.[0-9]+
    static Pattern CannedFoodPattern = Pattern.compile("[A-Z]{4}[0-9]{2}[A-Z]{2}\\t\\w+\\t-?[0-9]+\\.[0-9]+");
    
    //Pattern for FrozenFood
    //[A-Z]{4}[0-9]{2}[A-Z]{2}\t\w+\t\w+\t[0-9]+
    static Pattern FrozenFoodPattern = Pattern.compile("[A-Z]{4}[0-9]{2}[A-Z]{2}\\t\\w+\\t\\w+\\t-?[0-9]+");
    
    public static Store readStore(File file) 
    {
        Store myStore = new Store();
        
        try(Scanner Myline = new Scanner(file))
        {
            while(Myline.hasNext())
            {
                String line = Myline.nextLine();
                
                Matcher CannedFood_Matcher = CannedFoodPattern.matcher(line);
                Matcher FrozenFood_Matcher = FrozenFoodPattern.matcher(line);
                
                if(CannedFood_Matcher.matches()) 
                { 
                    String[] parts = line.split("\t");
                    String weight = parts[2];
                    double Canned_weight = Double.parseDouble(weight);
                    
                    CannedFood MyCanned = new CannedFood(parts[0], parts[1], Canned_weight);
                    myStore.AddFood(MyCanned);
                    
                    System.out.println("Parsed CannedFood: " + parts[0]);
                    
                } 
                else if (FrozenFood_Matcher.matches()) 
                {
                    String[] parts = line.split("\t");
                    
                    String barcode = parts[0];
                    String quality = parts[1];
                    EDietType diet = EDietType.valueOf(parts[2].toUpperCase());
                    int temperature = Integer.parseInt(parts[3]);
                    
                    FrozenFood myFrozen = new FrozenFood(barcode, quality, diet, temperature);
                    myStore.AddFood(myFrozen);
                    
                    System.out.println("Parsed FrozenFood: " + barcode);
                    
                } 
                else 
                {
                    System.err.println("Line doesn't match any pattern: " + line);
                }
            }
            
        } 
        catch (FileNotFoundException e) 
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        return myStore;
    }
}
