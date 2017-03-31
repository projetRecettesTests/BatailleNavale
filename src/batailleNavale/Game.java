package batailleNavale;

import java.util.Scanner;

public class Game
{

	public static int length;
	public static int width;
	public static Grille grille;
	
	public static void main(String[] args)
	{
		Bateau bateau = null;
		int x;
		int y;		
		boolean ok = false;
		int nbBateaux = 0;
		int bateauChoisi = 0;
		Scanner s;
		s = new Scanner(System.in);
		
		System.out.println("Indiquez la longueur de grille souhaitée : ");
		length = s.nextInt();
		
		System.out.println("Indiquez la largeur de grille souhaitée : ");
		width = s.nextInt();
		
		grille = new Grille(length, width);
		
		do {
			do {
				System.out.println("Quel type de bateau souhaitez-vous placer ? \n 1 : Torpilleur Horizontal\n "
					+ "2 : Torpilleur Vertical \n 3 : Croiseur Horizontal \n 4 : Croiseur Vertical\n "
					+ "5 : Porte-Avion Horizontal\n 6 : Porte-Avion Vertical");
				bateauChoisi = s.nextInt();
			} while  (bateauChoisi < 1 ||  bateauChoisi > 6);
			
			switch(bateauChoisi) {
				case 1 :
					bateau = new Bateau("Torpilleur Horizontal", 2, 1);
					break;
				case 2 :
					bateau = new Bateau("Torpilleur Vertical", 1, 2);
					break;
				case 3 :
					bateau = new Bateau("Croiseur Horizontal", 4, 1);
					break;
				case 4 :
					bateau = new Bateau("Croiseur Vertical", 1, 4);
					break;
				case 5 :
					bateau = new Bateau("Porte-Avion Horizontal", 5, 1);
					break;
				case 6 :
					bateau = new Bateau("Porte-Avion Vertical", 1, 5);
					break;
				default :
					System.out.println(bateauChoisi);
					System.out.println("Merci de saisir une valeur présente dans la liste");
			}
			
			//TODO : gérer plus proprement les différents types de bateaux ? 
			
			
			do {
				System.out.println("Veuillez entrer les coordonnées du coin inférieur gauche du bateau : ");
				System.out.print("x : ");
				x = s.nextInt();
				System.out.print("y : ");
				y = s.nextInt();
				
				s.nextLine();
				ok = grille.placeBateau(bateau, x, y);
				if(ok == false) {
					System.out.println("Impossible de placer le bateau à cet endroit !");
				}else{
					System.out.println("Bateau placé ! :-)");
				}
			} while (ok == false);
			
			nbBateaux++;

			System.out.println("Voulez-vous ajouter un bateau ? o/n : ");
		
		} while (!s.nextLine().equalsIgnoreCase("n"));
		
		System.out.println("C'est la guerre ! \n");
		
		do {
			System.out.println("Indiquez les coordonnées de la case cible :");
			System.out.println("x : ");
			x = s.nextInt();
			System.out.println("y : ");
			y = s.nextInt();
			
			if(grille.fire(x, y) == 4) {
				nbBateaux--;
			}
			
		} while (nbBateaux > 0);
		
		System.out.println("Bravo, vous avez coulé tous les bateaux ! :-D");
		
		s.close();
	}

}
