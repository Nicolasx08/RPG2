/**
 * Created by PagNi1731620 on 2018-02-01.
 */
public class MagicienNoir extends Magicien {
    public MagicienNoir(){
        setHp(60);
        setDef(1);
        setNbePtsMagie(50);
        setNom("Magicien Noir");
        getTabSort()[0]=new BouleDeFeu();
        getTabSort()[1]=new PicDeGlace();
    }
}
