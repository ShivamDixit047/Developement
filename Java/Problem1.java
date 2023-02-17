// hello+your name Program
import java.util.Scanner;
//Every time Use Scanner to get input 

class Problem1{
	public static void main(String[] args) {
		String start="hello";
		Scanner sc = new Scanner(System.in);//Here we create an object sc
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		System.out.println(start+"\n"+name);
	}
}