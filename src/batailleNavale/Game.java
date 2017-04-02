package batailleNavale;

import java.util.Scanner;

public class Game
{

	public static int length;
	public static int width;
	public static Grid grid;
	
	public static void main(String[] args)
	{
		Boat boat = null;
		int x;
		int y;		
		boolean ok = false;
		int nbOfBoats = 0;
		int selectedBoat = 0;
		Scanner s;
		s = new Scanner(System.in);
		
		System.out.println("Indiquez la longueur de grille souhaitée : ");
		length = s.nextInt();
		
		System.out.println("Indiquez la largeur de grille souhaitée : ");
		width = s.nextInt();
		
		grid = new Grid(length, width);
		
		do {
			do {
				System.out.println("Quel type de bateau souhaitez-vous placer ? \n "
						+ "1 : Torpilleur Horizontal\n 2 : Torpilleur Vertical \n "
						+ "3 : Croiseur Horizontal \n 4 : Croiseur Vertical\n "
						+ "5 : Porte-Avion Horizontal\n 6 : Porte-Avion Vertical");
				selectedBoat = s.nextInt();
			} while  (selectedBoat < 1 ||  selectedBoat > 6);
			
			switch(selectedBoat) {
				case 1 :
					boat = new Boat("Torpilleur Horizontal", 2, 1);
					break;
				case 2 :
					boat = new Boat("Torpilleur Vertical", 1, 2);
					break;
				case 3 :
					boat = new Boat("Croiseur Horizontal", 4, 1);
					break;
				case 4 :
					boat = new Boat("Croiseur Vertical", 1, 4);
					break;
				case 5 :
					boat = new Boat("Porte-Avion Horizontal", 5, 1);
					break;
				case 6 :
					boat = new Boat("Porte-Avion Vertical", 1, 5);
					break;
				default :
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
				ok = grid.placeBoat(boat, x, y);
				if(ok == false) {
					System.out.println("Impossible de placer le bateau à cet endroit !");
				}else{
					System.out.println("Bateau placé ! :-)");
				}
			} while (ok == false);
			
			nbOfBoats++;

			System.out.println("Voulez-vous ajouter un bateau ? o/n : ");
		
		} while (!s.nextLine().equalsIgnoreCase("n"));
		
		System.out.println("C'est la guerre ! \n");
		
		do {
			System.out.println("Indiquez les coordonnées de la case cible :");
			System.out.println("x : ");
			x = s.nextInt();
			System.out.println("y : ");
			y = s.nextInt();
			
			if(grid.fire(x, y) == 4) {
				nbOfBoats--;
			}
			
		} while (nbOfBoats > 0);
		
		System.out.println("Bravo, vous avez coulé tous les bateaux ! :-D");
		
		s.close();
	}

}
