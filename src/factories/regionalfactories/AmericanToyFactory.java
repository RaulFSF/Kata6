package factories.regionalfactories;
    
import factories.ToyFactory;
import toys.toyproducts.Toy;
import toys.toyproducts.models.AmericanCarToy;
import toys.toyproducts.models.AmericanHelicopterToy;

public class AmericanToyFactory extends ToyFactory{

    @Override
    public Toy createToy(String type) {
        switch(type){
            case "car":
                Toy car = new AmericanCarToy(serialNumberGenerator.next());
                car.pack();
                car.label();
                return car;
            case "helicopter":
                Toy helicopter = new AmericanHelicopterToy(serialNumberGenerator.next());
                helicopter.pack();
                helicopter.label();
                return helicopter;
        }
        return null;
    }

}
