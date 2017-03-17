import java.util.Scanner;

public class NumbersToStars {

	public static void main(String[] args) {
		NumbersToStars stars = new NumbersToStars();
		stars.printStars(stars.replaceIntToStars(1234567890));
		System.out.println("print U number:");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		stars.printStars(stars.replaceIntToStars(number));
	}

	private void printStars(String[] arr) {
		for (String str : arr) {
			System.out.println(str.replace('#', '*'));
		}
	}

	private String[] replaceIntToStars(int number) {
		String[] arrayStar = new String[] { "", "", "", "", "" };	//StringBilder!!!!!
		String[] arrayStar1 = new String[] { "", "", "", "", "" };	//StringBilder!!!!!
		if (number == 0) {
			arrayStar = reprentInt(0);
		}
		for (; number > 0;) {
			int c = number % 10;
			arrayStar1 = reprentInt(c);
			for (int i = 0; i < arrayStar.length; i++) {
				arrayStar[i] = arrayStar1[i].toString() + arrayStar[i].toString();  //StringBilder!!!!!
			}
			number = number / 10;
		}
		return arrayStar;
	}

	private String[] reprentInt(int c) {
		String[] arrayStar1;
		switch (c) {
		case 0:
			arrayStar1 = new String[] { " #  ", "# # ", "# # ", "# # ", " #  " };
			break;
		case 1:
			arrayStar1 = new String[] { " #  ", "##  ", " #  ", " #  ", "### " };
			break;
		case 2:
			arrayStar1 = new String[] { "##  ", "  # ", " #  ", "#   ", "### " };
			break;
		case 3:
			arrayStar1 = new String[] { "##  ", "  # ", " #  ", "  # ", "##  " };
			break;
		case 4:
			arrayStar1 = new String[] { "# # ", "# # ", " ## ", "  # ", "  # " };
			break;
		case 5:
			arrayStar1 = new String[] { "### ", "#   ", "##  ", "  # ", "##  " };
			break;
		case 6:
			arrayStar1 = new String[] { " ## ", "#   ", "##  ", "# # ", "##  " };
			break;
		case 7:
			arrayStar1 = new String[] { "### ", "  # ", " #  ", "#   ", "#   " };
			break;
		case 8:
			arrayStar1 = new String[] { " #  ", "# # ", " #  ", "# # ", " #  " };
			break;
		case 9:
			arrayStar1 = new String[] { " ## ", "# # ", " ## ", "  # ", "##  " };
			break;
		default:
			arrayStar1 = new String[] { "", "", "", "", "" };
			break;
		}
		return arrayStar1;
	}

	public void print(int number) {
		printStars(replaceIntToStars(number));
		
	}
}
