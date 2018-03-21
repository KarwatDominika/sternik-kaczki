package pl.sternik.dk.kaczki;

import pl.sternik.dk.kaczki.kwakanie.Niemowa;
import pl.sternik.dk.kaczki.latanie.Nielot;

public class DrewnianaKaczka extends Kaczka {

    public DrewnianaKaczka(String nazwa) {
        super("Drewniana:"+nazwa, new Nielot(), new Niemowa());
    }

}
