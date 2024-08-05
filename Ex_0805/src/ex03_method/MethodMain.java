package ex03_method;

import java.util.Scanner;

public class MethodMain {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,30};
		MethodTest test = new MethodTest();
		test.maxFinder(arr);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 숫자 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.println("두 번째 숫자 입력 : ");
		int num2 = sc.nextInt();
		
		System.out.println("연산기호 입력 : ");
		String C = sc.next();
		
		int result = test.getResult(num1, num2, C);
		System.out.println("결과 : " + result);
	}
}
