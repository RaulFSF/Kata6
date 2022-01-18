package componentfactories.regionalcomponentfactories;
    
import componentfactories.ComponentFactory;
import toys.components.Engine;
import toys.components.RotorBlade;
import toys.components.Wheel;
import toys.components.american.AmericanEngine;
import toys.components.american.AmericanRotorBlade;
import toys.components.american.AmericanWheel;

public class AmericanComponentFactory extends ComponentFactory{

    @Override
    public Wheel createWheel() {
        return new AmericanWheel();
    }

    @Override
    public Engine createEngine() {
        return new AmericanEngine();
    }

    @Override
    public RotorBlade createRotorBlade() {
        return new AmericanRotorBlade();
    }

}
