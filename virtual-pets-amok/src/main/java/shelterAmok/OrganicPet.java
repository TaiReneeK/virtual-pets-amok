package shelterAmok;

import java.util.Random;

public abstract class OrganicPet extends Pet
{
	Random rand = new Random();

	protected int hunger;
	protected int thirst;
	protected int waste;

	public OrganicPet() 
	{
		super();
	}

	public int getHunger() 
	{
		
		return hunger;
	}

	public int getThirst() 
	{
		return thirst;
	}

	public int getWaste() 
	{
		return waste;
	}

	public void feedPet() 
	{
		hunger -= 5;
		waste += 5;
	}

	public void waterPet() 
	{
		thirst -= 15;
	}

	public void cleanWaste() 
	{waste = 0;
	}
	
	@Override
	public void playPet() 
	{
		boredom -= 5;
		thirst += 5;
		hunger += 5;
		happiness += 5;
	}
	
	public void tick()
	{
		waste += rand.nextInt(9);
		thirst += rand.nextInt(9);
	}

	public void displayStats()
	{
		System.out.println("Name: " + name + " Hunger: " + hunger + " || " +
				" Thirst: " + thirst + " || " + " Boredom: " + boredom + " || " + " Waste: " + 
				waste + " || " + " Health: " + health + " || " + " Happiness: " + happiness);
	}
}