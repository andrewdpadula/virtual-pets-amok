
public class OrganicCat extends Organic {

	public OrganicCat(String petName, String description, int health, int happiness, int hunger, int thirst,
			int needToPotty) {
		super(petName, description, health, happiness, hunger, thirst, needToPotty);
	}

	public void addWasteInLitterBox() {
		amountOfWasteInLitterBox += 1;
	}

	public void cleanLitterBox() {
		amountOfWasteInLitterBox = 0;
	}
}
