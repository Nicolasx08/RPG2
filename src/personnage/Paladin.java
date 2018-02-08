package personnage;

import armes.Tranchant;

/**
 * Created by PagNi1731620 on 2018-02-01.
 */
public class Paladin extends Guerrier {
    private Tranchant arme;
    public Paladin(Tranchant arme) {
        setHp(80);
        setDef(5);
        setForce(5);
        setNom("Paladin");
        this.arme=arme;
        setDegat(arme.trancher());
    }
}
