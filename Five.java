package guvi;

import java.util.Scanner;

public class Five {
	public static void main(String args[]){
		int a,b,c;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		if(a>=b&&a>=c){
			System.out.println(a);
		}
		if(b>=a&&b>=c){
			System.out.println(b);
		}
		if(c>=a&&c>=b){
			System.out.println(c);
		}
	}
}
