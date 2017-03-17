import java.util.*;

public class RomanToInt {

	public static void main(String[] args) {
		RomanToInt rTi = new RomanToInt();
		NumbersToStars stars = new NumbersToStars();
		System.out.println("print U Int number, convert to Roman:");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		stars.print(number);
		System.out.println(number + " = " + rTi.intToRoman(number));
		System.out.println("print U Roman number, convert to Int:");
		String strRoman = scan.next();
		System.out.println(strRoman + " = " + rTi.romanToInt(strRoman));
	}

	public String intToRoman(int number) { // ispol'zovat' StringBuilder
		String str = "";
		for (; number >= 100;) {
			str = str + "C";
			number = number - 100;
		}
		if (number > 90) {
			str = str + "XC";
			number = number - 90;
		}
		for (; number >= 50;) {
			str = str + "L";
			number = number - 50;
		}
		if (number > 40) {
			str = str + "XL";
			number = number - 40;
		}
		for (; number >= 10;) {
			str = str + "X";
			number = number - 10;
		}
		if (number == 9) {
			str = str + "IX";
			number = number - 9;
		}
		for (; number >= 5;) {
			str = str + "V";
			number = number - 5;
		}
		if (number == 4) {
			str = str + "IV";
			number = number - 4;
		}
		for (; number >= 1;) {
			str = str + "I";
			number = number - 1;
		}
		return str;
	}

	public int romanToInt(String str) {
		int number = 0;
		char[] myCharArray = str.toCharArray();
		for (int i = myCharArray.length - 1; i >= 0; i--) {
			if (myCharArray[i] == 'I') {
				number = number + 1;
			}
			if (myCharArray[i] == 'V') {
				number = number + 5;
			}
			if (myCharArray[i] == 'X') {
				number = number + 10;
			}
			if (myCharArray[i] == 'L') {
				number = number + 50;
			}
			if (myCharArray[i] == 'C') {
				number = number + 100;
			}
			if (i - 1 >= 0) {
				if (((myCharArray[i] == 'V')||(myCharArray[i] == 'X')) && (myCharArray[i - 1] == 'I')) {
					number = number - 2;
				}
				if (((myCharArray[i] == 'L')||(myCharArray[i] == 'C')) && (myCharArray[i - 1] == 'X')) {
					number = number - 20;
				}
			}
		}
		return number;
	}
}
