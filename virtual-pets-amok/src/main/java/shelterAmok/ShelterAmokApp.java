package shelterAmok;

import java.util.Scanner;

import javax.swing.text.Position;

public class ShelterAmokApp 
{
	public static void main(String[] args)
	{
	Scanner input = new Scanner(System.in);
	Shelter myShelter = new Shelter();

	Dog BonIver = new Dog("Bon Iver", 25, 25, 25, 25, 25, 25, "He loves indie folk music");
	Cat Ivy = new Cat("Ivy", 25, 25, 25, 25, 25, 25, "She loves to eat Plants" );
	RoboDog Courage = new RoboDog("Courage", 25, 25, 25, 25, "He is a very cowardly dog");
	RoboCat Felix = new RoboCat("Felix", 25, 25, 25, 25, "He is simple and sensible");

	myShelter.admitPet(BonIver);
	myShelter.admitPet(Ivy);
	myShelter.admitPet(Courage);
	myShelter.admitPet(Felix);
	
	System.out.println("Welcome to the Stranger Things Adoption Center");
	System.out.println("Here are out current pets:");
	System.out.println();
	myShelter.showAllPets();
	
	String choice;
	
	do
	{
		System.out.println();
		System.out.println("Type \"Admit\" to admit a pet");
		System.out.println("Type \"Adopt\" to adopt a pet");
		System.out.println("Type \"Display\" to display pet stats");
		System.out.println("Type \"Play\" to play with all pets");
		System.out.println("Type \"Walk\" to walk all dogs");
		System.out.println("Type \"Organic\" to see organic pet care options");
		System.out.println("Type \"Robot\" for robot maintenance");
		System.out.println("Type \"Exit\" to ignore all pets and leave");
		System.out.println();
		choice = input.nextLine();
		
		if(choice.equalsIgnoreCase("Admit"))
		{
			System.out.println("What type of pet will you be admitting?");
			System.out.println("Dog | Cat | RoboDog | RoboCat");
			String pet = input.nextLine();
			
			if(pet.equalsIgnoreCase("Dog"))
			{
				System.out.println("Enter the name of the dog:");
				String petName = input.nextLine();
				System.out.println();
				System.out.println("Enter a brief description for " + petName);
				String description = input.nextLine();
				System.out.println();
				myShelter.admitPet(new Dog(petName, 25, 25, 25, 25, 25, 25, description));
			}
			else if(pet.equalsIgnoreCase("Cat"))
			{
				System.out.println("Enter the name of the cat: ");
				String petName = input.nextLine();
				System.out.println();
				System.out.println("Enter a brief description for " + petName);
				String description = input.nextLine();
				System.out.println();
				myShelter.admitPet(new Cat(petName, 25, 25, 25, 25, 25, 25, description));
			}
			else if(pet.equalsIgnoreCase("RoboDog"))
			{
				System.out.println("Enter the name of your robotic dog: ");
				String petName = input.nextLine();
				System.out.println();
				System.out.println("Enter a brief description for " + petName);
				String description = input.nextLine();
				System.out.println();
				myShelter.admitPet(new RoboDog(petName, 25, 25, 25, 25, description));
			}
			else if(pet.equalsIgnoreCase("RoboCat"))
			{
				System.out.println("Enter the name of your robotic cat: ");
				String petName = input.nextLine();
				System.out.println();
				System.out.println("Enter a brief description for " + petName);
				String description = input.nextLine();
				System.out.println();
				myShelter.admitPet(new RoboCat(petName, 25, 25, 25, 25, description));
			}
			else
			{
				System.out.println("Thanks for caring for our pets!");
			}	
		}
		
		if(choice.equalsIgnoreCase("Adopt"))
		{
			while(!myShelter.getAllPets().isEmpty())
			{
			System.out.println("Enter the name of the pet you would like to adopt?");
			myShelter.showAllPets();
			String petName = input.nextLine();
			System.out.println("Congratulations! You have chosen to adopt " + petName + "!");
			System.out.println("Enjoy!");
			System.out.println();
			myShelter.releasePet(myShelter.findPet(petName));
			if(myShelter.getAllPets().isEmpty())
			{
				System.out.println("sorry we don't have any pets");
			}
			break;
			}
			System.out.println();
		}
		
		if(choice.equalsIgnoreCase("Display"))
		{
			myShelter.displayPetStats();
		}
		
		if(choice.equalsIgnoreCase("Play"))
		{
			myShelter.playWithAllPets();
			System.out.println();
			System.out.println("You chose to play with the pets!");
		}
		
		if(choice.equalsIgnoreCase("Walk"))
		{
			myShelter.walkDogs();
			System.out.println("It took a while but you have walked all of the dogs!");
			System.out.println("Thank you");
		}
		
		if(choice.equalsIgnoreCase("Organic"))
		{
			do
			{
				System.out.println();
				myShelter.organicPetStats();
				System.out.println();
				System.out.println("Type \"Feed\" to give the Organic Pets food");
				System.out.println("Type \"Water\" to give the Organic Pets water");
				System.out.println("Type \"Clean\" to clean the Dog cages");
				System.out.println("Type \"Empty\" to empty the litter boxes");
				System.out.println("Type \"Back\" to go back to main page");
				System.out.println();
				myShelter.tickAllPets();
				choice = input.nextLine();
				
				if(choice.equalsIgnoreCase("Feed"))
				{
					System.out.println("You chose to feed pets");
					myShelter.feedAllOrganic();
					myShelter.tickAllPets();
				}
				else if (choice.equalsIgnoreCase("Water"))
				{
					System.out.println("You chose to water pets");
					myShelter.waterAllOrganic();
					myShelter.tickAllPets();
				}
				else if (choice.equalsIgnoreCase("Clean"))
				{
					System.out.println("You chose to clean the dog cages...gross");
					myShelter.cleanDogCages();
				}
				else if (choice.equalsIgnoreCase("Empty"))
				{
					System.out.println("You're emptying the litter boxes. Thanks!");
					myShelter.emptyLitterBoxes();
					myShelter.tickAllPets();
				}
				else 
				{
					System.out.println("Thanks for caring for our pets!");
				}
				
			}
			while (!choice.equalsIgnoreCase("Back"));
		}
		
		if(choice.equalsIgnoreCase("Robot"))
		{
			System.out.println("You oiled the robots!");
		}
		
		if(choice.equalsIgnoreCase("Exit"))
		{
			System.out.println("Enjoy life!");
			System.exit(0);
		}
		
		System.out.println();
		System.out.println("Our current pets are: ");
		myShelter.showAllPets();
	}
	while(!choice.equals("exit"));
	}
}