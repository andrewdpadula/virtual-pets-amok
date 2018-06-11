
public abstract class VirtualPet {
	private String petName;
	private String description;
	protected int health;
	protected int happiness;
	private int amount = 5;

	public VirtualPet(String petName, String description, int health, int happiness) {
		super();
		this.petName = petName;
		this.description = description;
		this.health = health;
		this.happiness = happiness;
	}

	protected int hunger;
	protected int thirst;
	protected int needToPotty;

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int getNeedToPotty() {
		return needToPotty;
	}

	public int getNeedForOil() {
		return needForOil;
	}

	public int getNeedForMaintenance() {
		return needForMaintenance;
	}

	public int getAmountOfWasteInCage() {
		return amountOfWasteInCage;
	}

	public int getAmountOfWasteInLitterBox() {
		return amountOfWasteInLitterBox;
	}

	protected int needForOil;
	protected int needForMaintenance;

	protected int amountOfWasteInCage;
	protected int amountOfWasteInLitterBox;

	public String getPetName() {
		return petName;
	}

	public String getDescription() {
		return description;
	}

	public int getHealth() {
		return health;
	}

	public int getHappiness() {
		return happiness;
	}

	public int getAmount() {
		return amount;
	}

	public int playWithPet() {
		happiness += amount * 3;
		health += amount;
		return happiness;
	}

	public void getStatus() {
		System.out.println("  " + petName + ", " + description + "\n    Health: " + health + " | Happiness: "
				+ happiness + "\n    Hunger: " + hunger + " | Thirst: " + thirst + " | Needs to go potty: "
				+ needToPotty + "\n    Needs oil: " + needForOil + " | Needs maintenance: " + needForMaintenance + "");

	}

	public int feedOnePet() {
		hunger = 0;
		thirst += amount;
		needToPotty += amount;
		return hunger;
	}

	public int waterOnePet() {
		thirst = 0;
		hunger += amount;
		needToPotty += amount;
		return thirst;

	}

	public void singleTick() {
		happiness -= 1;
		health -= 1;
		amountOfWasteInLitterBox += 1;
		amountOfWasteInCage += 1;
	}

	public void oilRobot() {
		needForOil = 0;
		happiness += amount;
		health += amount;
	}

	public void maintainRobot() {
		needForMaintenance = 0;
		happiness += amount;
		health += amount;
	}

	public void walk() {
		happiness += amount;
		health += amount;
		needToPotty = 0;
	}

	public void cleanCage() {
		amountOfWasteInCage = 0;
		happiness += amount;
		health += amount;
	}

}
