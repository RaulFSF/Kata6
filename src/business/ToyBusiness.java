package business;
    
import toys.toyproducts.Toy;

public abstract class ToyBusiness{
    protected final SerialNumberGenerator serialNumberGenerator = new SerialNumberGenerator();

    public ToyBusiness() {
        
    }
    
    public abstract Toy createToy(String type);
        
}
