/**
 * Created by PagNi1731620 on 2018-02-01.
 */
public abstract class Sort {
    private int cout=0;

    public abstract void lancerSort(Personnage personnage);
    public int getCout() {return cout;}
    public void setCout(int cout) {this.cout = cout;}
}
