import java.util.Scanner;

public class Swap {
	public static void main(String args[]){
		int a,b;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		b=in.nextInt();
		if(a<=100000 && b<=100000){
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+" "+b);
	}
	}
}
