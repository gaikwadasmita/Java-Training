package string;

public class Garbage {
		public static void main(String[] args) {
			System.out.println("Finalizedemo.main() starts");
			String s = new String("asmita");

			s = null;
			System.gc();
			System.out.println("Finalizedemo.main() ends");

		}

		public void finalize() {
			System.out.println("Finalizedemo.finalize() called");
		}
	}

