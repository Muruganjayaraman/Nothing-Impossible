package guvi;

import java.util.Scanner;
public class guvi2 {
	public static void main(String args[]){
		String a;
		int sum=0;
		Scanner in=new Scanner(System.in);
		a=in.nextLine();
		String b[]=a.split(" ");
		for(int i=0;i<b.length;i++){
			sum=sum+b[i].length();
		}
		System.out.println(sum);
		
	}

}
