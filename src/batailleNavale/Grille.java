package batailleNavale;

public class Grille
{
	private Case[][] grille;
	private int dim1;
	private int dim2;

	public Grille(int dim1, int dim2)
	{
		this.dim1 = dim1;
		this.dim2 = dim2;
		this.grille = new Case[dim1][dim2];
		fillGrille();

	}

	private void fillGrille()
	{
		for (int i = 0; i < dim1; i++)
		{
			for (int j = 0; j < dim2; j++)
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
			laCase = grille[x][y];
		} catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("La case n'est pas dans la grille !");
		}

		return laCase;
	}

	public int getDim1()
	{
		return dim1;
	}

	public int getDim2()
	{
		return dim2;
	}

}
