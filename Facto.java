package guvi;

import java.util.Scanner;

public class Facto {
	public static void main(String args[]){
		int a,i,fact=1;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		if(a<=20){
		for(i=1;i<=a;i++){
			fact=fact*i;
		}
		System.out.println(fact);
	}
	}
}
