package guvi;

import java.util.Scanner;

public class One {
	public static void main(String args[]){
		int a;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		if(a==0)
		{
			System.out.println("zero");
		}
		if(a>0)
			System.out.println("positive");
		else if(a<0)
			System.out.println("negative");
	}

}
