package guvi;
import java.util.Arrays;
import java.util.Scanner;
public class Median {
	public static void main(String args[]){
		int a,c=0;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		int b[]=new int[a];
		for(int i=0;i<a;i++){
			b[i]=in.nextInt();
		}
		c=a/2;
		Arrays.sort(b);
			System.out.println(b[c]);	
	}
}
