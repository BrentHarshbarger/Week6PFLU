
public class ONThree {

	public static void main(String[] args) {
		// Lewis University - Programming Foundations Lab 6 Exercise 1
		// Brent Harshbarger

		// (n) is the input of the algorithm
		ONThree.Xyz(1);   

	}

	public static void Xyz(int n) {

		// The x, y, z creates an O(n^3) algorithm. 
		
		for (int x = 0; x <= n; x++) {

			for (int y = 0; y <= n; y++) {

				for (int z = 0; z <= n; z++) {

					System.out.println("x = " + x + ", y = " + y + ", z = " + z);

				}
			}

		}

	}

}
