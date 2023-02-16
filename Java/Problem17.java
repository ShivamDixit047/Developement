import java.util.Scanner;
class Problem17{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first Binary number: ");
		int bin1 = sc.nextInt();
		System.out.print("Enter second Binary number: ");
		int bin2 = sc.nextInt();
		String bin = "";
		int temp1 = bin1;
		int temp2 = bin2;
		int x = 0, rem1, rem2;
		while (temp1>0 && temp2>0) {
			rem1=temp1%10;
			rem2=temp2%10;
			if(rem1+rem2+x==2){
				bin="0"+bin;
				x=1;
			} else if (rem1+rem2+x==3) {
				bin="1"+bin;
				x=1;
			} else if (rem1+rem2+x==1) {
				bin="1"+bin;
				x=0;
			} else {
				bin="0"+bin;
				x=0;
			}
			temp1/=10;
			temp2/=10;
			if(temp1+temp2==0 && x==1) {
				bin="1"+bin;
			}
			if ((temp1==1 && temp2==0) || (temp1==0 && temp2==1)) {
				if(x==1) {
					bin="10"+bin;
				} else {
					bin="1"+bin;
				}
			}
		}
		System.out.printf("Addition of binary numbers %d and %d is %s",bin1, bin2, bin);
	}
}