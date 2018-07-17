package trial;

import java.util.Scanner;

public class BetArm {
	public static void main(String[] args) {
		int low, high;
		Scanner in=new Scanner(System.in);
		low=in.nextInt();
		high=in.nextInt();

        for(int number = low + 1; number < high; ++number) {
            int digits = 0;
            int result = 0;
            int originalNumber = number;

            // number of digits calculation
            while (originalNumber != 0) {
                originalNumber /= 10;
                ++digits;
            }

            originalNumber = number;

            // result contains sum of nth power of its digits
            while (originalNumber != 0) {
                int remainder = originalNumber % 10;
                result += Math.pow(remainder, digits);
                originalNumber /= 10;
            }

            if (result == number)
                System.out.print(number + " ");
        }
	}

}
