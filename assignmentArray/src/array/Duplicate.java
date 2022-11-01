package array;

public class Duplicate {
	/*WAP to find duplicate numbers and there counting from list of numbers.*/
	static int countn = 0;

	public static void main(String[] args) {

		int a[] = { 10,20,40,10,50,20,44,55 };

		for (int i = 0; i < a.length; i++) {
			int count = 1;
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] == a[j] && j < i) {
					break;
				}

				if (a[i] == a[j]) {
					count++;
					countn++;
				}

			}

			if (count > 1) {
				System.out.println("duplicate number: "+a[i] + " and is repeating " + count + " times ");

			}

		}

	}
	
}
