import java.util.Scanner;

public class CountInteger {
	public static void main(String args[]){
		int a,count=0,b;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		while(a!=0){
			b=a%10;
			count++;
			a/=10;
		}
		System.out.println(count);
	}

}
