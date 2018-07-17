package trial;

import java.util.Scanner;

public class Multi {
	public static void main(String[] args) {
		int a,i,sum=1;
		Scanner in=new  Scanner(System.in);
		a=in.nextInt();
		for(i=1;i<=5;i++){
			sum=a*i;
			System.out.print(sum+" ");
		}
	}
	}
