package JavaProgram;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		 int revers=0;
		
		while(x!=0) {
			int d=x%10;
			revers=revers*10+d;
			x=x/10;
			
		}
		System.out.println(revers);

	}

}
