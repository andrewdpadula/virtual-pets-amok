import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;

public class VirtualPetShelterTest {
	VirtualPetShelter testShelter = new VirtualPetShelter();
	VirtualPet newTestPet = new Organic("Bob", "a feisty robotic dog", 50, 50, 50, 50, 30);
	// change VirtualPet to a subclass

	@Test
	public void shouldAddPetToShelter() {
		int numberOfPetsBeforeAdding = testShelter.getPetCount();
		testShelter.addPet(newTestPet);
		int numberOfPetsAfterAdding = testShelter.getPetCount();
		assertThat(numberOfPetsAfterAdding, is(equalTo(numberOfPetsBeforeAdding + 1)));

	}

	@Test
	public void shouldRemovePetFromShelter() {
		testShelter.addPet(newTestPet);
		int numberOfPetsBeforeAdopt = testShelter.getPetCount();
		testShelter.adoptPet(newTestPet.getPetName());
		int numberOfPetsAfterAdopt = testShelter.getPetCount();
		assertThat(numberOfPetsAfterAdopt, is(equalTo(numberOfPetsBeforeAdopt - 1)));
	}
}
