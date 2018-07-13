package guvi;

import java.util.Scanner;

public class Reverse {
	public static void main(String args[]){
		String a;
		Scanner in=new Scanner(System.in);
		a=in.next();
		StringBuilder b=new StringBuilder(a);
		b.reverse();
		System.out.println(b);
		
	}

}
