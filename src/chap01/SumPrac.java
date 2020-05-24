package chap01;

import java.util.Scanner;

public class SumPrac {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		String sum = "";
		
		System.out.println("정수입력 : ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			if(n == i) {
				sum += i + "=";
			}else {
				sum += i + "+";
			}
			result += i;
		}
		
		System.out.println(sum + result);
	}
}
