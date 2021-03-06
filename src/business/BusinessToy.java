package business;
    
import factories.SerialNumberGenerator;
import factories.ToyFactory;
import java.util.Map;
import toys.toyproducts.Toy;

public class BusinessToy{
    private final Map<String, ToyFactory> toyFactories;
    
    public BusinessToy(Map<String, ToyFactory> toyFactories) {
        this.toyFactories = toyFactories;
    }

    public Toy produceToy(String type){
        if(toyFactories.containsKey(type)){
            return toyFactories.get(type).createToy(SerialNumberGenerator.getInstance().next());
        } else{
            System.out.println("Command unknown!");
            return null;
        }
        
    }
}
