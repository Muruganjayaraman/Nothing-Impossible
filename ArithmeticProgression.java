package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class ArithmeticProgression {
	public static void main(String[] args) {
		int a,i,c=0,d=0,sum=0,sum1=0;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		int b[]=new int[a];
		for(i=0;i<a;i++){
			b[i]=in.nextInt();
		}
		for(i=0;i<a;i++){
			for(int j=i+1;j<a;j++){
				if(b[i]==b[j]){
					c++;
					break;
				}
			}
		}
		Arrays.sort(b);
		for(i=1;i<=b[a-1];i++)
		{
		sum=sum+i;
		}
		if(c==0){
			sum1=sum+1;
		}
		else{
			sum1=sum;
		}
		System.out.println(sum1);
	}
}
