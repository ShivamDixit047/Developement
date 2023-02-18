import java.util.Scanner;
class Problem24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter binary number: ");
		int binary = sc.nextInt();
		// Binary to octal
		int temp = binary;
		int exp = -1;
		int rem = 0;
		int octal = 0;
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
			octal+=Math.pow(8,exp);
			temp/=10;
		}
		if (rem < 2)
			System.out.printf("octal of %d is %d.",binary, octal);
		else
			System.out.println("You did not Entered a binary number.");
			
	}	
}