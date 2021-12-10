package business;
    
import factories.ToyFactory;
import toys.toyproducts.Toy;

public class BusinessToy{
    private final ToyFactory toyFactory;

    public BusinessToy(ToyFactory toyFactory) {
        this.toyFactory = toyFactory;
    }

    public Toy produceToy(String type){
        return toyFactory.createToy(type);
    }
}
