package factories.regionalfactories;
    
import factories.ToyFactory;
import toys.toyproducts.Toy;
import toys.toyproducts.models.AsianCarToy;

public class AsianCarToyFactory extends ToyFactory{

    @Override
    public Toy createToy(Integer serialNumber) {
        Toy toy = new AsianCarToy(serialNumber);
        toy.pack();
        toy.label();
        return toy;
    }

}
