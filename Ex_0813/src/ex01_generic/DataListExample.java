package ex01_generic;

public class DataListExample {
	public static void main(String[] args) {
		//DataList객체 생성하기 변수명은 list
		
		//제네릭 타입은 기본자료형을 인식하지 않는다.
		//따라서 int, double등의 기본자료형을 제네릭 타입으로 이용하려면
		//Integer, Double등의 Wrapper 클래스를 이용해야 한다.
		DataList<Integer> list = new DataList<Integer>();
		
		//정수 입력
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		//문자열저장
		//list.add("문자열");
		
		//실수저장
		//list.add(12.34);
		
		//데이터 출력
		int sum = 0;
		for(int i = 0; i < list.size(); i++) {
			sum += list.get(i);
			
//			//저장된 타입이 어떤 타입인지 검사
//			if(data instanceof Integer) {
//				System.out.println("정수 : " + (int)data);
//			}else if (data instanceof Double) {
//				System.out.println("실수 : " + (double)data);
//			}else if (data instanceof String) {
//				System.out.println("문자열 : " + (String)data);
//			}
		}
		System.out.println("총합 : " + sum);
		
		
	}
}
