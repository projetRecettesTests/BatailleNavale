package batailleNavale;

public class Bateau
{
	private static int cpt = 0;
	private int id;
	private String name;
	private int length;
	private int width;
	
	public Bateau(String name, int length, int width)
	{
		this.id = ++cpt;
		this.name = name;
		this.length = length;
		this.width = width;
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
	
}
