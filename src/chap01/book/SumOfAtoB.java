package chap01.book;

public class SumOfAtoB {
	// 해설 int 변수 min과 max 선언후, a>b면 a가 max b가 min / b>a면 b가 max a가 min
	// 이후 min~max까지로 for문돌리면 for문 한번만 돌아가도됨
	static int sumof(int a, int b) {
		int result = 0;
		if (b > a) {
			for (int i = a; i <= b; i++) {
				result += i;
			}
		} else if (a > b) {
			for (int i = b; i <= a; i++) {
				result += i;
			}
		} else {
			result = a;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(sumof(1, 8));
		System.out.println(sumof(2, 3));
		System.out.println(sumof(8, 1));
	}
}

//-------------------------------------------------------
// 정수a, b를 포함하여 그 사이의 모든 정수의 합을 구합니다. 
//class SumOf_01_09 {
//	static int sumof(int a, int b) {
//		int min; // a, b의 작은 쪽의 값
//		int max; // a, b의 큰 쪽의 값
//
//		if (a < b) {
//			min = a;
//			max = b;
//		} else {
//			min = b;
//			max = a;
//		}
//
//		int sum = 0; // 합
//		for (int i = min; i <= max; i++)
//			sum += i;
//		return (sum);
//	}
//
//	public static void main(String[] args) {
//		Scanner stdIn = new Scanner(System.in);
//
//		System.out.println("a와 b를 포함하여 그 사이의 모든 정수의 합을 구합니다.");
//		System.out.print("a의 값：");
//		int a = stdIn.nextInt();
//		System.out.print("b의 값：");
//		int b = stdIn.nextInt();
//
//		System.out.println("정수 a, b 사이의 모든 정수의 합은 " + sumof(a, b) + "입니다.");
//	}
//}
