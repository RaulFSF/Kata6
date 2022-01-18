package toys.toyproducts.models;
    
import componentfactories.ComponentFactory;
import componentfactories.regionalcomponentfactories.AmericanComponentFactory;
import toys.components.Engine;
import toys.components.RotorBlade;
import toys.toyproducts.Toy;

public class AmericanHelicopterToy implements Toy{
    private Integer serialNumber;
    private String type = "American Helicopter Toy";
     private ComponentFactory componentFactory;
    private Engine engine;
    private RotorBlade rotorBlade;
    
    public AmericanHelicopterToy(Integer serialNumber) {
        this.serialNumber = serialNumber;
        this.componentFactory = new AmericanComponentFactory();        
    }
    
    @Override
    public void pack(){
        System.out.println("The " + type +" with serialNumber " + serialNumber.toString() + " is packed.");
    }
    
    @Override
    public void label(){
        System.out.println("The " + type + " with serialNumber " + serialNumber.toString() + " is labelled.");
    }

    @Override
    public void prepare() {
        this.engine = this.componentFactory.createEngine();
        System.out.println("The " + type +" with serialNumber " + serialNumber.toString() + " has engine.");
        this.rotorBlade = this.componentFactory.createRotorBlade();
        System.out.println("The " + type +" with serialNumber " + serialNumber.toString() + " has rotorBlade.");
    }
}

