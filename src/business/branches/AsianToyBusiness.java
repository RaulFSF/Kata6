package business.branches;
    
import business.ToyBusiness;
import toys.toyproducts.Toy;
import toys.toyproducts.models.AsianCarToy;
import toys.toyproducts.models.AsianHelicopterToy;

public class AsianToyBusiness extends ToyBusiness{

    @Override
    public Toy createToy(String type) {
        switch(type){
            case "car":
                Toy car = new AsianCarToy(serialNumberGenerator.next());
                car.pack();
                car.label();
                return car;
            case "helicopter":
                Toy helicopter = new AsianHelicopterToy(serialNumberGenerator.next());
                helicopter.pack();
                helicopter.label();
                return helicopter;
        }
        return null;
    }

}
