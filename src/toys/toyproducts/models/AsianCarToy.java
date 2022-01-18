package toys.toyproducts.models;
    
import componentfactories.ComponentFactory;
import componentfactories.regionalcomponentfactories.AsianComponentFactory;
import toys.components.Engine;
import toys.components.Wheel;
import toys.toyproducts.Toy;

public class AsianCarToy implements Toy{
    private Integer serialNumber;
    private String type = "Asian Car Toy";
    private ComponentFactory componentFactory;
    private Engine engine;
    private Wheel wheel1;
    private Wheel wheel2;
    private Wheel wheel3;
    private Wheel wheel4;
    
    public AsianCarToy(Integer serialNumber) {
        this.serialNumber = serialNumber;
        this.componentFactory = new AsianComponentFactory();

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
        this.wheel1 = this.componentFactory.createWheel();
        System.out.println("The " + type +" with serialNumber " + serialNumber.toString() + " has wheel 1.");
        this.wheel2 = this.componentFactory.createWheel();
        System.out.println("The " + type +" with serialNumber " + serialNumber.toString() + " has wheel 2.");
        this.wheel3 = this.componentFactory.createWheel();
        System.out.println("The " + type +" with serialNumber " + serialNumber.toString() + " has wheel 3.");
        this.wheel4 = this.componentFactory.createWheel();
        System.out.println("The " + type +" with serialNumber " + serialNumber.toString() + " has wheel 4.");
    }
}
