package batailleNavale;

import java.util.ArrayList;
import java.util.List;

public class Grille
{
	private Case[][] grille;
	private int x;
	private int y;
	private List<Bateau> listeBateaux;

	public Grille(int x, int y)
	{
		this.x = x;
		this.y = y;
		this.grille = new Case[x][y];
		this.listeBateaux = new ArrayList<Bateau>();
		fillGrille();

	}
	
	public boolean placeBateau(Bateau bat, int x, int y){
		Case laCase = null;
		
		for(int i = 0; i < bat.getLength(); i++) {
			for (int j = 0; j < bat.getWidth(); j++){
				laCase = this.accessCase(x+i, y+j);
				if (laCase == null || laCase.isOccupied()){
					return false;	
				}
			}
		}
		
		for(int i = 0; i < bat.getLength(); i++) {
			for (int j = 0; j < bat.getWidth(); j++){
				this.accessCase(x+i, y+j).setBateau(bat);
				System.out.println("case "+ (x+i) + ", " + (x+j) + " placée !");
			}
		}
			
		this.listeBateaux.add(bat);
		return true;
		
	}

	private void fillGrille()
	{
		for (int i = 0; i < x; i++)
		{
			for (int j = 0; j < y; j++)
			{
				grille[i][j] = new Case(i, j);
			}
		}
	}

	public Case accessCase(int x, int y)
	{
		Case laCase;
		
		if(x < 0 || x > this.getX() || y < 0 || y > this.getY()) {
			laCase = null;
			System.out.println("La case n'est pas dans la grille !");
		}
		else {
			laCase = grille[x-1][y-1];
		}

		return laCase;
	}
	
	public boolean fire(int x, int y){
		Case laCase = this.accessCase(x, y);	
		
		if (laCase == null){
			return false;
		}else if (laCase.isShot()) {
			System.out.println("Vous avez déjà tiré içi !");
			return false;
		} else if (!laCase.isOccupied()){
			System.out.println("Raté !");
			laCase.setShot(true);
			return true;
		}else{
			System.out.println("Touché !");
			laCase.setShot(true);
			laCase.getBateau().hit();
			if (laCase.getBateau().isSunk()){
				System.out.println("Coulé !");
			}
			return true;
		}
	}

	public int getX()
	{
		return x;
	}

	public int getY()
	{
		return y;
	}

}
