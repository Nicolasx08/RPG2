import java.util.Scanner;

/**
 * Created by PagNi1731620 on 2018-02-01.
 */
public class LeCombatFatal {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int rep=0;
        int premier=0;
        boolean fin =false;
        int tour=0;
        Personnage personnages[]=new Personnage[2];
        for (int i=0;i<2;i++){
            System.out.println("Choisissez vos combattants!");
            System.out.println("1- Barbare");
            System.out.println("2- Paladin");
            System.out.println("3- Magicien Noir");
            System.out.println("4- Magicien Rouge");
            rep=sc.nextInt();
            if (rep<=4 && rep>=1){
                    switch (rep){
                        case 1: personnages[i]= new Barbare();
                        break;
                        case 2: personnages[i]= new Paladin();
                        break;
                        case 3: personnages[i]=new MagicienNoir();
                        break;
                        case 4: personnages[i]=new MagicienRouge();
                        break;
                    }
            }
            else {
                System.out.println("Entrez un chiffre valide.");
                i--;
            }
        }
        while (!fin){
            System.out.println();
          System.out.println("Le "+ personnages[tour].getNom()+" attaque.");
          personnages[tour].attaque(personnages[((tour+1)%2)]);
            System.out.println("Il reste "+personnages[(tour+1)%2].getHp()+" au "+personnages[(tour+1)%2].getNom());

          tour= (tour+1)%2;
          if (personnages[tour].getHp()<=0){
             System.out.println("Le combat est fini!"+personnages[(tour+1)%2].getNom()+" a gagné!");
             fin=true;
            }

            if (personnages[0] instanceof Magicien && personnages[1] instanceof Magicien){
                Magicien magicien= (Magicien) personnages[0];
                Magicien magicien1 =(Magicien)personnages[1];
                if (magicien.getNbePtsMagie()==0 && magicien1.getNbePtsMagie()==0){
                    System.out.println("Match nulle!");
                    fin=true;
                }
            }
        }





    }
}
