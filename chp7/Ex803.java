public class Ex803 {

	public static void main(String[] args) {
		Car sf = new Car(); 
		EvCar x = new EvCar();
		
		// Drive Santa fe
		sf.printDetails();
		
		for (int i = 0; i < 6; i++) {
			sf.drive();
		}
		System.out.println("You have " + sf.gettank() + "L of oil left.");
		System.out.println("You drove " + sf.getkm() + "km");
		
		x.printDetails();
		for (int i = 0; i < 10; i++) {
			if(x.getCharge() <= 10) {
				x.charge();
			}
			x.drive();
		}
		System.out.println("You have " + x.gettank() + "L of oil left.");
		System.out.println("You have " + x.getCharge() + "% battery left.");
		System.out.println("You drove " + x.getkm() + "km");
		
	}

}
