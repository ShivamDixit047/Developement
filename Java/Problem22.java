import java.lang.Math;
import java.util.Scanner;
class Problem22{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter binary number: ");
		int binary = sc.nextInt();
		// Binary to decimal
		int temp = binary;
		int exp = -1;
		int rem = 0;
		int decimal = 0;
		while (temp>0) {
			rem = temp % 10;
			if (rem > 1) {
				break;
			}
			if(temp % 10 == 0) {
				temp/=10;
				exp++;
				continue;
			}
			exp++;
			decimal+=Math.pow(2,exp);
			temp/=10;
		}
		if (rem < 2)
			System.out.printf("decimal of %d is %d.",binary, decimal);
		else
			System.out.println("You did not Entered a binary number.");
	}
}