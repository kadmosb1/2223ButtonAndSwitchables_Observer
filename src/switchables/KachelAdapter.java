package switchables;

import nl.hhs.kachel.Kachel;

public class KachelAdapter extends Switchable {

    Kachel kachel;

    public KachelAdapter (int number) {
        name = "Kachel " + number;
        kachel = new Kachel (number);
    }

    public void update () {
        kachel.update (null, null);
    }

    @Override
    protected void deactivate() {
        update ();
    }

    @Override
    protected void activate() {
        update ();
    }
}
