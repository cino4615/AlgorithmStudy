package chap01;

// 중앙값 구하기!!
public class Median {

	static int med3(int a, int b, int c) {
		if (a >= b)
			// a>=b>=c
			if (b >= c)
				return b;
			// c>=a>=b
			else if (a <= c)
				return a;
			// a>=c>=b
			else
				return c;
		//같은 상황일때 위에서 다 구해줬고
		//a가 b보다 크거나 같지 않은 경우 else if 수행
		//a >= b가 아니면 무조건 a < b
		else if (a > c)//a < b
			//b>=a>c
			return a;
		else if (b > c)//a < b//a < c
			//b>c>=a
			return c;
		else
			//c>=b>a
			return b;
	}
}
