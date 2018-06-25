package computer;

public class ComputerApp {

	public static void main(String[] args) {
		
		Computer dansLaptop = new Computer("Asus", "Pro", 900.00, 100);
		Computer taisLaptop = new Computer("Microsoft", "Surface", 900.00, 100);
		Computer wcciLaptop = new Computer("Dell", "Lattitude", 350.00, 100);
		
		System.out.println(dansLaptop.toString());
		System.out.println("The brand of Dan's laptop is " + dansLaptop.getBrand() + ".");
		System.out.println(dansLaptop.download());
		System.out.println("Memory is now: " + dansLaptop.getMemorySpace());
		
		System.out.println(taisLaptop);
		System.out.println("The brand of Tai's laptop is " + taisLaptop.getBrand() + ".");
		taisLaptop.download();
		taisLaptop.download();
		System.out.println("Memory is now : " + taisLaptop.getMemorySpace());
		
		System.out.println(wcciLaptop);
		System.out.println("The brand of wcci's laptop is " + wcciLaptop.getMemorySpace() + ".");
		wcciLaptop.download();
		wcciLaptop.download();
		wcciLaptop.download();
		System.out.println("Memory is now: " + wcciLaptop.getMemorySpace());
	}

}
