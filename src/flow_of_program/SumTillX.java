package flow_of_program;

import java.util.Scanner;

public class SumTillX {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		while(sc.hasNext()) {
			if(sc.hasNextInt())
				sum += sc.nextInt();
			else
				break;
		}
		System.out.println(sum);
	}
}
