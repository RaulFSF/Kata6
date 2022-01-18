package factories;
    
import toys.toyproducts.Toy;

public abstract class ToyFactory{
    

    public ToyFactory() {
    }
    
    public Toy produceToy(){
        Toy toy = createToy(SerialNumberGenerator.getInstance().next());
        toy.prepare();
        toy.pack();
        toy.label();
        return toy;
    }
    
    public abstract Toy createToy(Integer serialNumber);
    
}
