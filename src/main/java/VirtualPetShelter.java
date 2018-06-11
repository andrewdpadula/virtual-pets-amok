import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
	Map<String, VirtualPet> pets = new HashMap<>();

	public Collection<VirtualPet> getPets() {
		return pets.values();
	}

	public VirtualPet getAPet(String petName) {
		return pets.get(petName);
	}

	public String listPetNamesAndDescriptions() {
		String status = "";
		for (VirtualPet pet : getPets()) {
			status += "\t" + pet.getPetName() + "\t" + pet.getDescription() + "\n";
		}
		return status;

	}

	public int getPetCount() {
		return pets.size();
	}

	public void addPet(VirtualPet pet) {
		pets.put(pet.getPetName(), pet);
	}

	public void adoptPet(String petName) {
		pets.remove(petName);
	}

	public void displayStatus() {
		for (VirtualPet pet : pets.values()) {
			pet.getStatus();
			if (pet instanceof OrganicDog) {
				System.out.println(
						"    Piles of excrement in " + pet.getPetName() + "'s cage: " + pet.amountOfWasteInCage);
			}
			if (pet instanceof OrganicCat) {
				System.out.println("    Waste in communal litter box: " + pet.amountOfWasteInLitterBox);
			}
		}
	}

	public void playWithOnePet(String petName) {
		getAPet(petName).playWithPet();
	}

	public void feedAllOrganicPets() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof Organic) {

				pet.feedOnePet();
			}
		}
	}

	public void waterAllOrganicPets() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof Organic) {
				pet.waterOnePet();
			}
		}
	}

	public void tickAllPets() {
		for (VirtualPet pet : pets.values()) {
			pet.singleTick();
			if (pet instanceof OrganicDog) {
				if (pet.needToPotty >= 50) {
					((OrganicDog) pet).addWasteInCage();
				}
			}
			if (pet instanceof OrganicCat) {
				if (pet.needToPotty >= 20) {
					((OrganicCat) pet).addWasteInLitterBox();
					pet.needToPotty -= 0;
				}
			}
			if (pet instanceof Organic) {
				((Organic) pet).raiseHunger();
				((Organic) pet).raiseThirst();
				((Organic) pet).raiseNeedToPotty();
			} else if (pet instanceof Robotic) {
				((Robotic) pet).raiseNeedForOil();
				((Robotic) pet).raiseNeedForMaintenance();
			}
			if (pet.amountOfWasteInLitterBox >= 20) {
				if (pet instanceof OrganicCat) {
					System.out.println(
							"The communal litter box is overflowing with excrement. You'd better clean it soon!"
									+ "\nThe health of your organic cat(s) will decrease at a faster pace until the box is cleaned.");
					pet.health -= 1;
				}
			}
			if (pet.amountOfWasteInCage >= 20) {
				if (pet instanceof OrganicDog) {
					System.out.println(
							pet.getPetName() + "'s cage has a lot of waste in it. You'd better clean the cages soon!"
									+ "\nThe health of " + pet.getPetName()
									+ " will decrease at a faster pace until the cages are cleaned.");
					pet.health -= 1;
				}
			}
			if (pet.getHealth() <= 0) {
				System.out.println("Oh, no! " + pet.getPetName() + " has died because you let its health reach zero."
						+ "\nGame over!");
				System.exit(0);
			}
		}
	}

	public void oilAllRobots() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof Robotic) {
				pet.oilRobot();
			}
		}
	}

	public void maintainAllRobots() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof Robotic) {
				pet.maintainRobot();
			}
		}
	}

	public void cleanAllCages() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof OrganicDog) {
				(pet).cleanCage();
			}
		}

	}

	public void cleanCommunalLitterBox() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof OrganicCat) {
				((OrganicCat) pet).cleanLitterBox();
			}

		}
	}

	public void walkAllDogs() {
		for (VirtualPet pet : pets.values()) {
			if (pet instanceof OrganicDog || pet instanceof RoboticDog) {
				pet.walk();
			}
		}

	}
}
