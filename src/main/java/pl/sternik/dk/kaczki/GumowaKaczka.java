package pl.sternik.dk.kaczki;

import pl.sternik.dk.kaczki.kwakanie.Piskajaca;
import pl.sternik.dk.kaczki.latanie.Nielot;

public class GumowaKaczka extends Kaczka {

    public GumowaKaczka(String nazwa) {
        super("Gumowa:"+nazwa, new Nielot(), new Piskajaca());
    }
}
