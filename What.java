// this program shows wether or not input number is divisible by 3, 9, both, or neither
import java.util.Scanner;

public class What {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int num = input.nextInt();
		int sumOfDigits = 0;
		input.close();

		do {
			sumOfDigits += num % 10;
			num = num / 10;
		} while (num > 0);

		if (sumOfDigits % 9 == 0)
			System.out.print("This number is divisible by 3 and 9");
		else if (sumOfDigits % 3 == 0)
			System.out.print("This number is divisible by 3 ONLY");
		else
			System.out.print("This number is NOT divisible by 3 NOR 9");
	}
}

// franyatta