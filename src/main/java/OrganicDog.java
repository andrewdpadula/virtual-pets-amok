
public class OrganicDog extends Organic implements Walking {
	private int wasteInCage;

	public OrganicDog(String petName, String description, int health, int happiness, int hunger, int thirst,
			int needToPotty, int wasteInCage) {
		super(petName, description, health, happiness, hunger, thirst, needToPotty);
		this.wasteInCage = wasteInCage;
	}

	public int getWasteInCage() {
		return wasteInCage;
	}

	public void cleanCage() {
		wasteInCage = 0;

	}

	public void addWasteInCage() {
		wasteInCage += 1;
	}

	@Override
	public void walk(VirtualPet dog) {
		needToPotty = 0;
		hunger += 2;
		thirst += 2;
		happiness += 5;
	}

}
