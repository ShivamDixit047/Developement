// table upto 10 of inputed number
import java.util.Scanner;
class Problem7{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		System.out.println("Table upto 10 is:");
		for (int i = 1;i <= 10 ;i++) {
			System.out.println(num+" x "+i+" = "+num*i);
		}
	}
}