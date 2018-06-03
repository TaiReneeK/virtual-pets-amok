package shelterAmok;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class DogTest 
{
	Dog anyDog = new Dog("name", 10, 10, 10, 10, 10, 10, "description" );

	@Test
	public void shouldTenderProperDogProperties()
	{
		String name = anyDog.getName();
		int hunger = anyDog.getHunger();
		int thirst = anyDog.getThirst();
		int boredom = anyDog.getBoredom();
		int waste = anyDog.getWaste();
		int health = anyDog.getHealth();
		int happiness = anyDog.getHappiness();
		String description = anyDog.getDescription();
		
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
		anyDog.feedPet();
		int checkHunger = anyDog.getHunger();
		assertEquals(5, checkHunger);
	}
	
	@Test
	public void shouldDecreaseThirstBy5AfterWaterOf5()
	{
		anyDog.waterPet();
		int checkThirst = anyDog.getThirst();
		assertEquals(5, checkThirst);
	}
	
	@Test
	public void shouldDecreaseBoredomAndIncreaseHungerAndThirstByPlayOf5()
	{
		anyDog.playPet();
		int checkHunger = anyDog.getHunger();
		int checkThirst = anyDog.getThirst();
		int checkBoredom = anyDog.getBoredom();
		assertEquals(15, checkHunger);
		assertEquals(15, checkThirst);
		assertEquals(5, checkBoredom);
	}
	
	@Test
	public void shouldHaveNoWasteAfterCleaningWaste()
	{
		anyDog.cleanWaste();
		int checkWaste = anyDog.getWaste();
		assertEquals(0, checkWaste);
	}
	
	@Test
	public void shouldDecreaseWasteBy5AndIncreaseHappinessBy5AfterWalking()
	{
		anyDog.walk();
		int checkWaste = anyDog.getWaste();
		int checkHappiness = anyDog.getHappiness();
		assertEquals(5, checkWaste);
		assertEquals(15, checkHappiness);
	}
	
	@Test
	public void shouldHaveHealthDecreaseBy5DueToHungerLevel()
	{
		anyDog.reduceHealth();
		int checkHealth = anyDog.getHealth();
		assertEquals(5, checkHealth);
	}
	

}
