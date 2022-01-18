package factories.regionalfactories;
    
import factories.ToyFactory;
import toys.toyproducts.Toy;
import toys.toyproducts.models.AmericanCarToy;

public class AmericanHelicopterToyFactory extends ToyFactory{

    @Override
    public Toy createToy(Integer serialNumber) {
        Toy toy = new AmericanCarToy(serialNumber);
        toy.pack();
        toy.label();
        return toy;
    }

}
