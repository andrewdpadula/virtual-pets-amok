
public class Organic extends VirtualPet {

	public Organic(String petName, String description, int health, int happiness, int hunger, int thirst,
			int needToPotty) {
		super(petName, description, health, happiness);
		this.hunger = hunger;
		this.thirst = thirst;
		this.needToPotty = needToPotty;
	}

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int getNeedToPotty() {
		return needToPotty;
	}

	public void raiseHunger() {
		hunger += 1;
	}

	public void raiseThirst() {
		thirst += 1;
	}

	public void raiseNeedToPotty() {
		needToPotty += 1;
	}


}
