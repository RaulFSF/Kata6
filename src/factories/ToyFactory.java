package factories;
    
import toys.toyproducts.Toy;

public abstract class ToyFactory{
    

    public ToyFactory() {
    }
    
    public Toy produceToy(Integer serialNumber){
        Toy toy = createToy(serialNumber);
        toy.pack();
        toy.label();
        return toy;
    }
    
    public abstract Toy createToy(Integer serialNumber);
    
}
