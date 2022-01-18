package toys.components.american;
    
import toys.components.Wheel;

public class AmericanWheel implements Wheel{
    private final String type;

    public AmericanWheel() {
        this.type = "AmericanWheel";
    }

    public String getType() {
        return type;
    }
    
}
