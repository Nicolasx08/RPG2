/**
 * Created by PagNi1731620 on 2018-02-01.
 */
public  class Guerrier extends Personnages {

    private int force=0;

    public void attaque(Personnages personnages){
        personnages.setHp((getForce()*2)-personnages.getDef());
    }
    public void esquive(Personnages personnages){

    }
    public int getForce() {return force;}

    public void setForce(int force) {this.force = force;}
}
