package flow_of_program;

import java.util.Scanner;

public class LcmHcf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("LCM of "+num1+" and "+num2+" is: "+lcm(num1,num2));
		System.out.println("HCF of "+num1+" and "+num2+" is: "+hcf(num1,num2));

	}
	public static int lcm(int num1,int num2) {
		int max = (num1>num2)?num1:num2;
		while(true) {
			if(max%num1==0 && max%num2==0)
				return max;
			max++;
		}
		
		// lcm=(num1*num2)/hcf;
	}
	public static int hcf(int num1,int num2) {
		int min = num1<num2?num1:num2;
		int hcf=1;
		for(int i=1;i<=min;i++) {
			if(num1%i==0 && num2%i==0)
				hcf=i;
		}
		return hcf;
	}
}