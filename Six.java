package guvi;

import java.util.Scanner;

public class Six {
	public static void main(String args[]){
		int a;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		if(a%4==0){
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}
