package chap01;

public class Max3m {

	static int max3(int a, int b, int c) {
		int max = a;
		if (b > max)
			max = b;
		if (c > max)
			max = c;

		return max;
	}

	//최댓값을 여러번 반복해서 구하는 경우 메서드를 이용하면 편리
	public static void main(String[] args) {
		System.out.println(max3(3, 2, 1));
		System.out.println(max3(3, 2, 2));
		System.out.println(max3(3, 1, 2));
		System.out.println(max3(1, 2, 3));
		System.out.println(max3(1, 21, 32));
	}
}
