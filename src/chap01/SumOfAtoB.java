package chap01;

public class SumOfAtoB {

	static int sumof(int a, int b) {
		int result = 0;
		if(b > a) {
			for(int i = a; i <= b; i ++) {
				result += i;
			}
		}else if(a > b) {
			for(int i =b; i <= a; i ++) {
				result += i;
			}
		}else {
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
