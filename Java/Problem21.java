import java.util.Scanner;
class Problem21{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter decimal number: ");
		int decimal = sc.nextInt();
		// Decimal to octal
		int temp = decimal;
		String octal = "";
		while (temp>0) {
			octal = temp % 8 + octal;
			temp/=8;
		}
		System.out.printf("octal of %d is %s.",decimal, octal);
	}
}