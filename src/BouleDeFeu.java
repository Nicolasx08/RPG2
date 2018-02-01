/**
 * Created by PagNi1731620 on 2018-02-01.
 */
public class BouleDeFeu extends Sort {

    public BouleDeFeu(){
        setCout(5);
    }
    public void lancerSort(Personnages personnages){
        personnages.setHp(personnages.getHp()-5);
    }
}
