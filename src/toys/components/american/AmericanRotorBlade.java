package toys.components.american;
    
import toys.components.RotorBlade;

public class AmericanRotorBlade implements RotorBlade{
    private final String type;
    
    public AmericanRotorBlade(){
        this.type="AmericanRotorBlade";
    }

    public String getType() {
        return type;
    }
    
}
