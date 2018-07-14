package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=1,n,p;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		p=in.nextInt();
		if(n>=1 && p==0)
		{
			result=1;
		}
		else if(n==0 && p>=1){
			result=0;
		}
		else{
			for(int i=1;i<=p;i++){
				result=result*n;
			}
		}
				System.out.println(result);

	}

}
