package batailleNavale;

public class Bateau
{
	private static int cpt = 0;
	private int id;
	private String name;
	private int length;
	private int width;
	private int nbActiveCases;
	private boolean isSunk = false;
	
	public Bateau(String name, int length, int width)
	{
		this.id = ++cpt;
		this.name = name;
		this.length = length;
		this.width = width;
		this.nbActiveCases = length * width;
	}

	public int getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	public int getLength()
	{
		return length;
	}

	public int getWidth()
	{
		return width;
	}
	
	public int getNbActiveCases()
	{
		return nbActiveCases;
	}
	
	public boolean isSunk()
	{
		return isSunk;
	}

	public void hit(){
		this.nbActiveCases = this.nbActiveCases - 1; 
		if (this.nbActiveCases == 0){
			this.isSunk = true ;
		}
	}
	
}
