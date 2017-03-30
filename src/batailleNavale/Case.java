package batailleNavale;

public class Case
{
	private int x;
	private int y;
	private Bateau bateau;
	private boolean isOccupied;
	private boolean isShot;

	public Case(int x, int y)
	{
		this.x = x;
		this.y = y;
		this.isOccupied = false;
		this.isShot = false;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Bateau getBateau() {
		return bateau;
	}

	public void setBateau(Bateau bateau) {
		this.bateau = bateau;
		this.setOccupied(true);
	}

	public boolean isOccupied() {
		return isOccupied;
	}

	public void setOccupied(boolean isOccupied) {
		this.isOccupied = isOccupied;
	}

	public boolean isShot() {
		return isShot;
	}

	public void setShot(boolean isShot) {
		this.isShot = isShot;
	}
	
	
}
