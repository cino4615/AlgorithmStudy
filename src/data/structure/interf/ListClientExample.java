package data.structure.interf;

import java.util.LinkedList;
import java.util.List;

//interface는 List가 된다는 의미가 무엇인지를 정의
//이 interface를 구현하는 클래스는 add, get, remove와 약 20가지 메서드를 포함한 특정 메서드 집합을 제공해야함
//ArrayList와 LinkedList 클래스는 이러한 메서드를 제공하므로 상호교환할 수 있다.
//List로 동작하는 메서드는 ArrayList와 LinkedList 또는 List를 구현하는 어떤 객체와도 잘 동작함
public class ListClientExample {
	//해당 클래스는 List를 캡슐화하는 클래스의 필수 요소를 갖고 있음
	private List list;
	
	public ListClientExample() {
		list = new LinkedList();
	}
	
	public List getList() {
		return list;
	}
	
	public static void main(String[] args) {
		ListClientExample lce = new ListClientExample();
		List list = lce.getList();
		System.out.println(list);
	}
}
