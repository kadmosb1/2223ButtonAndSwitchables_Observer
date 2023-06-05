package switchables;

public abstract class Switchable {

    protected String name;
    protected boolean switchedOn = false;

    @Override
    public String toString () {
        return name + " is " + (switchedOn ? "aan" : "uit");
    }

    public void switchOnOrOff () {

        if (switchedOn) {
            deactivate ();
        }
        else {
            activate ();
        }

        switchedOn = !switchedOn;
    }

    protected abstract void deactivate ();
    protected abstract void activate ();
}