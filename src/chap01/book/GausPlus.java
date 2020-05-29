package chap01.book;

import java.util.Scanner;
import java.util.stream.IntStream;

public class GausPlus {
//가우스의 덧셈
	public static void main(String[] args) {
		int result = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력하시오");
		int n = sc.nextInt();
		// 짝수일 경우에는 성립하지만 홀수일경우 실패
		if (n % 2 == 0) {
			// n+1한 것이 n/2개 생김
			result = (n + 1) * (n / 2);
		} else {
			// 홀수일경우 n-1 까지 계산을 수행하고 +n
			result = n * ((n - 1) / 2) + n;
		}

		// 3항연산자로 계산하기
//		int sum = (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0);

		System.out.println("n까지의 합 결과는 : " + result);

		// 자바 8부터 사용되는 덧셈방식
		System.out.println(IntStream.rangeClosed(1, n).sum());
	}
}

//---------------------------------------------------------------
// 가우스 공식에 의해 1, 2, …, n의 합을 구합니다.

//class SumGauss_01_08 {
//	public static void main(String[] args) {
//		Scanner stdIn = new Scanner(System.in);
//
//		System.out.println("1부터 n까지의 합을 구합니다.");
//		System.out.print("n의 값：");
//		int n = stdIn.nextInt();
//
//		int sum = (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0); // 합
//
//		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
//	}
//}
