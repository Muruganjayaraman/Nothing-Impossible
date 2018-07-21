import java.util.Arrays;
import java.util.Scanner;

public class UniqueorNot {
	public static void main(String[] args) {
		int i,a,temp,j,c=0;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		int b[]=new int[a];
		for(i=0;i<a;i++){
			b[i]=in.nextInt();
		}
		Arrays.sort(b);
		for(i=0;i<a;i++){
			for(j=i+1;j<a;j++){
			if(b[i]==b[j]){
				b[j]=0;
				c++;
			}
		}
	}
		if(c==0){
			System.out.println("No Unique");
		}
		else{
	   for(i=0;i<a;i++){
		if(b[i]!=0){
			System.out.print(b[i]);
		}
	 }
   }		
 }
}
				

