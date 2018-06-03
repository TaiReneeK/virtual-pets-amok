package shelterAmok;

public abstract class RoboticPet extends Pet
{

	protected int oilLevel;

	public int getOilLevel() 
	{
		return oilLevel;
	}

	public void increaseOilLevel() 
	{
		oilLevel += 5;
	}

	public void reduceOilLevel() 
	{
		oilLevel -= 5;
	}

	public void playPet() 
	{
		boredom -= 5;
		this.reduceOilLevel();
	}
}