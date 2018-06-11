
public class Robotic extends VirtualPet {

	public Robotic(String petName, String description, int health, int happiness, int needForOil,
			int needForMaintenance) {
		super(petName, description, health, happiness);
		this.needForOil = needForOil;
		this.needForMaintenance = needForMaintenance;
	}

	public int getNeedForOil() {
		return needForOil;
	}

	public int getNeedForMaintenance() {
		return needForMaintenance;
	}

	public void raiseNeedForOil() {
		needForOil += 1;
	}

	public void raiseNeedForMaintenance() {
		needForMaintenance += 1;
	}

}
