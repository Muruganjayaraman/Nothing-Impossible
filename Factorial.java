package guvi;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,i,fact=1;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		for(i=1;i<=a;i++){
			fact=fact*i;
		}
		System.out.println(fact);
		
	}
}
