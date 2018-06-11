import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class OrganicDogTest {
	OrganicDog testOrganicDog = new OrganicDog("Jeff", "an energetic organic dog", 50, 50, 50, 50, 30, 3);

	@Test
	public void cleaningCageShouldSetWasteInCageToZero() {
		testOrganicDog.cleanCage();
		int wasteInCageAfterCleaning = testOrganicDog.getWasteInCage();
		assertThat(wasteInCageAfterCleaning, is(equalTo(0)));
	}
}
