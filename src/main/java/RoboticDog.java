
public class RoboticDog extends Robotic implements Walking{

	public RoboticDog(String petName, String description, int health, int happiness, int needForOil,
			int needForMaintenance) {
		super(petName, description, health, happiness, needForOil, needForMaintenance);
	}

	@Override
	public void walk(VirtualPet dog) {
		happiness += 5;
		needForOil += 1;
		needForMaintenance += 1;
	}

}
