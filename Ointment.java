package Assignment5;

import java.util.Date;

public class Ointment extends medicine {
	public Ointment() {
		super();
		price = 300;
		expiryDate = new Date();

		// TODO Auto-generated constructor stub
	}

	public Ointment(double price, Date expiryDate) {
		super(price, expiryDate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void displayLabel() {
		// TODO Auto-generated method stub
		System.out.println("Ointment" + "\n" + "For external use only");
	}

}



