/**
 * Created by PagNi1731620 on 2018-02-05.
 */
public class Empoisonnement extends Sort {
    int nbeEmpoisonnement=1;
    public Empoisonnement (){
        setCout(2);
    }
    public void lancerSort(Personnage personnage) {
        personnage.setHp(personnage.getHp()-(2*nbeEmpoisonnement));
        System.out.println("Vous avez attaqué de "+(2*nbeEmpoisonnement));
    nbeEmpoisonnement++;
    }
}
