package data.structure.interf;

import java.util.LinkedList;
import java.util.List;

//interface는 List가 된다는 의미가 무엇인지를 정의
//이 interface를 구현하는 클래스는 add, get, remove와 약 20가지 메서드를 포함한 특정 메서드 집합을 제공해야함
//ArrayList와 LinkedList 클래스는 이러한 메서드를 제공하므로 상호교환할 수 있다.
//List로 동작하는 메서드는 ArrayList와 LinkedList 또는 List를 구현하는 어떤 객체와도 잘 동작함
public class ListClientExample {
	//해당 클래스는 List를 캡슐화하는 클래스의 필수 요소를 갖고 있음
	
	//List형의 인스턴스 변수
	private List list;
	
	//생성자 : 새로운 LinkedList객체를 만들어 리스트를 초기화함
	public ListClientExample() {
		list = new LinkedList();
	}
	
	//List객체에 대한 참조를 반환
	public List getList() {
		return list;
	}
	
	//테스트하는 몇줄의 코드
	public static void main(String[] args) {
		ListClientExample lce = new ListClientExample();
		List list = lce.getList();
		System.out.println(list);
		//LinkedList
		System.out.println(list.getClass());
	}
	//여기서 마음을 바꿔 ArrayList를 쓰고자 한다면
	//생성자만 바꾸면 되고 그 외에는 그대로 두면 된다. 이것이 인터페이스의 역할
	
	//이러한 스타일을 인터페이스 기반 프로그래밍 또는 인터페이스 프로그래밍이라 한다
	//여기서의 인터페이스는 자바의 interface가 아닌 일반적인 개념의 인터페이스
	
	//해당 코드에서 알 수 있는 것은 
	//라이브러리를 사용할 때 코드는 오직 List와 같은 인터페이스만 의존하고
	//ArrayList 클래스와 같은 특정 구현에 의존해서는 안된다.
	//이러한 방식으로 하면 나중에 구현이 변경되어도 인터페이스를 사용하는 코드는 그대로 사용가능
}
