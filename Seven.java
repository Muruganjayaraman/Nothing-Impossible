package guvi;

import java.util.Scanner;

public class Seven {
	public static void main(String args[]){
		int a,sum=0;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		for(int i=1;i<=a;i++){
			sum=sum+i;
		}
		System.out.println(sum);
	}
}
