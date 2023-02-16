import java.util.Scanner;
class Problem19{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter decimal number: ");
		int decimal = sc.nextInt();
		// Decimal to binary
		int temp = decimal;
		String binary = "";
		while (temp>0) {
			if (temp % 2 == 0) {
				binary = "0" + binary;
			} else {
				binary = "1" + binary;
			}
			temp/=2;
		}
		System.out.printf("Binary of %d is %s.",decimal, binary);
	}
}