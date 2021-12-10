package toys.toyproducts.models;
    
import toys.toyproducts.Toy;

public class AmericanCarToy implements Toy{
    private Integer serialNumber;
    private String type = "American Car Toy";

    public AmericanCarToy(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    @Override
    public void pack(){
        System.out.println("The " + type +" with serialNumber " + serialNumber.toString() + " is packed.");
    }
    
    @Override
    public void label(){
        System.out.println("The " + type + " with serialNumber " + serialNumber.toString() + " is labelled.");
    }
}