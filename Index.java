package guvi;

import java.util.Scanner;

public class Index {
	public static void main(String args[]){
		int a,index=0;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		int b[]=new int[a];
		for(int i=0;i<a;i++){
			b[i]=in.nextInt();
		}
		for(int c:b){
			System.out.println((index++)+" "+c);
		}
	}

}
