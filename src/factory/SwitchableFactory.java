package factory;

import switchables.Switchable;

public abstract class SwitchableFactory {

    private static int number = 1;

    protected int getNumber () {
        return number++;
    }

    public static final SwitchableFactory LAMP = new SwitchableFactoryLamp();
    public static final SwitchableFactory VENTILATOR = new SwitchableFactoryVentilator();
    public static final SwitchableFactory KACHEL = new SwitchableFactoryKachel();

    public abstract Switchable createSwitchable ();
}
