package shelterAmok;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RoboCatTest 
{
RoboCat anyRoboCat = new RoboCat("name", 10, 10, 10, 10, "description");
	
	@Test
	public void shouldTenderProperRoboDogProperties()
	{
		String name = anyRoboCat.getName();
		int boredom = anyRoboCat.getBoredom();
		int health = anyRoboCat.getHealth();
		int happiness = anyRoboCat.getHappiness();
		int oilLevel = anyRoboCat.getOilLevel();
		String description = anyRoboCat.getDescription();
		
		assertEquals("name", name);
		assertEquals(10, boredom);
		assertEquals(10, health);
		assertEquals(10, happiness);
		assertEquals(10, oilLevel);
		assertEquals("description", description);
	}
	
	@Test
	public void shouldDecreaseBoredomAndDecreaseOilLevelByPlay()
	{
		anyRoboCat.playPet();
		int checkBoredom = anyRoboCat.getBoredom();
		int checkOilLevel = anyRoboCat.getOilLevel();
		assertEquals(5, checkBoredom);
		assertEquals(7, checkOilLevel);
	}
	
	@Test
	public void shouldHaveHealthDecreaseBy5DueToOilLevel()
	{
		anyRoboCat.reduceHealth();
		int checkHealth = anyRoboCat.getHealth();
		assertEquals(5, checkHealth);
	}
	
	@Test
	public void shouldIncreaseOilLevelTo15AfterMaintenanceOf5()
	{
		anyRoboCat.increaseOilLevel();
		int checkOilLevel = anyRoboCat.getOilLevel();
		assertEquals(30, checkOilLevel);
	}
	
	@Test
	public void shouldDecreaseOilLevelTo5AfterOilReductionOf5()
	{
		anyRoboCat.reduceOilLevel();
		int checkOilLevel = anyRoboCat.getOilLevel();
		assertEquals(7, checkOilLevel);
	}
	
	@Test
	public void robotMaintenanceShouldIncreaseOilLevelBy20()
	{
		anyRoboCat.robotMaintenance();
		int checkOilLevel = anyRoboCat.getOilLevel();
		assertEquals(30, checkOilLevel);
	}
}
