package factories.regionalfactories;
    
import factories.ToyFactory;
import toys.toyproducts.Toy;
import toys.toyproducts.models.AsianHelicopterToy;

public class AsianHelicopterToyFactory extends ToyFactory{

    @Override
    public Toy createToy(Integer serialNumber) {
        Toy toy = new AsianHelicopterToy(serialNumber);
        toy.prepare();
        toy.pack();
        toy.label();
        return toy;
    }

}
