package shelterAmok;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CatTest 
{
	Cat anyCat = new Cat("name", 10, 10, 10, 10, 10, 10, "description" );

	@Test
	public void shouldTenderProperDogProperties()
	{
		String name = anyCat.getName();
		int hunger = anyCat.getHunger();
		int thirst = anyCat.getThirst();
		int boredom = anyCat.getBoredom();
		int waste = anyCat.getWaste();
		int health = anyCat.getHealth();
		int happiness = anyCat.getHappiness();
		String description = anyCat.getDescription();
		
		assertEquals("name", name);
		assertEquals(10, hunger);
		assertEquals(10, thirst);
		assertEquals(10, boredom);
		assertEquals(10, waste);
		assertEquals(10, health);
		assertEquals(10, happiness);
		assertEquals("description", description);
	}
	
	@Test
	public void shouldDecreaseHungerBy5AfterFeedOf5()
	{
		anyCat.feedPet();
		int checkHunger = anyCat.getHunger();
		assertEquals(5, checkHunger);
	}
	
	@Test
	public void shouldDecreaseThirstBy5AfterWaterOf5()
	{
		anyCat.waterPet();
		int checkThirst = anyCat.getThirst();
		assertEquals(5, checkThirst);
	}
	
	@Test
	public void shouldDecreaseBoredomAndIncreaseHungerAndThirstByPlayOf5()
	{
		anyCat.playPet();
		int checkHunger = anyCat.getHunger();
		int checkThirst = anyCat.getThirst();
		int checkBoredom = anyCat.getBoredom();
		assertEquals(15, checkHunger);
		assertEquals(15, checkThirst);
		assertEquals(5, checkBoredom);
	}
	
	@Test
	public void shouldHaveNoWasteAfterCleaningWaste()
	{
		anyCat.cleanWaste();
		int checkWaste = anyCat.getWaste();
		assertEquals(0, checkWaste);
	}
	
	@Test
	public void shouldHaveHealthDecreaseBy5DueToHungerLevel()
	{
		anyCat.reduceHealth();
		int checkHealth = anyCat.getHealth();
		assertEquals(5, checkHealth);
	}
}
