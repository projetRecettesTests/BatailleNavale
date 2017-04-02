package batailleNavale;

import java.util.ArrayList;
import java.util.List;

public class Grid
{
	private Case[][] grid;
	private int x;
	private int y;
	private List<Boat> listBoats;

	public Grid(int x, int y)
	{
		this.x = x;
		this.y = y;
		this.grid = new Case[x][y];
		this.listBoats = new ArrayList<Boat>();
		fillGrid();

	}
	
	public boolean placeBoat(Boat bat, int x, int y){
		Case theCase = null;
		String message = " Le bateau est bien positionné en cases ";
		
		for(int i = 0; i < bat.getLength(); i++) {
			for (int j = 0; j < bat.getWidth(); j++){
				theCase = this.accessCase(x+i, y+j);
				if (theCase == null || theCase.isOccupied()){
					return false;	
				}
			}
		}
		
		for(int i = 0; i < bat.getLength(); i++) {
			for (int j = 0; j < bat.getWidth(); j++){
				this.accessCase(x+i, y+j).setBoat(bat);
				message += "[" + (x+i) + "," + (y+j) + "] ";
			}
		}
			
		this.listBoats.add(bat);
		System.out.println(message + "!\n");
		return true;
		
	}

	private void fillGrid()
	{
		for (int i = 0; i < x; i++)
		{
			for (int j = 0; j < y; j++)
			{
				grid[i][j] = new Case();
			}
		}
	}

	public Case accessCase(int x, int y)
	{
		Case theCase;
		
		if(x < 0 || x > this.getX() || y < 0 || y > this.getY()) {
			theCase = null;
			System.out.println("La case n'est pas dans la grille !\n");
		}
		else {
			theCase = grid[x-1][y-1];
		}

		return theCase;
	}
	
	public int fire(int x, int y){
		Case theCase = this.accessCase(x, y);	
		
		if (theCase == null){
			return 0;
		}else if (theCase.isShot()) {
			System.out.println("Vous avez déjà tiré içi !\n");
			return 1;
		} else if (!theCase.isOccupied()){
			System.out.println("Raté !\n");
			theCase.setShot(true);
			return 2;
		}else{
			System.out.println("Touché !\n");
			theCase.setShot(true);
			theCase.getBoat().hit();
			if (theCase.getBoat().isSunk()){
				System.out.println("Coulé !\n");
				return 4;
			}
			return 3;
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
