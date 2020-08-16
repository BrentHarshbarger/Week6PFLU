
public class TimeComplexityThree {

	public static void main(String[] args) {
		// Lewis University - Programming Foundations Lab 6 Exercise 3
		// Brent Harshbarger

		TimeComplexityThree.bar(1);
	}

	// The code of this method is an O(n)
	public static int bar(int N) {
		int result = 1;
		for (int i = 1; i < N; i *= 2) {
			result += 2;
		}
		return result;
	}

}
