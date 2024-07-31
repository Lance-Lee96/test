package ex03_operator;

public class Ex05_Operator {
	public static void main(String[] args) {
		//논리연산자
		//피연산자를 두개 필요로 하는 연산자
		//피연산자로 논리형 데이터만 사용이 가능하다.
		
		//&&
		//and(그리고)의 의미를 가지고 있다.
		//앞뒤의 피연산자가 모두 true면 true를 반환한다.
		
		System.out.println(true && true);
		
		//T && T -> T
		//T && F -> F
		//F && T -> F
		//F && F -> F
		
		int myAge = 30;
		int limit = 35;
		boolean result = (limit - myAge) >= 5 && myAge > 30;
		System.out.println(result);
		System.out.println();
		
		//||(또는) or 의미를 가지고 있다.
		//앞 뒤의 피연산자중 하나라도 true 면 true를 반환한다.
		//T || T -> T
		//T || F -> T
		//F || T -> T
		//F || F -> F
		
		int n1 = 10;
		int n2 = 20;
		boolean result2 = (n1+=10) > 20 || (n2-=10) == 11;
		
		System.out.println(result2);
		System.out.println(n2);
		
		// **&&와 || 에서 결과값에 영향을 주지 않는 항은 작동하지 않는다
		// 따라서 복합대입연산자로 인해 영향을 받는 항도 작동하지 않으면 변수의 값이 바뀌지 않는다.
		
		}
	

	
}
