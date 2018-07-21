import java.util.Scanner;

public class SwapBitwise {
	public static void main(String args[]){
		int a,b;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		b=in.nextInt();
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println(a+" "+b);
	}

}
