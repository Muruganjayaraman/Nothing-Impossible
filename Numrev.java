package guvi;

import java.util.Scanner;

public class Numrev {
	public static void main(String args[]){
		int a;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		String b=Integer.toString(a);
		StringBuilder c=new StringBuilder(b);
		c.reverse();
		System.out.println(c);
	}
}
