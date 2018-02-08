package personnage;

import armes.Magique;
import sort.Empoisonnement;
import sort.MortSubite;

/**
 * Created by PagNi1731620 on 2018-02-01.
 */
public class MagicienRouge extends Magicien {
    private Magique arme;
    public MagicienRouge(Magique arme){
        setHp(60);
        setDef(1);
        setNbePtsMagie(40);
        setNom("Magicien Rouge");
        getTabSort()[0]=new Empoisonnement();
        getTabSort()[1]=new MortSubite();
        this.arme=arme;
        setDegat(arme.lancerUnSort());
    }
}
