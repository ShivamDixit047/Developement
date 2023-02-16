// hello+your name Program
import java.util.Scanner;
class Problem1{
	public static void main(String[] args) {
		String start="hello";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		System.out.println(start+"\n"+name);
	}
}