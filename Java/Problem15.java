/* This program requires Compilation then it can be executed*/
import java.util.Scanner;
//You can also create a swap function so it can be executed directly through java
class Swap{
	int num1;
	int num2;
	void setdata(int a, int b){
		num1 = a;
		num2 = b;
	}
	void swap() {
		int temp = num1;
		num1 = num2;
		num2 = temp;
	}
}
class Problem15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter variable 1: ");
		int num1 = sc.nextInt();
		System.out.print("Enter variable 2: ");
		int num2 = sc.nextInt();
		Swap swaping = new Swap();
		swaping.setdata(num1, num2);
		swaping.swap();
		System.out.println("After Swapping variable 1 = "+swaping.num1+" and variable 2 = "+swaping.num2 );
	}
}