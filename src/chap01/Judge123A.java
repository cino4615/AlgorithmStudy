package chap01;

import java.util.Scanner;

public class Judge123A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("정수를 입력하세요 : ");
		int n = sc.nextInt();

		if (n == 1)
			System.out.println("이수는 1입니다.");
		if (n == 2)
			System.out.println("이수는 2입니다.");
		if (n == 3)
			System.out.println("이수는 3입니다.");
		else
			;	//공백문 : 실제로 아무것도 하지 않는 문장
	}
}
