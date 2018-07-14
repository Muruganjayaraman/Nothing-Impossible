package guvi;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,i,count=0;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		if(a<=1000){
		for(i=2;i<a;i++){
				if(a%i==0){
					count++;
			}
		}
		if(count==0){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}
		}
	}

}
