import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class OrganicTest {
	Organic testOrganicPet = new Organic("Bill", "a cranky organic dog", 50, 50, 50, 50, 30);

	@Test
	public void feedShouldDecreasePetHunger() {
		testOrganicPet.feedOnePet();
		int petHungerAfterFeed = testOrganicPet.getHunger();
		assertThat(petHungerAfterFeed, is(equalTo(0)));
	}
	@Test
	public void feedShouldIncreaseNeedToPotty() {
		int petNeedToPottyBeforeFeed = testOrganicPet.getNeedToPotty();
		testOrganicPet.feedOnePet();
		int petNeedToPottyAfterFeed = testOrganicPet.getNeedToPotty();
		assertThat(petNeedToPottyAfterFeed, is(equalTo(petNeedToPottyBeforeFeed + 5)));
	}
	@Test
	public void waterShouldDecreasePetThirst() {
		int petThirstBeforeWater = testOrganicPet.getThirst();
		testOrganicPet.waterOnePet();
		int petThirstAfterWater = testOrganicPet.getThirst();
		assertThat(petThirstAfterWater, is(lessThan(petThirstBeforeWater)));
	}
	@Test
	public void waterShouldIncreasePetNeedToPotty() {
		int petNeedToPottyBeforeWater = testOrganicPet.getNeedToPotty();
		testOrganicPet.waterOnePet();
		int petNeedToPottyAfterWater = testOrganicPet.getNeedToPotty();
		assertThat(petNeedToPottyAfterWater, is(equalTo(petNeedToPottyBeforeWater + 5)));
	}

}
