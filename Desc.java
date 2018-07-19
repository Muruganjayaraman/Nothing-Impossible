import java.util.Scanner;

public class Desc {
	public static void main(String[] args) {
		int i,a,temp,j;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		int b[]=new int[a];
		for(i=0;i<a;i++){
			b[i]=in.nextInt();
		}
		for(i=0;i<a;i++){
			for(j=i+1;j<a;j++){
			if(b[i]<b[j]){
				temp=b[i];
				b[i]=b[j];
				b[j]=temp;
			}
		}
	}
				for(i=0;i<a;i++)
					System.out.print(b[i]);
	}

}
