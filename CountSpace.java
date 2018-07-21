import java.util.Scanner;

public class CountSpace {
	public static void main(String[] args) {
		String a;
		int count=0;
		Scanner in=new Scanner(System.in);
		a=in.nextLine();
		String b[]=a.split(" ");
		for(String c:b){
			count++;
		}
		System.out.println(count-1);
	}

}
