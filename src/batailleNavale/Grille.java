package batailleNavale;

public class Grille
{
	private Case[][] grille;
	private int x;
	private int y;

	public Grille(int x, int y)
	{
		this.x = x;
		this.y = y;
		this.grille = new Case[x][y];
		fillGrille();

	}
	
	private void placeBateau(Bateau bat, int x, int y){
		
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
		Case laCase = null;

		try
		{
			laCase = grille[x-1][y-1];
			
		} catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("La case n'est pas dans la grille !");
		}

		return laCase;
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
