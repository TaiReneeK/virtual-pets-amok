package collections;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class RestaurantMenu 
{

	public static void main(String[] args) 
	{
		Map<String, BigDecimal> items = new HashMap<String, BigDecimal>();

		items.put("Spaghetti", new BigDecimal("8.97"));
		items.put("Lasagna", new BigDecimal("10.98"));
		items.put("Pizza", new BigDecimal("15.50"));
		items.put("Caesar Salad", new BigDecimal("7.00"));
		items.put("Kale Salad", new BigDecimal("7.00"));
		
		System.out.println("The price of spaghetti is: " + items.get("Spaghetti"));
		
		System.out.println(items.size() + " items are on the menu");
		
		items.put("Champagne", new BigDecimal("200.00"));
		items.put("Vintage Wine", new BigDecimal("175.00"));
		
		System.out.println("Menu contains champagne = " + items.containsKey("Champagne"));
		System.out.println("Menu contains a $13.50 item = " + items.containsValue(new BigDecimal("13.50")));
		
		System.out.println("We removed " + items.remove("Kale Salad"));
		
		
		
		
		
		
	}

}
