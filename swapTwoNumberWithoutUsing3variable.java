package JavaProgram;

import java.util.Scanner;

public class swapTwoNumberWithoutUsing3variable {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println(x+"  "+y);

	}

}
