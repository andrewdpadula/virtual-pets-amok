import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class RoboticTest {
	Robotic testPetRobotic = new Robotic("Robocop", "a crime-fighting robotic dog", 50, 50, 30, 30);

	@Test
	public void oilingShouldDecreaseNeedForOil() {
		testPetRobotic.oilRobot();
		int needForOilAfterOiling = testPetRobotic.getNeedForOil();
		assertThat(needForOilAfterOiling, is(equalTo(0)));
	}
	
/*	@Test
	public void oilingShouldIncreaseHealth() {
		int healthBeforeOiling = testPetRobotic.getHealth();
		testPetRobotic.oilRobot();
		int healthAfterOiling = testPetRobotic.getHealth();
		assertThat(healthAfterOiling, is(equalTo(healthBeforeOiling + 5)));
	}*/

	@Test
	public void maintainShouldDecreaseNeedForMaintenance() {
		testPetRobotic.maintainRobot();
		int needForMaintenanceAfterMaintaining = testPetRobotic.getNeedForMaintenance();
		assertThat(needForMaintenanceAfterMaintaining, is(equalTo(0)));
	}
}
