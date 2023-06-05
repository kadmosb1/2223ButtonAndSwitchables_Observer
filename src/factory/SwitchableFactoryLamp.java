package factory;

import factory.SwitchableFactory;
import switchables.Lamp;
import switchables.Switchable;

public class SwitchableFactoryLamp extends SwitchableFactory {

    @Override
    public Switchable createSwitchable() {
        return new Lamp(getNumber ());
    }
}
