package shelterAmok;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class ShelterTest 
{
	Shelter myShelter;
	Dog BonIver;
	Cat Ivy;
	RoboDog Courage;
	RoboCat Felix;
	
	@Before
	public void setUp()
	{
		myShelter = new Shelter();
		BonIver = new Dog("Bon Iver", 25, 25, 25, 25, 25, 25, "He loves indie folk music");
		Ivy = new Cat("Ivy", 25, 25, 25, 25, 25, 25, "She loves to eat Plants" );
		Courage = new RoboDog("Courage", 25, 25, 25, 25, "He is a very cowardly dog");
		Felix = new RoboCat("Felix", 25, 25, 25, 25, "He is simple and sensible");
	}
	
	@Test
	public void shelterShouldBeAbleToAcceptNewPets()
	{
		myShelter.admitPet(Courage);
		Pet foundRoboDog = myShelter.findPet(Courage.getName());
		assertThat(foundRoboDog, is(Courage));
		
	}
	
	@Test
	public void shelterShouldBeAbleToAcceptTwoNewPets()
	{
		myShelter.admitPet(Courage);
		myShelter.admitPet(Ivy);
		Pet foundRoboDog = myShelter.findPet(Courage.getName());
		Pet foundCat = myShelter.findPet(Ivy.getName());
		assertThat(foundRoboDog, is(Courage));
		assertThat(foundCat, is(Ivy));
	}
	
	@Test
	public void shelterShouldAcceptACollectionOfPets()
	{
		myShelter.admitPet(Felix);
		myShelter.admitPet(BonIver);
		Collection<Pet> admittedPets = myShelter.getAllPets();
		assertThat(admittedPets.size(), is(2));
	}
	
	@Test
	public void shelterShouldBeAbleToReleaseAPet()
	{
		myShelter.admitPet(BonIver);
		myShelter.admitPet(Courage);
		myShelter.releasePet(Courage);
		Collection<Pet> admittedPets = myShelter.getAllPets();
		assertThat(admittedPets.size(), is(1));
	}
	
	@Test
	public void shelterShouldBeAbleToReleaseAPetAndShowTwoAdmittedPets()
	{
		myShelter.admitPet(BonIver);
		myShelter.admitPet(Ivy);
		myShelter.admitPet(Courage);
		myShelter.releasePet(Courage);
		Collection<Pet> admittedPets = myShelter.getAllPets();
		assertThat(admittedPets.size(), is(2));
	}
	
}
