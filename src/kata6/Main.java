package kata6;

import java.util.Scanner;
import toys.Car;
import toys.Helicopter;
import toys.SerialNumberGenerator;

public class Main {

    public static void main(String[] args) {
        SerialNumberGenerator serialNumberGenerator = new SerialNumberGenerator();
        while(true){
            System.out.print("Introduce command ('exit for exit): ");
            Scanner keyboard = new Scanner(System.in);
            String command = keyboard.nextLine();
            if(command.equals("exit")){
                break;
            } else if(command.equals("car")){
                Car car = new Car(serialNumberGenerator.next());
                car.pack();
                car.label();
            } else if(command.equals("helicopter")){
                Helicopter helicopter = new Helicopter(serialNumberGenerator.next());
                helicopter.pack();
                helicopter.label();
            } else{
                System.out.println("Command unknown!");
            }
        }
    }
    
}
