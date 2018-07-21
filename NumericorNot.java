package guvi;

import java.util.Scanner;

public class NumericorNot {
	public static void main(String args[]){
		String a;
		int c=0;
		Scanner in=new Scanner(System.in);
		a=in.next();
		char b;
		for(int i=0;i<a.length();i++){
		b=a.charAt(i);
		if(b>=48 && b<=57){
			c++;
		}
		}
		if(c==a.length()){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}
		}
	}



