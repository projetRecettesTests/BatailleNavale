package batailleNavale;

public class Game
{

	public static void main(String[] args)
	{
		Bateau b1 = new Bateau("Fégate", 5, 1);
		Bateau b2 = new Bateau("Fégate", 5, 1);
		System.out.println(b1.getId());
		System.out.println(b2.getId());
	}

}
