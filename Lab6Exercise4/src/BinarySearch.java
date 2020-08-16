
public class BinarySearch {

	public static void main(String[] args) {
		// Lewis University - Programming Foundations Lab 6 Exercise 4
		// Brent Harshbarger

		int[] a = { 1, 14, 15, 24, 55, 59, 73, 90, 99 };
		int target = 73;

		linearSearch(a, target);
	
		System.out.println(target + " is at index " + binarySearch(a, target));

	}

	// Linear search
	public static int linearSearch(int[] a, int t) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == t) {
				return i;
			}
		}
		return -1;
	}

	// Iterative implementation of binary search
	public static int binarySearch(int[] a, int t) {
		int left = 0;
		int right = a.length - 1;
		int middle;

		while (left <= right) {
			middle = (left + right) / 2;
			System.out.println("Left: " + left + ", Middle: " + middle + ", Right: " + right);
			if (t == a[middle])
				return middle;
			else if (t < a[middle])
				right = middle - 1;
			else
				left = middle + 1;

		}

		return -1;
	}

}
