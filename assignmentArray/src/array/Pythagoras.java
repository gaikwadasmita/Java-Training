package array;

public class Pythagoras {
	/*
	 * 4.An Array contain the n numbers you have to find out combination which
	 * satisfy Pythagoras Template. ( Pythagoras templates:- 3*3+4*4==5*5)
	 */
		public static void main(String[] args) {

			int a[] = { 3, 4, 5, 6, 8, 10};

			for (int i = 0; i < a.length - 2; i++) {

				for (int j = i + 1; j < a.length; j++) {

					if ((a[i] * a[i]) + (a[j] * a[j]) == (a[i + 2] * a[i + 2])) {

						System.out.println(a[i] + " " + a[i + 1] + " " + a[i + 2] + " satisafies pythgoras theoram");

					}
					/*Scanner sc = new Scanner(System.in);
			        double side1, side2, hypotenuse;
			        System.out.print("Enter a value for Side 1: ");
			        side1 = sc.nextDouble();
			        System.out.print("Enter a value for Side 2: ");
			        side2 = sc.nextDouble();
			        hypotenuse = Math.sqrt((side1 * side1) + (side2 * side2));
			        System.out.println("The length of the hypotenuse is: " + hypotenuse);*/

				}
			}

		}

	}

