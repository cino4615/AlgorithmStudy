package chap01.prac;

//밑과 같이 아래를 향한 n단의 숫자 피라미드를 출력하는 메서드를 작성하세요
//     1
//    222
//   33333
//  4444444
public class Prac17 {
//static void npira(int n)
	public static void main(String[] args) {
		npira(5);
	}

	public static void npira(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (i - 1) * 2 + 1; j++) {
				System.out.print(i);
			}
			System.out.println("");
		}
	}
}
