package guvi;

import java.util.Scanner;

public class BetEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,i;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		b=in.nextInt();
		int c=a+1;
		for(i=c;i<b;i++){
			if(i%2==0){
				System.out.print(i+" ");
			}
		}
	}

}
