package Assignment5;
import java.util.Date;

	public abstract class medicine {
		double price;
		Date expiryDate;

		public medicine() {
			super();

			// TODO Auto-generated constructor stub
		}

		public medicine(double price, Date expiryDate) {
			super();
			this.price = price;
			this.expiryDate = expiryDate;
		}

		public void getDetails() {
			System.out.println("Price = " + price + " Expiry Date = " + expiryDate);
		}

		public abstract void displayLabel();

	}

	

