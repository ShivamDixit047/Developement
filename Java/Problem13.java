import java.util.Scanner;
class Problem13{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Width of a rectangle: ");
		float Width = sc.nextFloat();
		System.out.print("Enter the Height of a rectangle: ");
		float Height = sc.nextFloat();
		System.out.println("Area is "+Width+" * "+Height+" = "+Width*Height);
		System.out.println("Perimeter is 2 * ("+Width+" + "+Height+") = "+2*(Width+Height));
	}
}