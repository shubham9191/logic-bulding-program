package JavaProgram;

import java.util.Scanner;

public class swapTwoNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		
		int c=0;
		c=a;
		a=b;
		b=c;
		System.out.println(a+"  "+b);

	}

}
