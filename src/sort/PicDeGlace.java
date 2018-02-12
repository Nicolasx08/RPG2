package sort;

import personnage.Magicien;
import personnage.Personnage;

/**
 * Created by PagNi1731620 on 2018-02-05.
 */
public class PicDeGlace extends Sort {
    public PicDeGlace(){
        setCout(5);
    }

    public void lancerSort(Personnage personnage, Magicien magicien) {
        personnage.setHp(personnage.getHp()-(7- personnage.getDef()+magicien.getDegat()));
        System.out.println("Vous avez attaquer de "+((7- personnage.getDef()+magicien.getDegat())));
    }
}
