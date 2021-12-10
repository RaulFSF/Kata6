package toys;
    
public class Car{
    private Integer serialNumber;

    public Car(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    public void pack(){
        System.out.println("The car with serialNumber " + serialNumber.toString() + " is packed.");
    }
    
    public void label(){
        System.out.println("The car with serialNumber " + serialNumber.toString() + " is labelled.");
    }
}
