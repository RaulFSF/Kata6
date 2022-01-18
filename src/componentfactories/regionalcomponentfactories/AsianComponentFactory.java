package componentfactories.regionalcomponentfactories;
    
import componentfactories.ComponentFactory;
import toys.components.Engine;
import toys.components.RotorBlade;
import toys.components.Wheel;
import toys.components.asian.AsianEngine;
import toys.components.asian.AsianRotorBlade;
import toys.components.asian.AsianWheel;

public class AsianComponentFactory extends ComponentFactory{

    @Override
    public Wheel createWheel() {
        return new AsianWheel();
    }

    @Override
    public Engine createEngine() {
        return new AsianEngine();
    }

    @Override
    public RotorBlade createRotorBlade() {
        return new AsianRotorBlade();
    }

}
