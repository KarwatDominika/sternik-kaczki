package pl.sternik.dk.kaczki;

import pl.sternik.dk.kaczki.kwakanie.Kwaczka;
import pl.sternik.dk.kaczki.latanie.Latajaca;

public class DzikaKaczka extends Kaczka {

    public DzikaKaczka(String nazwa) {
        super("Dzika:" + nazwa, new Latajaca(), new Kwaczka());
    }
}
