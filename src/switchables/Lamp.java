package switchables;

public class Lamp extends Switchable {

    public Lamp (int nummer) {
        name = "Lamp " + nummer;
    }

    @Override
    protected void deactivate() {
        System.out.println (name + " gaat uit.");
    }

    @Override
    protected void activate() {
        System.out.println (name + " gaat aan.");
    }
}
