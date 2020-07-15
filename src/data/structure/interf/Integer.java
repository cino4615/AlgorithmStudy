package data.structure.interf;

//java.lang.Integer클래스는 다음과 같이 생겨있다
//이클래스는 Number 클래스를 확장한다.
//Number클래스의 메서드와 인스턴스 변수를 상속하고
//Comparable<Integer> 인터페이스를 구현함
//따라서 Integer 객체를 인자로 받고 int를 반환하는 compareTo 메서드를 제공

//클래스가 인터페이스를 구현하고 선언하면 컴파일러는 interface가 정의한 모든 메서드를 제공하는지 확인
public final class Integer extends Number implements Comparable<Integer> {

	@Override
	public int compareTo(Integer o) {
//		int thisVal = this.value;
//		int anotherVal = anotherInteger.value;
//		return (thisVal<anotherVal ? -1 : (thisVal == anotherVal ? 0 : 1));
		return 0;
	}

	// 다른 메서드 생략
	@Override
	public int intValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long longValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float floatValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double doubleValue() {
		// TODO Auto-generated method stub
		return 0;
	}

}
