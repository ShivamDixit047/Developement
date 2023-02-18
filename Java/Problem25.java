import java.util.Scanner;
class Problem25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an octal number: ");
		int octal = sc.nextInt();
		int decimal=0, exp = 0, temp = octal; // If don't wanna print octal in answere just use original octal number in place of temp
		while (temp>0) {
			int remainder = temp % 10;
			decimal += (remainder*Math.pow(8,exp));
			exp++;
			temp/=10;
		}
		System.out.printf("The decimal of octal number %d is %d.",octal, decimal);
	}
}