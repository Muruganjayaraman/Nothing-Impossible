package guvi;

import java.util.Scanner;

public class Three {
	public static void main(String args[]){
		char ch;
		Scanner in=new Scanner(System.in);
		ch=in.next().charAt(0);
		if(ch=='a'|ch=='e'|ch=='i'|ch=='o'|ch=='u'|ch=='A'|ch=='E'|ch=='I'|ch=='O'|ch=='U'){
			System.out.println("Vowel");
		}
		else if((ch>='a'&&ch<='z')|(ch>='A'&&ch<='Z')){
			System.out.println("Consonant");
		}
	else{
		System.out.println("Invalid");
	}
	}
}
