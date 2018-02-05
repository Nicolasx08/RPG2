/**
 * Created by PagNi1731620 on 2018-02-01.
 */
public class BouleDeFeu extends Sort {

    public BouleDeFeu(){
        setCout(5);
    }
    public void lancerSort(Personnage personnage){
        personnage.setHp(personnage.getHp()-5);
        System.out.println("Vous avez attaquer de 5.");
    }
}
