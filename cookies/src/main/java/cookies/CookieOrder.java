package cookies;

public class CookieOrder 
{

	private String variety;
	private int numBoxes;

	public Object getVariety() 
	{
		return variety;
	}
	
	public int getNumBoxes() 
	{
		return numBoxes;
	}
	
	public CookieOrder(String variety, int numBoxes) 
	{
		this.numBoxes = numBoxes;
		this.variety = variety;
	}

	
	public void showOrder()
	{
		
	}

}
