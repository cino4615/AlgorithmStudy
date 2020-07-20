package data.structure.analysis;

//선택 정렬이라는 간단한 알고리즘의 구현이다.
//선택 정렬 : 주어진 리스트 중에 제일 작은 값을 찾아
//맨앞에 위치한 값과 비교한다.
//이후 처음을 뺀 나머지 값과 비교하는 방식으로 구현한다

//요소의 크기와 첫번째 위치를 알고 있다면 한번의 곱셈과 덧셈으로 어떤 요소의 위치라도 알 수 있음
//-> 상수 시간 연산
//swapElements의 모든 연산이 상수 시간이므로 전체 메서드는 상수 시간이 된다

//start인자가 0이면 indexLowest메서드는 전체 배열을 검색하고 전체 비교횟수는 배열의 길이인 n이 됨
//start 인자가 1이면 비교횟수는 n-1
//일반적으로 비교횟수는 n-start가 되어 indexLowest메서드는 선형이 된다
public class SelectionSort {
	
	//i와 j위치에 있는 값을 바꿉니다.
	public static void swapElements(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	//start로부터 시작하는 최솟값의 위치를 찾고(start 포함)
	//배열의 마지막 위치로 갑니다.
	public static int indexLowest(int[] array, int start) {
		int lowIndex = start;
		for(int i = start; i < array.length; i++) {
			//i번째 인덱스가 비교할 인덱스값 보다 작으면 lowIndex에 해당값 넣음
			//=>array에서 최솟값 찾아냄
			if(array[i] < array[lowIndex]) {
				lowIndex = i;
			}
		}
		//최소값이 들어있는 인덱스번호 리턴
		return lowIndex;
	}
	
	//선택 정렬을 사용하여 요소를 정렬합니다.
	
	//비교연산 처음호출시 n번 , 두번째 호출시 n-1번 비교연산, ... 이런식으로
	//총 비교횟수는 n + n-1 + n-2 + ... + 1 + 0 이다
	//이 수열의 합은 n(n + 1)/2 이고 n의 제곱에 비례
	//->selectionSort메소드는 이차라는 의미
	public static void selectionSort(int[] array) {
		for(int i = 0; i<array.length; i++) {
			//i로부터 시작하는 최솟값의 위치를 찾음
			int j = indexLowest(array, i);
			//i와 j의 위치를 바꿈
			swapElements(array, i, j);
		}
	}
		
}
