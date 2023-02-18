import java.util.Scanner;
class Problem18{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first binary number: ");
		int bin1 = sc.nextInt();
		System.out.print("Enter second binary number: ");
		int bin2 = sc.nextInt();
		System.out.println("The binary product of "+bin1+" and "+bin2+" is "+multiplication(bin1, bin2)/*function calling*/+".");
	}	
	public static int BinaryProduct(int binary1, int binary2){
		int i = 0, remainder = 0;
		int[] sum = new int[20];// Array declaration with it's size
		int binary_product = 0;
		while(binary1 != 0 || binary2 != 0){
			sum[i++] = (binary1 % 10 + binary2 % 10 + remainder) % 2;
			remainder = (binary1 % 10 + binary2 % 10 + remainder) / 2;
			binary1 /= 10;
			binary2 /= 10;
		}
		if (remainder != 0) {
			sum[i++] = remainder;
		}
		--i;
		while(i >= 0)
			binary_product = binary_product * 10 + sum[i--];
		return binary_product;
	}
	public static int multiplication(int binary1, int binary2){
		int multiply = 0, factor = 1;
		while (binary2 != 0) {
			int digit = binary2 % 10;
			if (digit == 1) {
				binary1 *= factor;
				multiply = BinaryProduct(binary1, multiply);//function calling
			}
			else
				binary1 *= factor;// inside else
			binary2 /= 10;// outside else
			factor = 10;
		}
		return multiply;
	}
}