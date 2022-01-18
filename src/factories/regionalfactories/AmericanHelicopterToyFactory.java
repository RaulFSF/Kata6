package factories.regionalfactories;
    
import factories.ToyFactory;
import toys.toyproducts.Toy;
import toys.toyproducts.models.AmericanHelicopterToy;

public class AmericanHelicopterToyFactory extends ToyFactory{

    @Override
    public Toy createToy(Integer serialNumber) {
        Toy toy = new AmericanHelicopterToy(serialNumber);
        toy.prepare();
        toy.pack();
        toy.label();
        return toy;
    }

}
