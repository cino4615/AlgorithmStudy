package check;

//String name = "자바";
//라고 할 경우 name이라는 변수에 "자바"라는 값을 입력한 것이 아니다
//1. "자바"라는 객체를 생성 후
//2. "자바"라는 객체가 저장돼있는 메모리의 주소값을 a라는 변수에 저장한 것
// =>이 방식이 참조타입의 구조
//그러니까 a와 b에 둘다 "자바"라는 값을 저장했다고 하더라도
//참조형 변수에서 a와 b를 비교시에 각각에 들어있는 값은 그 변수의 주소값이기 때문에
//false라는 결과가 나온다

//이떼 주소값이 아닌 String변수가 실제로 지칭하는 문자열이 같음을 판단하고 싶을 때
//equals메소드를 사용한다.
public class EqualsAndHashCode {

	private String name;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EqualsAndHashCode other = (EqualsAndHashCode) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}