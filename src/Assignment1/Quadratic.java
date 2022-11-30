package Assignment1;

import java.util.Scanner;

public class Quadratic {

	public static boolean checkquadratic(int a, int b, int c) {
		int res = b ^ 2 + 4 * a * c;
		
		  if(b>=0) { return true; } else {
		  
		  return false; }
		  
		 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc1 = new Scanner(System.in);
		int a = sc1.nextInt();
		Scanner sc2 = new Scanner(System.in);
		int b = sc2.nextInt();
		Scanner sc3 = new Scanner(System.in);
		int c = sc3.nextInt();

		if (checkquadratic(a, b, c) == true) {
			double roots1 = (b^2+4*a*c)^1/2;
			double roots2=(b^2-4*a*c)^1/2;
			System.out.println(roots1 + "and" + roots2);
		}
		else
		{
			System.out.println("no real roots");
		}

	}


	

}
