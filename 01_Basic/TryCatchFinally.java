import java.util.Scanner;

public class TryCatchFinally {

	public static void main(String[] args) {
		Scanner scanner = null;
		System.out.println("before try");

		try { //try (Scanner scanner = new Scanner)
			System.out.println("in try"); // sysout
			// throw new RuntimeException("in try");
			// return;
			// System.exit(0);
			scanner = new Scanner(System.in);
		} catch (Exception e) {
			System.out.println("in catch");
			// throw new RuntimeException("in catch");
			// return;
		} finally {
			System.out.println("in finally");
			// throw new RuntimeException("in finally");
			// return;
			if (scanner != null) {
				scanner.close();
			}
		}
		System.out.println("after finally");
	}

}
