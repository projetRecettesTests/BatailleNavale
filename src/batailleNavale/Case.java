package batailleNavale;

public class Case
{
	private Boat boat;
	private boolean isOccupied;
	private boolean isShot;

	public Case()
	{
		this.isOccupied = false;
		this.isShot = false;
	}

	public Boat getBoat() {
		return boat;
	}

	public void setBoat(Boat boat) {
		this.boat = boat;
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
