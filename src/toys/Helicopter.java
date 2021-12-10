package toys;
    
public class Helicopter{
    private Integer serialNumber;

    public Helicopter(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }
    
     public void pack(){
        System.out.println("The helicopter with serialNumber " + serialNumber.toString() + " is packed.");
    }
    
    public void label(){
        System.out.println("The helicopter with serialNumber " + serialNumber.toString() + " is labelled.");
    }
}
