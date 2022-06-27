import java.util.Scanner;
public class prime {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		// Declare the variables
		int a, b, i, j, flag;

	
		System.out.printf("Enter lower bound of the interval: ");
		a = 1; // Take input

	
		System.out.printf("\nEnter upper bound of the interval: ");
		b = 100; // Take input

		System.out.printf("\nPrime numbers between %d and %d are: ", a, b);

		for (i = a; i <= b; i++) {

			if (i == 1 || i == 0)
				continue;

			// flag variable to tell
			// if i is prime or not
			flag = 1;

			for (j = 2; j <= i / 2; ++j) {
				if (i % j == 0) {
					flag = 0;
					break;
				}
			}

			// flag = 1 means i is prime
			// and flag = 0 means i is not prime
			if (flag == 1)
				System.out.println(i);
		}
	}
}
