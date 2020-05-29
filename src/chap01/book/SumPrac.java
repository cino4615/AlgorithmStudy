package chap01.book;

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

//--------------------------------------------------------------
// 1, 2, …, n의 합을 구합니다  (식1 + 2 + … + n = 999라고 출력함)
//
//class SumForEx_01_07 {
//	public static void main(String[] args) {
//		Scanner stdIn = new Scanner(System.in);
//
//		System.out.println("1부터 n까지의 합을 구합니다.");
//		System.out.print("n의 값：");
//		int n = stdIn.nextInt();
//
//		int sum = 0; // 합
//
//		for (int i = 1; i <= n; i++) {
//			if(i < n)
//				System.out.print(i + " + ");
//			else
//				System.out.print(i);
//			sum += i; // sum에 i를 더함
//		}
//		System.out.println(" = " + sum);
//	}
//}

