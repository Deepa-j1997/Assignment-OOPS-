package Assignment5;
import java.util.Random;

public class TestMedicine {
	public static void main(String[] args) {
		Random rand = new Random();
		medicine arr[] = new medicine[5];
		arr[0] = new Tablet();

	
		arr[1] = new Ointment();
		arr[2] = new Syrup();

		int rand_arr = rand.nextInt(3);

		medicine m = arr[rand_arr];
		m.displayLabel();
		m.getDetails();

	}

}




