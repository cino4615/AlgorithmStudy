package chap01.book;

//중앙값을 구하는 메서드는 다음과 같이 작성할 수 도 있습니다. 그러나 Median.java의
//메서드에 비해 효율이 떨어지는데, 그 이유를 작성하시오.
public class LowEfficiencyMed3 {
// 실습 1C-1의 med3함수는 최악의 시나리오일 때, 최대 3번의 비교를 한다.
// 하지만 Q5의 med3함수는 최악의 시나리오일 때, 최대 5번의 비교를 하게 된다.
	static int med3(int a, int b, int c) {
		if ((b >= a && c <= a) || (b <= a && c >= a))
			return a;
		else if ((a > b && c < b) || (a < b && c > b))
			return b;
		return c;
	}

}
