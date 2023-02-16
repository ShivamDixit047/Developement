// Sum of two numbers
import java.util.Scanner;
class Problem2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter the second number: ");
		int num2 = sc.nextInt();
		System.out.println("Sum of "+num1+" and "+num2+" is = "+(num1+num2));
	}
}