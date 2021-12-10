package factories;
    
import toys.toyproducts.Toy;

public abstract class ToyFactory{
    protected SerialNumberGenerator serialNumberGenerator = new SerialNumberGenerator();

    public ToyFactory() {
    }
    
    public Toy produceToy(String type){
        Toy toy = createToy(type);
        toy.pack();
        toy.label();
        return toy;
    }
    
    public abstract Toy createToy(String type);
    
}
