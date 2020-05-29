package chap01.prac;

import java.util.Scanner;

import com.sun.xml.internal.ws.api.pipe.NextAction;

//두변수 a,b에 정수를 입력하고 b-a를 출력하는 프로그램을 작성하시오
//단, 변수 b에 입력한 값이 a이하면 변수 b의 값을 다시 입력하시오
public class Prac10 {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("정수입력 ㄱㄱ");
		System.out.println("a의 값 : ");
		int a = sc.nextInt();

		System.out.println("b의 값 : ");
		int b = sc.nextInt();

		if (b <= a) {
			while (b <= a) {
				System.out.println("b가 작습니다. 다시 입력해주세요");
				b = sc.nextInt();
			}
		}
		sum = b - a;
		System.out.println("b-a는 " + sum + "입니다.");

	}
}
