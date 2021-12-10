package kata6;

import java.util.Scanner;
import toys.Car;
import toys.SerialNumberGenerator;

public class Main {

    public static void main(String[] args) {
        SerialNumberGenerator serialNumberGenerator = new SerialNumberGenerator();
        while(true){
            System.out.println("Introduce command ('exit for exit):");
            Scanner keyboard = new Scanner(System.in);
            String command = keyboard.nextLine();
            if(command.equals("exit")){
                break;
            } else if(command.equals("car")){
                Car car = new Car(serialNumberGenerator.next());
                car.pack();
                car.label();
            }
        }
    }
    
}
