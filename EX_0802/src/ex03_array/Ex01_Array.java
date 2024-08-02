package ex03_array;

public class Ex01_Array {
	public static void main(String[] args) {
		int[] arr; //배열의 선언
		
		//배열 arr에 4개의 데이터를 저장하기 위한 공간을 메모리에 할당받는다.
		arr = new int[4];
		
		//선언과 생성을 동시에 할 수 있다.
		int[] arr2 = new int[4];
		
		//배열에 저장될 값을 미리 부여해 선언하는 방법도 있다.
		int[] arr3 = {1,2,3,4,5};
		
		//배열을 선언할 때 값을 저장할 수 있다.
		//5개의 값을 대입했기 때문에 배열의 크기는 5가 되면
		//각 순서에 맞게 데이터가 삽입된다.
		//이 방법은 배열을 최초 선언할 때만 가능하다.
		
//		int[] arr4;
//		arr4 = {1,2,3,4,5}; -> 오류
		
		//선언한 후 값을 대입해야 하는 경우에는
		//아래와 같은 방법이 가능하다.
		int[] arr4;
		arr4 = new int[] {1,2,3,4,5};
		
		int n = 100;
		System.out.println(n);
		System.out.println(arr);
		//배열명을 출력하면 배열이 갖고 있는 주소값을 출력한다.
		//변수가 갖고 있는 값을 출력하는 것과 같은 원리이다.
		
		//배열의 특징
		//배열을 만들 때 크기를 꼭 지정해야 한다.
		//배열을 만든 후 공간의 크기를 늘리거나 줄일 수 없다.
		//배열을 만들 때 지정한 자료형의 값만 저장할 수 있다.
		
		//배열의 구조
		//1. 인덱스(index) -> 집의 호수
		//배열을 만든 후에는 값을 넣거나 꺼내야 하는데
		//배열은 각 공간마다 위치를 알려주는 위치값이 존재한다.
		//우리는 배열이 지니는 값들의 위치를 알려주는 위치값을
		//인덱스(index)라고 부른다.
		//인덱스는 배열의 공간마다 붙여진 번호로, 0번부터 시작하여
		//순차적으로 증가한다.
		
		
		
		
		
		
		
		
		
	}
}
