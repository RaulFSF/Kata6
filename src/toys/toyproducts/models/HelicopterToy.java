package toys.toyproducts.models;
    
import toys.toyproducts.Toy;

public class HelicopterToy implements Toy{
    private Integer serialNumber;

    public HelicopterToy(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    @Override
    public void pack(){
        System.out.println("The helicopter with serialNumber " + serialNumber.toString() + " is packed.");
    }
    
    @Override
    public void label(){
        System.out.println("The helicopter with serialNumber " + serialNumber.toString() + " is labelled.");
    }
}
