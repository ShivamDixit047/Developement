import java.util.Scanner;
class Problem20{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter decimal number: ");
		int decimal = sc.nextInt();
		// Decimal to hexcadecimal
		int temp = decimal;
		char arr[] = {'A','B','C','D','E','F'};
		String hexcadecimal = "";
		while (temp>0) {
			int rem = temp % 16;
			if (rem > 9) {
				rem = rem - 10;
				hexcadecimal = arr[rem] + hexcadecimal;
			} else {
				hexcadecimal = rem + hexcadecimal;
			}
			temp/=16;
		}
		System.out.printf("hexcadecimal of %d is %s.",decimal, hexcadecimal);
	}
}