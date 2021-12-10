package kata6;

import business.BusinessToy;
import java.util.Scanner;
import factories.regionalfactories.AmericanToyFactory;
import factories.regionalfactories.AsianToyFactory;
import toys.toyproducts.Toy;

public class Main {

    public static void main(String[] args) {
        BusinessToy toyBusiness = new BusinessToy(new AmericanToyFactory());
        
        while(true){
            System.out.print("Introduce command ('exit for exit): ");
            Scanner keyboard = new Scanner(System.in);
            String command = keyboard.nextLine();
            if(command.equals("exit")){
                break;
            } else if(command.equals("car")){
                Toy toy = toyBusiness.produceToy("car");
            } else if(command.equals("helicopter")){
                toyBusiness.produceToy("helicopter");
            } else{
                System.out.println("Command unknown!");
            }
        }
    }
    
}
