package chap01;

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
			result = (n + 1) * (n / 2);
		} else {
			// 홀수일경우 n-1 까지 계산을 수행하고 +n
			result = n * ((n - 1) / 2) + n;
		}
		System.out.println("n까지의 합 결과는 : " + result);

		// 자바 8부터 사용되는 덧셈방식
		System.out.println(IntStream.rangeClosed(1, n).sum());
	}
}
