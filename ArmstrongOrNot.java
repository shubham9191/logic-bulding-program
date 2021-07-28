package JavaProgram;

import java.util.Scanner;

public class ArmstrongOrNot {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.printf("enter the number:");
		int x=s.nextInt();
		 int sum=0;
		int temp=x;
		while(x>0) {
			
			int d=x%10;
			
			sum=sum+(d*d*d);
			x=x/10;
		}
		if(temp ==sum) {
			System.out.println("armstorng number");
		}
		else {
			System.out.println("not armstorng number");
		}

	}

}
