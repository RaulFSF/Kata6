package toys;
    
import toys.toyproducts.Toy;
import toys.toyproducts.models.HelicopterToy;
import toys.toyproducts.models.CarToy;

public class ToyBusiness{
    private final SerialNumberGenerator serialNumberGenerator = new SerialNumberGenerator();

    public ToyBusiness() {
        
    }
    
    public Toy createToy(String type){
        switch(type){
            case "car":
                CarToy car = new CarToy(serialNumberGenerator.next());
                car.pack();
                car.label();
                return car;
            case "helicopter":
                HelicopterToy helicopter = new HelicopterToy(serialNumberGenerator.next());
                helicopter.pack();
                helicopter.label();
                return helicopter;
        }
        return null;
    }
}
