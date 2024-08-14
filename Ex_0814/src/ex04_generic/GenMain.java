package ex04_generic;

public class GenMain {
	public static void main(String[] args) {
		Gen gen = new Gen();
		Integer[] it = {1,2,3,4,5};
		Double[] dt = {1.1,2.2,3.3,4.4,5.5};
		Character[] ct = {'A','B','C','D','E'};
		
		//제네릭메서드 사용시 장점
		//객체를 매 타입에 맞게 만들어줄 필요가 없음
		gen.printArr(it);
		gen.printArr(dt);
		gen.printArr(ct);
	}
}
