package guvi;

import java.util.Scanner;

public class BetPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,count=0,b;
		int i,j;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		b=in.nextInt();
		if(a<=1000 && b<=1000){
		for(i=a;i<=b;i++){
			for(j=2;j<i;j++){
				if(i%j==0){
					count=0;
					break;
				}
				else{
					count=1;
				}
			}
		if(count==1){
			System.out.println(i);
			}
		}
		
	}
	}
}
