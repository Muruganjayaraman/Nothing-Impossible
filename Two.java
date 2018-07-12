package guvi;

import java.util.Scanner;

public class Two {
	public static void main(String args[]){
		int a;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		if(a<=10000){
		if(a%2==0){
			System.out.println("Even");
		}
		else{
			System.out.println("Odd");
		}
		}
		else{
			System.out.println("Invalid");
		}
	}

}
