package pl.sternik.dk.kaczki;

import pl.sternik.dk.kaczki.kwakanie.Kwaczka;
import pl.sternik.dk.kaczki.latanie.Latajaca;

public class MandarynkaKaczka extends Kaczka {

    public MandarynkaKaczka(String nazwa) {
        super("Mandarynka:"+nazwa, new Latajaca(), new Kwaczka());
    }
}
