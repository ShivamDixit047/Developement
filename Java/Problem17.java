import java.util.Scanner;
class Problem17{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first Binary number: ");
		int bin1 = sc.nextInt();
		System.out.print("Enter second Binary number: ");
		int bin2 = sc.nextInt();
		String bin = "";
		int temp_bin1 = bin1;
		int temp_bin2 = bin2;
		int carry = 0, rem1, rem2;

		// Condition to check that both binary numbers are available
		while (temp_bin1>0 && temp_bin2>0) {
			rem1=temp_bin1%10;// last digit of first binary no.
			rem2=temp_bin2%10;// last digit of second binary no.
			if(rem1+rem2+carry==2){// Condition fulfills when both remainder are 1
				bin="0"+bin;// in binary 1+1=0 with carry 1 hence add 0 at start of string
				carry=1;//set carry 1 since sum > 1
			} else if (rem1+rem2+carry==3) {//Condition to check that both remainder as well as carry is also 1
				bin="1"+bin;// in binary 1+1+1 = 1 with carry 1 hence add 1 at start of string
				carry=1;//set carry 1 since sum > 1
			} else if (rem1+rem2+carry==1) {//Condition that addition of remainders and carry will not 2
				bin="1"+bin;// in binary 1+0=0+1=1 with carry 0 hence add 1 at start of string
				carry=0;//set carry 0 for necarryt iteration since sum=1
			} else {
				bin="0"+bin;//if both remainders and carry=0 add 0 at the start of string
				carry=0;//set carry 0 since no carry generated
			}
			temp_bin1/=10;
			temp_bin2/=10;

			/* It may possible that both no. become zero but carry has 1*/
			if(temp_bin1+temp_bin2==0 && carry==1) {
				bin="1"+bin;
			}
			// It is possible that one binary no. becomes zero while other has some values
			if ((temp_bin1==1 && temp_bin2==0) || (temp_bin1==0 && temp_bin2==1)) {
				if(carry==1) {// if carry = 1
					bin="10"+bin;// 1+1 = 0 again carry = 1 hence add 10 at start of string
				} else {
					bin="1"+bin;// 1+0 = 1 but carry = 0 hence add 1 at start of string
				}
			}
		}
		System.out.printf("Addition of binary numbers %d and %d is %s",bin1, bin2, bin);
	}
}