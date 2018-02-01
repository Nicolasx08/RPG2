/**
 * Created by PagNi1731620 on 2018-02-01.
 */
public class Magicien extends Personnages {
     private int nbePtsMagie=0;
     private Sort tabSort[]= new Sort[2];

    public int getNbePtsMagie() {return nbePtsMagie;}
    public void setNbePtsMagie(int nbePtsMagie) {this.nbePtsMagie = nbePtsMagie;}

    public void attaque(Personnages personnages) {
        int random=(int)(Math.random()*2);
        if (nbePtsMagie>=tabSort[random].getCout()) {
            tabSort[random].lancerSort(personnages);
        }
        else {
            System.out.println("Vous n'avez pas assez de mana");
        }
    }
    public void esquive(Personnages personnages) {
    }
}
