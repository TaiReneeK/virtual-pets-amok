package shelterAmok;

import java.util.Random;

public abstract class RoboticPet extends Pet
{
	Random rand = new Random();

	protected int oilLevel;

	public int getOilLevel() 
	{
		return oilLevel;
	}

	public void increaseOilLevel() 
	{
		oilLevel += 20;
	}

	public void reduceOilLevel() 
	{
		oilLevel -= 3;
	}

	public void playPet() 
	{
		boredom -= 5;
		happiness += 5;
		this.reduceOilLevel();
	}
	
	public void tick()
	{
		oilLevel -= rand.nextInt(3);
		
	}
	
	public void displayStats()
	{
		System.out.println("Name: " + name + " Oil Level : " + oilLevel + " || " + " Boredom: " + 
		boredom + " || " + " Health: " + health + " || " + " Happiness: " + happiness);
	}
	
	public void robotMaintenance()
	{
		this.increaseOilLevel();
	}
}