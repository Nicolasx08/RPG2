package personnage;

/**
 * Created by PagNi1731620 on 2018-02-01.
 */
public  class Guerrier extends Personnage {

    private int force=0;

    public void attaque(Personnage personnage){
        personnage.setHp(personnage.getHp() - (((getForce()*2)- personnage.getDef())+getDegat()));
        System.out.println("Vous avez attaquer de "+ (((getForce()*2)- personnage.getDef())+getDegat()));
    }
    public void esquive(Personnage personnage){

    }
    public int getForce() {return force;}

    public void setForce(int force) {this.force = force;}
}
