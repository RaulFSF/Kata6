package toys.components.asian;
    
import toys.components.Engine;

public class AsianEngine implements Engine{
    private final String type;
    
    public AsianEngine(){
        this.type = "AsianEngine";
    }

    public String getType() {
        return type;
    }
    
}
