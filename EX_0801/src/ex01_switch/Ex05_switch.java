package ex01_switch;

import java.util.Scanner;

public class Ex05_switch {
	public static void main(String[] args) {
		/*
		 * 10 이하의 숫자를 키보드에서 입력받는다.
		   해당 숫자가 짝수인지 홀수인지 판별하여 출력하는 코드를
		   switch로 작성해주세요.
		 */
		/*System.out.println("10 이하의 숫자를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		switch(num % 2) {
		case 1 :
			System.out.println("num은 홀수입니다.");
			break;
		case 0:
			System.out.println("num은 짝수입니다.");
			break;
			
		}
		*/
		/*
		 * 키보드에서 달(month)를 입력받아
		   해당 달이 몇일 까지 있는지 switch문을 이요해 작성해주세요.
		   결과
		   X월은 X일까지 있습니다.
		 */
	
		Scanner sc = new Scanner(System.in);
		/*System.out.println("월을 입력하세요 : ");
		int month = sc.nextInt();
		switch(month) {
		case 1,3,5,7,8,10,12 -> System.out.println(month + "월은 31일 까지 있습니다.");
		case 4,6,9,11 -> System.out.println(month + "월은 30일 까지 있습니다.");
		case 2 -> System.out.println(month + "월은 28일 까지 있습니다.");
		default -> System.out.println("잘못된 입력입니다.");
		}*/
		
		/*
		 * 계산기 프로그램 만들기
		   두 개의 정수를 입력받는다.
		   산술연산자도 입력받아서 문자열에 담는다 ex) "+"
		   switch문을 이용하여 정수의 연산을 수행하는 코드 작성하기
		 */
		System.out.println("두 개의 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("하고 싶은 계산을 입력하세요 : ");
		sc.nextLine();
		String cal = sc.nextLine();
		switch(cal) {
		case "+" -> System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
		case "-" -> System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
		case "*" -> System.out.println(num1 + "*" + num2 + "=" + (num1*num2));
		case "/" -> System.out.println(num1 + "/" + num2 + "=" + (num1/(double)num2));
		}
	}
}
