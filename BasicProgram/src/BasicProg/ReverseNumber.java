package BasicProg;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		/*
		StringBuffer sbf=new StringBuffer(String.valueOf(num));
		StringBuffer rev= sbf.reverse();
		System.out.println("reversed number" +rev);
		*/
		StringBuilder sbl=new StringBuilder();
		sbl.append(num);
		StringBuilder rev=sbl.reverse();
		System.out.println("reversed number " + rev);
		
		
	}

}
