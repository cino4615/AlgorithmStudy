package chap01.prac;

import java.util.Scanner;

//입력한 수를 한 변으로 하는 정사각형을 * 기호로 출력하는 프로그램 작성
public class Prac14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("사각형을 출력합니다");
		System.out.println("단 수 : ");
		int rec = sc.nextInt();
		for (int i = 0; i < rec; i++) {
			for (int j = 0; j < rec; j++) {
				if (j == rec - 1)
					System.out.println("*");
				else
					System.out.print("*");
			}
		}

	}
}
