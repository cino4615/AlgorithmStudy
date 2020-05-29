package chap01.prac;

import java.util.Scanner;

//양의 정수를 입력하고 자릿수를 출력하는 프로그램을 작성하시오
// ex) 123 => 3자리 / 1234 => 4자리
public class Prac11 {
	public static void main(String[] args) {
		int numCnt = 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("양의 정수입력해라");
		System.out.println("a : ");
		int num = sc.nextInt();

		while(num > 10) {
			num = num / 10;
			numCnt++;
		}
		System.out.println(numCnt + "자리수입니다.");
	}
}
