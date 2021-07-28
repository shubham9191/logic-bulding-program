package JavaProgram;

import java.util.Scanner;

public class LeepYearOrNot {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.printf("enter the year:");
		int x=s.nextInt();
		if((x%4==0)&&(x%100!=0)||(x%400==0)) {
			System.out.println(x +" is Leap year");
		}
		else {
			System.out.println(x +" Not Leap year");
		}

	}

}
