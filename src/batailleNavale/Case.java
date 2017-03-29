package batailleNavale;

public class Case
{
	private int x;
	private int y;
	private boolean isOccupied;
	private boolean isShot;

	public Case(int x, int y)
	{
		this.x = x;
		this.y = y;
		this.isOccupied = false;
		this.isShot = false;
	}
}
