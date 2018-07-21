package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class Min {
	public static void main(String args[]){
	int a;
	Scanner in=new Scanner(System.in);
	a=in.nextInt();
	int b[]=new int[a];
	for(int i=0;i<a;i++){
		 b[i]=in.nextInt();
	}
		 Arrays.sort(b);
		 System.out.print(b[0]);
	}
}
