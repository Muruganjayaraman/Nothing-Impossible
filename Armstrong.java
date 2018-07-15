package guvi;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,total=0,temp;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		temp=a;
		if(a<=10000){
		while(a!=0){
			b=a%10;
			total=total+b*b*b;
			a=a/10;
		
		}
		if(temp==total){
		System.out.println("yes");
		}
		else{
			System.out.println("no");
		}
	}
	}
}
