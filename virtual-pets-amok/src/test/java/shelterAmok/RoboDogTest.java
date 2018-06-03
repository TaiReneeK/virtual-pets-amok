package shelterAmok;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RoboDogTest 
{
	RoboDog anyRoboDog = new RoboDog("name", 10, 10, 10, 10, "description");
	
	@Test
	public void shouldTenderProperRoboDogProperties()
	{
		String name = anyRoboDog.getName();
		int boredom = anyRoboDog.getBoredom();
		int health = anyRoboDog.getHealth();
		int happiness = anyRoboDog.getHappiness();
		int oilLevel = anyRoboDog.getOilLevel();
		String description = anyRoboDog.getDescription();
		
		assertEquals("name", name);
		assertEquals(10, boredom);
		assertEquals(10, health);
		assertEquals(10, happiness);
		assertEquals(10, oilLevel);
		assertEquals("description", description);
	}
	
	@Test
	public void shouldDecreaseBoredomAndDecreaseOilLevelByPlayOf5()
	{
		anyRoboDog.playPet();
		int checkBoredom = anyRoboDog.getBoredom();
		int checkOilLevel = anyRoboDog.getOilLevel();
		assertEquals(5, checkBoredom);
		assertEquals(5, checkOilLevel);
	}
	
	@Test
	public void shouldHaveHealthDecreaseBy5DueToOilLevel()
	{
		anyRoboDog.reduceHealth();
		int checkHealth = anyRoboDog.getHealth();
		assertEquals(5, checkHealth);
	}
	
	@Test
	public void shouldIncreaseHappinessBy5AfterWalk()
	{
		anyRoboDog.walk();
		int checkHappiness = anyRoboDog.getHappiness();
		assertEquals(15, checkHappiness);
	}
	
	@Test
	public void shouldIncreaseOilLevelTo15AfterMaintenanceOf5()
	{
		anyRoboDog.increaseOilLevel();
		int checkOilLevel = anyRoboDog.getOilLevel();
		assertEquals(15, checkOilLevel);
	}
	
	@Test
	public void shouldDecreaseOilLevelTo5AfterOilReductionOf5()
	{
		anyRoboDog.reduceOilLevel();
		int checkOilLevel = anyRoboDog.getOilLevel();
		assertEquals(5, checkOilLevel);
	}
}
