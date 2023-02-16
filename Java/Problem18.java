import java.util.Scanner;
class Problem18{
	public static void main(String[] args) {
		Scanner sc = new Scanner();
		System.out.print("Enter first binary number: ");
		int bin1 = sc.nextInt();
		System.out.print("Enter second binary number: ");
		int bin2 = sc.nextInt();
		int temp1 = bin1;
		while (temp1 > 0) {
			int rem1 = temp1%10;
			int temp2 = bin2;
			while (temp2>0) {
				int rem2 = temp2%10;
				if (rem1==1 && rem2==1) {
					
				}
			}
		}		
	}
}