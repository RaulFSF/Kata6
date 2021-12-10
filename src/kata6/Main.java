package kata6;

import java.util.Scanner;
import toys.Car;
import toys.Helicopter;
import toys.SerialNumberGenerator;
import toys.ToyBusiness;

public class Main {

    public static void main(String[] args) {
        SerialNumberGenerator serialNumberGenerator = new SerialNumberGenerator();
        ToyBusiness toyBusiness = new ToyBusiness();
        while(true){
            System.out.print("Introduce command ('exit for exit): ");
            Scanner keyboard = new Scanner(System.in);
            String command = keyboard.nextLine();
            if(command.equals("exit")){
                break;
            } else if(command.equals("car")){
                toyBusiness.createCar();
            } else if(command.equals("helicopter")){
                toyBusiness.createHelicopter();
            } else{
                System.out.println("Command unknown!");
            }
        }
    }
    
}
