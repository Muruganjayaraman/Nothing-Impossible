package guvi;

import java.util.Scanner;

public class BetOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,i;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		b=in.nextInt();
		if(a<=10000 && b<=10000)
		for(i=a;i<b;i++){
			if(i%2!=0){
				System.out.println(i);
			}
		}
	}

}
