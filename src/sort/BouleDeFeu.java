package sort;

import personnage.Magicien;
import personnage.Personnage;

/**
 * Created by PagNi1731620 on 2018-02-01.
 */
public class BouleDeFeu extends Sort {

    public BouleDeFeu(){
        setCout(5);
    }
    public void lancerSort(Personnage personnage, Magicien magicien){
        personnage.setHp(personnage.getHp()-5+ magicien.getDegat());
        System.out.println("Vous avez attaquer de "+(5+magicien.getDegat())+".");
    }
}
