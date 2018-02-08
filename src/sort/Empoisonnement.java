package sort;

import personnage.Magicien;
import personnage.Personnage;

/**
 * Created by PagNi1731620 on 2018-02-05.
 */
public class Empoisonnement extends Sort {
    int nbeEmpoisonnement=1;
    public Empoisonnement (){
        setCout(2);
    }
    public void lancerSort(Personnage personnage, Magicien magicien) {
        personnage.setHp(personnage.getHp()-(2*nbeEmpoisonnement)+magicien.getDegat());
        System.out.println("Vous avez attaqué de "+(2*nbeEmpoisonnement)+magicien.getDegat());
    nbeEmpoisonnement++;
    }
}
