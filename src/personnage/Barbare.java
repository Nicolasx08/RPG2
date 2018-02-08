package personnage;

import armes.Contondant;

/**
 * Created by PagNi1731620 on 2018-02-01.
 */
public class Barbare extends Guerrier {
    private Contondant arme;

    public Barbare(Contondant arme) {
        setHp(100);
        setDef(3);
        setForce(10);
        setNom("Barbare");
        this.arme=arme;
        setDegat(arme.frapper());
    }
}
