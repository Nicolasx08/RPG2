/**
 * Created by PagNi1731620 on 2018-02-05.
 */
public class MortSubite extends Sort {
    int chance=0;
    public MortSubite(){
        setCout(10);
    }

    public void lancerSort(Personnage personnage) {
        chance=(int)(Math.random()*(10)+1);
        if (chance==10){
            personnage.setHp(0);
            System.out.println("Vous l'avez tuer d'un coup!!");
        }
        else {
            System.out.println("Votre attaque n'a pas atteint la cible.");
        }
    }
}
