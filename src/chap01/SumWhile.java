package chap01;

import java.util.Scanner;

public class SumWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.println("n의 값 : ");
		int n = sc.nextInt();

		int sum = 0;
		int i = 1;

		// 사전 판단 반복 구조 : 실행전에 계속할지를 판단하는 구조
		// 제어식의 평가값이 0이 아니면 프로그램 명령문이 반복
		while (i <= n) {
			sum += i;
			// i++해주고 초과일 시 while문을 탈출하므로 최종 i값은 n+1이다
			i++;
		}
		System.out.println("최종 i : " + i);

		System.out.println("1부터 " + n + "까지의 합은  " + sum + "입니다.");
	}
}
