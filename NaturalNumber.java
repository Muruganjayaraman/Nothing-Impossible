import java.util.Scanner;

public class NaturalNumber {
	public static void main(String args[]){
		int a,sum=0;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		if(a<=100000){
		for(int i=1;i<=a;i++){
			sum=sum+i;
		}
		System.out.println(sum);
	}
	}
}
