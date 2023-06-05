package factory;

import factory.SwitchableFactory;
import switchables.Switchable;
import switchables.Ventilator;

public class SwitchableFactoryVentilator extends SwitchableFactory {

    @Override
    public Switchable createSwitchable() {
        return new Ventilator(getNumber ());
    }
}
