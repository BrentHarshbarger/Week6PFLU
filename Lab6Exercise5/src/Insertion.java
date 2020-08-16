
public class Insertion {

	public static void main(String[] args) {
		// Lewis University - Programming Foundations Lab 6 Exercise 5
		// Brent Harshbarger

		int[] a = { 1, 29, 14, 15, 94 };

		System.out.println("Before Selection Sort:");
		for (int i : a) {
			System.out.print(i + " ");
		}
		SelectionSort(a);
		System.out.println();
		System.out.println("After Selection Sort");
		for(int i:a) {
			System.out.print(i+" ");
		}

	}

	public static void SelectionSort(int[] a) {
		int i = 0;
		for (i = 0; i < a.length - 1; i++) {
			int index = i;

			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[index]) {
					index = j;

				}

			}
			int smallerNumber = a[index];
			a[index] = a[i];
			a[i] = smallerNumber;

		}
	}

}
