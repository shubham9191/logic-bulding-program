package JavaProgram;

import java.util.Scanner;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.printf("Enter the Number:");
		int x =s.nextInt();
		int temp=0;
		for(int i=2;i<=x-1;i++) {
			if(x%i==0) {
				temp=temp+1;
			}
			}
		if(temp>0) {
			System.out.println("Not Prime");
		}
		else {
			System.out.println("Prime");
		}
		
	}
}
