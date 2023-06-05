package switchables;

import switchables.Switchable;

import java.util.ArrayList;
import java.util.Scanner;

public class Ventilator extends Switchable {

    private ArrayList<String> fanspeeds = new ArrayList<> ();
    private int activeFanspeed = 0;

    public Ventilator (int nummer) {

        name = "Ventilator " + nummer;

        fanspeeds.add ("Stand 0 (off)");
        fanspeeds.add ("Stand 1 (300 rpm)");
        fanspeeds.add ("Stand 2 (800 rpm)");
        fanspeeds.add ("Stand 3 (1500 rpm)");
        fanspeeds.add ("Stand 4 (2500 rpm)");
    }

    private int getFanspeed (int start) {

        Scanner toetsenbord = new Scanner (System.in);
        int keuze = -1;
        int teller = start;

        while ((keuze < start) || keuze >= fanspeeds.size ()) {

            System.out.printf("Op welke stand moet de ventilator starten?%n%n");

            for (; teller < fanspeeds.size(); teller++) {
                System.out.println(teller + ". " + fanspeeds.get(teller));
            }

            System.out.printf("%nMaak uw keuze: ");
            keuze = toetsenbord.nextInt();

            if ((keuze < start) || (keuze >= fanspeeds.size())) {
                System.out.printf("%nMaak een keuze tussen %d en %d! ", start, fanspeeds.size() - 1);
                teller = start;
            }
        }

        return keuze;
    }

    public int getFanspeed (boolean dontShowInactiveFanSpeed) {

        int start = 0;

        if (dontShowInactiveFanSpeed) {
            start = 1;
        }

        return getFanspeed (start);
    }

    @Override
    protected void deactivate() {
        System.out.println (name + " gaat uit.");
        activeFanspeed = 0;
    }

    @Override
    protected void activate() {
        activeFanspeed = getFanspeed (true);
        System.out.println ("LET OP: De ventilator is aangezet. Pas op met het raam.");
        System.out.println (name + " gaat aan.");
    }

    @Override
    public String toString () {
        return super.toString() + " (" + fanspeeds.get (activeFanspeed) + ")";
    }
}
