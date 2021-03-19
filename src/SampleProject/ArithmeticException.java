package SampleProject;

import java.util.Scanner;

public class ArithmeticException {

	public static void main(String[] args) {
		double result = 0.0;
		int num;
		Scanner sc = new Scanner(System.in);
		
		try {
			num = sc.nextInt();
			result = 100 / num;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(result);
		
		sc.close();
	}

}
