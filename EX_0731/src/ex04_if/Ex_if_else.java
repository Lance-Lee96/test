package ex04_if;

public class Ex_if_else {

	public static void main(String[] args) {
		int num = 5;
		if(num > 4) {
			System.out.println(num+"은 4보다 큽니다.");
		} else {
			System.out.println(num+"은 4보다 작습니다.");
		}
		
		//---------------------------------------------
		//두 개의 숫자 비교하기
		int a = 4;
		int b = 10;
		
		if(a > b) {
			System.out.println("a가 b보다 큽니다.");
		} else {
			if(a==b) {
				System.out.println("a와 b는 같습니다.");
			} else {
				System.out.println("a가 b보다 작습니다.");
			}
		}
		
		System.out.println("-----------------------------------------------");
		
		//int형 변수 x가 10보다 크고 20보다 작을 때 true 인 조건식
		int x = 11;
		if(x > 10 && x < 20) {
			System.out.println("true");
		}
		//char형 변수 ch가 'x' 또는 'X'일 때 true인 조건식
		char ch = 'x';
		if(ch == 120 || ch == 88) {
			System.out.println("true");
		}
		//char형 변수 ch2가 알파벳(대문자 또는 소문자)일 때 true인 조건식
		char ch2 = 'A';
		if(ch2 >= 65 && ch2 <= 122) {
			System.out.println("true");
		}
		
		
		
		
		
		
		
		
		

	}

}
