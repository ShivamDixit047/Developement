import java.lang.Math;
import java.util.Scanner;
class Problem11{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radiur of circle: ");
		float radius = sc.nextFloat();
		System.out.println("The area of circle is = πr\u00b2 = "+Math.PI*radius*radius);
		System.out.println("The perimeter of circle is = 2πr = "+2*Math.PI*radius);
	}
}