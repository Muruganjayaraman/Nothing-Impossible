package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,num=0,temp,b;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		temp=a;
		while(a!=0){
			b=a%10;
			num=(num*10)+b;
			a/=10;
		}
		if(temp==num){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
			
	}

}
