// All arithmatic operation
import java.util.Scanner;
class Problem6{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter the second number: ");
		int num2 = sc.nextInt();
		System.out.println("Addition = "+(num1+num2));
		System.out.println("Subtaction = "+(num1-num2));
		System.out.println("Product = "+num1*num2);
		System.out.println("Divison = "+num1/num2);
		System.out.println("Modulo = "+num1%num2);

	}
}