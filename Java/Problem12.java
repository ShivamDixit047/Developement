import java.util.Scanner;
class Problem12{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		float num1 = sc.nextFloat();
		System.out.print("Enter the second number: ");
		float num2 = sc.nextFloat();
		System.out.print("Enter the third number: ");
		float num3 = sc.nextFloat();
		System.out.println("The average of "+num1+", "+num2+" and "+num3+" is "+(num1+num2+num3)/3+".");
	}
}