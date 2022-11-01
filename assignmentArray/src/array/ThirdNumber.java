package array;
/*WAP to find third maximum number from list of numbers.
 */
public class ThirdNumber {
	public static void main(String[] args) {

		int a[] = { 10,30,500,600,7,31};

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}
			System.out.println("sort array:"+a[i]);
		}
		
		System.out.print("Thid Highest Number of Array is =" + a[a.length - 3]);
	}
}

