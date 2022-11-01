package string;

public class ReapeatedAlphabet {
	/*
	 * WAP to print the number of alphabets repeated in the given string.
	 */

	public static void main(String[] args) {
		String s = "yashtechnologye";
		char[] a = s.toCharArray();
		for (int i = 0; i < a.length; i++) {
			int count = 1;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
				}
			}
			if (count > 1) {
				System.out.print(a[i] + " ");

			}
		}
	}
}

