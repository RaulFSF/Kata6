package kata6;

import business.BusinessToy;
import factories.ToyFactory;
import factories.regionalfactories.AmericanCarToyFactory;
import factories.regionalfactories.AmericanHelicopterToyFactory;
import java.util.Scanner;
import factories.regionalfactories.AsianCarToyFactory;
import factories.regionalfactories.AsianHelicopterToyFactory;
import java.util.HashMap;
import java.util.Map;
import toys.toyproducts.Toy;

public class Main {

    public static void main(String[] args) {
        Map<String, ToyFactory> toyFactories = new HashMap<>();
        toyFactories.put("AmericanCar", new AmericanCarToyFactory());
        toyFactories.put("AmericanHelicopter", new AmericanHelicopterToyFactory());
        toyFactories.put("AsianCar", new AsianCarToyFactory());
        toyFactories.put("AsianHelicopter", new AsianHelicopterToyFactory());
        BusinessToy toyBusiness = new BusinessToy(toyFactories);
       
        while(true){
            System.out.print("Introduce command ('exit for exit): ");
            Scanner keyboard = new Scanner(System.in);
            String command = keyboard.nextLine();
            if(command.equals("exit")){
                break;
            } else {
                Toy toy = toyBusiness.produceToy(command);
            }
        }
    }
    
}
