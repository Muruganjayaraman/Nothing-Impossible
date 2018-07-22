import java.util.Scanner;

public class Three {
	public static void main(String args[]){
		int a,b,sum=0;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		while(a!=0){
			b=a%10;
			sum=sum+b;
			a/=10;
		}
		System.out.println(sum);
	}

}
