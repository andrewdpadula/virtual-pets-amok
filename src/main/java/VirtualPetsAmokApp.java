import java.util.Scanner;

public class VirtualPetsAmokApp {
	static Scanner input = new Scanner(System.in);
	static VirtualPetShelter myPetShelter = new VirtualPetShelter();

	public static void main(String[] args) {

		myPetShelter.addPet(new OrganicDog("Stipe", "a lazy organic dog", 50, 50, 25, 25, 25, 0));
		myPetShelter.addPet(new RoboticDog("Mills", "a friendly robotic dog", 50, 50, 25, 25));
		myPetShelter.addPet(new OrganicCat("Buck", "a shy organic cat", 50, 50, 25, 25, 0));
		myPetShelter.addPet(new RoboticCat("Berry", "a naughty robotic cat", 50, 50, 25, 25));

		System.out.println("Virtual Pet 3: PETS AMOK!\nWelcome to our Pet Shelter.");

		boolean quit = false;
		while (!quit) {
			shelterOptions();
			String userInput = input.nextLine();
			if (userInput.equals("1")) {
				myPetShelter.displayStatus();
				System.out.println(
						"Note that organic pets never need oil or maintenance, while robotic pets never need to eat, drink, or go potty.");
			} else if (userInput.equals("2")) {
				System.out.println(
						"You feed the organic pets. This brings their hunger down, but makes them a little thirsty."
								+ "\nFeeding also makes them need to go potty a little bit more.");
				myPetShelter.feedAllOrganicPets();
				myPetShelter.tickAllPets();
			} else if (userInput.equals("3")) {
				System.out.println(
						"You water the organic pets. This brings their thirst down, but makes them a little hungry."
								+ "\nThe water also makes them need to go potty a little bit more.");
				myPetShelter.waterAllOrganicPets();
				myPetShelter.tickAllPets();
			} else if (userInput.equals("4")) {
				myPetShelter.displayStatus();
				System.out.println("Please enter the name of the pet you want to play with.");
				String petToPlayWith = input.nextLine();
				myPetShelter.playWithOnePet(petToPlayWith);
				System.out.println("OK. You play with " + petToPlayWith + ". Playing seems to make " + petToPlayWith
						+ " happier!");
				myPetShelter.tickAllPets();
			} else if (userInput.equals("5")) {
				myPetShelter.walkAllDogs();
				System.out
						.println("You walk all the organic dogs and robotic dogs, boosting their health and happiness."
								+ "\nThe organic dogs relieve themselves outside.");
				myPetShelter.tickAllPets();
			} else if (userInput.equals("6")) {
				myPetShelter.cleanAllCages();
				System.out.println("OK. All waste has been removed from the dog cages.\n"
						+ "The organic dogs show their gratitude by pooping in their cages immediately.\n"
						+ "Please remember to wash your hands before you eat anything.");
				myPetShelter.tickAllPets();
			} else if (userInput.equals("7")) {
				System.out.println("OK. You scoop the excrement from the communal litter box.");
				myPetShelter.cleanCommunalLitterBox();
				myPetShelter.tickAllPets();
			} else if (userInput.equals("8")) {
				myPetShelter.oilAllRobots();
				System.out.println("You grease every creaky, rusty bucket of bolts in this shelter.\n"
						+ "The robotic pets won't need any more oil, for now. They seem a bit happier and healthier as a result!");
				myPetShelter.tickAllPets();
			} else if (userInput.equals("9")) {
				myPetShelter.maintainAllRobots();
				System.out.println(
						"A new update is available for the RoboPet OS. You download and install it for each robotic pet."
								+ "\nThe robotic pets won't need any more maintenance, for now. They seem a bit happier and healthier as a result!");
				myPetShelter.tickAllPets();
			} else if (userInput.equals("10")) {
				myPetShelter.tickAllPets();
				System.out.println("So you'd like to place a pet in the shelter.\nWhat is the pet's name?");
				String petToAddName = input.nextLine();
				System.out.println("And what kind of animal is " + petToAddName + "?\n"
						+ "Please type 1 for organic cat, 2 for organic dog, 3 for robotic cat, or 4 robotic dog.");
				String petToAddSpecies = input.nextLine();
				System.out.println("And finally, which of these attributes best describes " + petToAddName + "?\n"
						+ "Please type friendly, shy, naughty, or lazy.");
				String petToAddCharacteristic = input.nextLine();
				System.out.println("Thank you! " + petToAddName + " has been admitted to the Pet Shelter.");
				switch (petToAddSpecies) {
				case "1":
					myPetShelter.addPet(new OrganicCat(petToAddName, "a " + petToAddCharacteristic + " organic cat", 50,
							50, 25, 25, 0));
					break;
				case "2":
					myPetShelter.addPet(new OrganicDog(petToAddName, "a " + petToAddCharacteristic + " organic dog", 50,
							50, 25, 25, 25, 0));
					break;
				case "3":
					myPetShelter.addPet(new RoboticCat(petToAddName, "a " + petToAddCharacteristic + " robotic cat", 50,
							50, 25, 25));
					break;
				case "4":
					myPetShelter.addPet(new RoboticDog(petToAddName, "a " + petToAddCharacteristic + " robotic dog", 50,
							50, 25, 25));
					break;
				}

			}

			else if (userInput.equals("11")) {
				System.out.println("Which one? Please enter the name of the pet you wish to adopt.");
				myPetShelter.listPetNamesAndDescriptions();
				String petToAdopt = input.nextLine();
				myPetShelter.adoptPet(petToAdopt);
				System.out.println("Congratulations! You have adopted a pet.\n" + petToAdopt
						+ " mysteriously teleports out of the shelter and into your home.");
				myPetShelter.tickAllPets();
			}

			else if (userInput.equals("0")) {
				System.out.println("Thanks for playing! Goodbye.");
				quit = true;
			} else {
				System.out.println("Sorry, that response was not recognized. Try again.");
			}
		}

	}

	private static void shelterOptions() {
		System.out.println("\nHere are our pets:\n" + myPetShelter.listPetNamesAndDescriptions()
				+ "What would you like to do?\nPress 1 to check the status of all pets.   Press 2 to feed organic pets."
				+ "\nPress 3 to give organic pets water.   Press 4 to play with a pet."
				+ "\nPress 5 to walk the dogs.   Press 6 to clean the dog cages."
				+ "\nPress 7 to clean the communal litter box.   Press 8 to oil all robotic pets."
				+ "\nPress 9 to maintain a robotic pet.   Press 10 to add a pet to the shelter."
				+ "\nPress 11 to adopt a pet.   Press 0 to quit.");
	}

}
