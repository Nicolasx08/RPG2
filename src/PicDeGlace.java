/**
 * Created by PagNi1731620 on 2018-02-05.
 */
public class PicDeGlace extends Sort{
    public PicDeGlace(){
        setCout(5);
    }

    public void lancerSort(Personnage personnage) {
        personnage.setHp(personnage.getHp()-(7- personnage.getDef()));
        System.out.println("Vous avez attaquer de "+(7- personnage.getDef()));
    }
}
