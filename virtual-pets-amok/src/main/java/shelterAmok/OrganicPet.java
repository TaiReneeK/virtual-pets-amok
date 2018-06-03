package shelterAmok;

public abstract class OrganicPet extends Pet
{

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
	}

	public void waterPet() 
	{
		thirst -= 5;
	}

	public void cleanWaste() 
	{
		waste = 0;
	}
	
	@Override
	public void playPet() 
	{
		boredom -= 5;
		thirst += 5;
		hunger += 5;
	}

}