package JavaProgram;

import java.util.Scanner;

public class swapthreeNumberWithoutUsing4variable {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		int z=s.nextInt();
		
		x=x+y+z;
		y=x-(y+z);
		z=x-(y+z);
		x=x-(y+z);
		
		System.out.println(x+"  "+y+" "+z);

	}

}
