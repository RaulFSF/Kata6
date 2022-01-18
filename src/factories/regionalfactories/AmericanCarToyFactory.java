package factories.regionalfactories;
    
import factories.ToyFactory;
import toys.toyproducts.Toy;
import toys.toyproducts.models.AmericanCarToy;

public class AmericanCarToyFactory extends ToyFactory{

    @Override
    public Toy createToy(Integer serialNumber) {
        Toy toy = new AmericanCarToy(serialNumber);
        toy.prepare();
        toy.pack();
        toy.label();
        return toy;
    }

}
