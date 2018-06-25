package computer;

import java.text.NumberFormat;
import java.util.Locale;

public class Computer 
{

	NumberFormat money = NumberFormat.getCurrencyInstance(Locale.US);

	// instance variables : properties of our object
	private String brand;
	private String model;
	private double price;
	private int memorySpace;

	// getters (accessor methods) to access any private data publicly
	public String getBrand() 
	{
		return brand;
	}

	public int getMemorySpace() 
	{
		return memorySpace;
	}

	// constructor
	public Computer(String brand, String model, double price, int memorySpace) 
	{
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.memorySpace = memorySpace;
	}

	// methods of behavior
	public String download() 
	{
		memorySpace -= 10;
		return this.brand + " is downloading...";
	}

	// displays all details the developer wants to show
	public String toString() 
	{
		return "Brand: " + brand + " Model: " + model + " Price: " + money.format(price);
	}

}
