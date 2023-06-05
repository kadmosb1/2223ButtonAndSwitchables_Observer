package button;

import factory.SwitchableFactory;
import switchables.Switchable;

import java.util.ArrayList;
import java.util.Scanner;

public class Button {

    private final ArrayList<Switchable> switchables = new ArrayList<> ();

    public static void main(String[] args) {
        Button button = new Button ();
        button.addSwitchable (SwitchableFactory.LAMP.createSwitchable ());
        button.addSwitchable (SwitchableFactory.LAMP.createSwitchable ());
        button.addSwitchable (SwitchableFactory.VENTILATOR.createSwitchable ());
        button.addSwitchable (SwitchableFactory.KACHEL.createSwitchable ());
        button.start ();
    }

    public void addSwitchable (Switchable switchable) {
        switchables.add (switchable);
    }

    public void showMenu () {

        System.out.printf ("Kies een apparaat of E(xit):%n%n");

        for (int teller = 0; teller < switchables.size (); teller++) {
            System.out.printf ("%2d - %s%n", teller + 1, switchables.get (teller));
        }

        System.out.printf ("%nMaak uw keuze: ");
    }

    public void start () {

        Scanner keyboard = new Scanner (System.in);
        int input;

        showMenu ();

        while (keyboard.hasNextInt ()) {
            input = keyboard.nextInt ();
            System.out.println ();
            switchables.get (input - 1).switchOnOrOff();
            System.out.println ();
            showMenu ();
        }
    }
}