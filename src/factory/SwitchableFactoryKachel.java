package factory;

import factory.SwitchableFactory;
import switchables.KachelAdapter;
import switchables.Switchable;

public class SwitchableFactoryKachel extends SwitchableFactory {

    @Override
    public Switchable createSwitchable() {
        return new KachelAdapter(getNumber ());
    }
}
