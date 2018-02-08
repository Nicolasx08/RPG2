package personnage;

/**
 * Created by PagNi1731620 on 2018-02-01.
 */
public abstract class Personnage {
    private int hp=0;
    private int Def=0;
    private String nom="a";
    private int degat;

    public abstract void attaque(Personnage personnage);

    public int getHp() {return hp;}
    public int getDef() {return Def;}
    public String getNom() {return nom;}
    public int getDegat() {return degat;}

    public void setHp(int hp) {this.hp = hp;}
    public void setDef(int def) {Def = def;}
    public void setNom(String nom) {this.nom = nom;}
    public void setDegat(int degat) {this.degat = degat;}
}
