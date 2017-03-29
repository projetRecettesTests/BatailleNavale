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
	}
	
}
