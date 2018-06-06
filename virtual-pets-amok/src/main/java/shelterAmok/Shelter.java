package shelterAmok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Shelter 
{
	Map<String, Pet> pets = new HashMap<>();

	public void admitPet(Pet anyPet) 
	{
		pets.put(anyPet.getName(), anyPet);
	}

	public Pet findPet(String name) 
	{
		return pets.get(name);
	}

	public Collection<Pet> getAllPets() 
	{
		return pets.values();
	}

	public void releasePet(Pet anyPet) 
	{
		pets.remove(anyPet.getName());
	}
	
	public void showAllPets()
	{
		for(Pet pets : pets.values())
		{
			System.out.println("Name: " + pets.getName() + " || " + " Description: " + pets.getDescription());
		}
	}
	
	public void displayPetStats()
	{
		for(Pet pets : pets.values())
		{
			pets.displayStats();
		}
	}

	public void walkDogs() 
	{
		for(Pet pets : pets.values())
		{
			if(pets instanceof WalkDogs)
			{
				((WalkDogs) pets).walk();
			}
		}
	}
	
	public void feedAllOrganic()
	{
		for(Pet pets : pets.values())
		{
			if(pets instanceof OrganicPet)
			{
				((OrganicPet) pets).feedPet();
			}
		}
	}
	
	public void waterAllOrganic()
	{
		for(Pet pets : pets.values())
		{
			if(pets instanceof OrganicPet)
			{	
				((OrganicPet) pets).waterPet();

			}
		}
	}
	
	public void cleanDogCages()
	{
		for(Pet pets : pets.values())
		{
			if(pets instanceof Dog)
			{
				((OrganicPet) pets).cleanWaste();
			}
		}
	}
	
	public void emptyLitterBoxes()
	{
		for(Pet pets : pets.values())
		{
			if(pets instanceof Cat)
			{
				((OrganicPet) pets).cleanWaste();
			}
		}
	}
	
	public void playWithPet()
	{
		for(Pet pets : pets.values())
		{
			pets.playPet();
		}
	}
	
	public void tickAllPets()
	{
		for(Pet pets : pets.values())
		{
			pets.tick();
		}
	}
	
	public void organicPetStats()
	{
		for(Pet pets : pets.values())
		{
			if(pets instanceof OrganicPet)
			{
				pets.displayStats();
			}
		}
	}
	
	public void oiling()
	{
		for(Pet pets : pets.values())
		{
			if(pets instanceof RoboticPet)
			{
				((RoboticPet) pets).increaseOilLevel();
			}
		}
	}

}
