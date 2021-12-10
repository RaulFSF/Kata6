package toys.toyproducts.models;
    
import toys.toyproducts.Toy;

public class CarToy implements Toy{
    private Integer serialNumber;

    public CarToy(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    @Override
    public void pack(){
        System.out.println("The car with serialNumber " + serialNumber.toString() + " is packed.");
    }
    
    @Override
    public void label(){
        System.out.println("The car with serialNumber " + serialNumber.toString() + " is labelled.");
    }
}
