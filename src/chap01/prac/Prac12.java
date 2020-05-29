package chap01.prac;

//오른쪽과 같이 위쪽과 왼쪽에 곱하는 수가 있는 곱셈표를 출력하는 프로그램을 작성하시오
public class Prac12 {

	public static void main(String[] args) {

		int j = 0;
		for (int i = 0; i < 10; i++) {
			if (i == 0)
				System.out.println(" ");
			else
				System.out.print(i + "|");
			for (j = 0; j < 10; j++) {
				if (j == 0)
					System.out.println(" ");
				if (j == 9)
					System.out.println(i * j + " ");
				else
					System.out.print(i * j + " ");

			}
		}
	}
}
