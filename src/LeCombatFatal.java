import personnage.*;
import armes.*;
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
        int choixArme=0;
        for (int i=0;i<2;i++){
            System.out.println("Choisissez vos combattants!");
            System.out.println("1- Barbare");
            System.out.println("2- Paladin");
            System.out.println("3- Magicien Noir");
            System.out.println("4- Magicien Rouge");
            rep=sc.nextInt();
            if (rep<=4 && rep>=1){
                    switch (rep){
                        case 1: personnages[i]= new Barbare(new Masse());
                        break;
                        case 2: personnages[i]= new Barbare(new ÉpéeLourde());
                        break;
                        case 3: personnages[i]= new Barbare(new Sceptre());
                            break;
                        case 4: personnages[i]= new Barbare(new Masamune());
                            break;
                        case 5: personnages[i]= new Paladin(new Épée());
                        break;
                        case 6: personnages[i]= new Paladin(new ÉpéeMagique());
                            break;
                        case 7: personnages[i]= new Paladin(new ÉpéeLourde());
                            break;
                        case 8: personnages[i]= new Paladin(new Masamune());
                            break;
                        case 9: personnages[i]=new MagicienNoir(new Baguette());
                        break;
                        case 10: personnages[i]=new MagicienNoir(new ÉpéeMagique());
                            break;
                        case 11: personnages[i]=new MagicienNoir(new Sceptre());
                            break;
                        case 12: personnages[i]=new MagicienNoir(new Masamune());
                            break;
                        case 13: personnages[i]=new MagicienRouge(new Baguette());
                            break;
                        case 14: personnages[i]=new MagicienRouge(new ÉpéeMagique());
                            break;
                        case 15: personnages[i]=new MagicienRouge(new Sceptre());
                            break;
                        case 16: personnages[i]=new MagicienRouge(new Masamune());
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
                    System.out.println("Match nul!");
                    fin=true;
                }
            }
        }
    }
}
