package chap01.prac;

//n단의 피라미드를 출력하는 메서드를 작성하세요(밑은 4단의 예)
//     *
//    ***
//   *****
//  *******
public class Prac16 {
//static void spira(int n)
	public static void main(String[] args) {
		spira(5);
	}

	public static void spira(int n) {
		// n단의 피라미드
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (i - 1) * 2 + 1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
