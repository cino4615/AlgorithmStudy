package chap01.prac;

public class HashCode {

	private String name;

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashCode other = (HashCode) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		// 31이라는 상수 선언 후
		final int prime = 31;
		// 결과값을 담을 변수 초기값1
		int result = 1;
		// result에 상수31과 *1 한것에 name값이 null이라면 0, 그게아니라면 name을 해시코드한 것
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		// 결과값 반환
		return result;
	}

	// 간단한 hashMethod 관련 예제
	public int sHM(String val) {
		int res = 0;	//결과값을 담을 변수
		int size = 11; // 배열의 크기
		char[] ca = val.toCharArray(); // 전달 받은 값을 문자배열로 변환
		//ex)name이 val의 값이라면 {n, a, m, e} 들어있겠지
		for (char i : ca) {
			// 각 문자의 아스키코드를 더해준다.
			// (int 형 변수에 문자를 담으면 해당 문자의 아스키코드 값이 변수에 담긴다)
			res += i;
			//ex) {n, a, m, e}  => 110 97 109 101
			//결국 다음 예제에서 res에 담길 값은 110 + 97 + 109 + 101 의 결과 값인 417이 담긴다
		}
		//417 % 11 = 37 ...10
		// 다음 계산결과의 나머지 값이 10이 res에 담긴다
		res %= size; // 더한 값을 배열의 크기로 나눈 나머지를 구한다.
		return res; // 해시코드를 반환한다.
	}

	//해쉬코드함수의 내부구현
//	public int hashCode() {
//		int h = hash;
//		if (h == 0 && value.length > 0) {
//			char val[] = value;
//
//			for (int i = 0; i < value.length; i++) {
//				h = 31 * h + val[i];
//			}
//			hash = h;
//		}
//		return h;
//	}

}
