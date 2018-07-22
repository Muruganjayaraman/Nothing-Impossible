import java.util.Scanner;

public class ProductEvenorOdd {
	public static void main(String args[]){
		int a,b,c;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		b=in.nextInt();
		c=a*b;
		if(c%2==0){
			System.out.println("Even");
		}
		else{
			System.out.println("Odd");
		}
	}

}
