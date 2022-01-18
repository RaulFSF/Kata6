package componentfactories;
    
import toys.components.Engine;
import toys.components.RotorBlade;
import toys.components.Wheel;

public abstract class ComponentFactory{
    public abstract Wheel createWheel();
    public abstract Engine createEngine();
    public abstract RotorBlade createRotorBlade();
}
