package guvi;

import java.util.Scanner;

public class Nine {
	public static void main(String args[]){
		int a,b,i,sum=0;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		b=in.nextInt();
		int c[]=new int[a];
		for(i=0;i<a;i++){
			c[i]=in.nextInt();
		}
		for(i=0;i<b;i++){
			sum=sum+c[i];
	}
		System.out.print(sum);
}
}