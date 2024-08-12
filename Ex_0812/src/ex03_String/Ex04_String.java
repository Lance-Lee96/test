package ex03_String;

import java.util.Arrays;
import java.util.Scanner;

public class Ex04_String {
	public static void main(String[] args) {
		/*
		 * (-포함)주민번호를 키보드에서 입력받는다.
		 * 예시) 911223 - 1234567
		 * 당신은 1999년 11월 22일에 태어난 남자입니다.
		 * 형식을 잘못 입력했을 때는 "주민번호를 올바르게 입력하세요" 라고 출력
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("주민 번호 : ");
		String inum = sc.next();
		
		//잘못쓴경우
		if(inum.length() < 14 || inum.charAt(6) != '-') {	
			System.out.println("주민번호를 올바르게 입력하세요");
		} else {
			String y = "";
			String result = "";
			y = inum.substring(0,2);
			
			if(Integer.parseInt(y) <= 14) {
				result = "당신은 20";
			}else {
				result = "당신은 19";
			}
			
			result += y + "년 "+ inum.substring(2,4)+"월 " + inum.substring(4,6) + "일에 태어난 ";
			
			if(inum.charAt(7) %2 !=0) {
				result += "남자입니다.";
			}else {
				result += "여자입니다.";
			}
			
			System.out.println(result);
		}
		
		
		
		
//		if (inum.charAt(7) != '-') {
//			System.out.println("주민번호를 올바르게 입력하세요");
//		}
//		String y = inum.substring(0,1);
//		String m = inum.substring(2,3);
//		String d = inum.substring(4,5);
//		String s = "";
//		if(inum.charAt(9) == 1 || inum.charAt(9) == 3) {
//			s = "남자";
//		}else if(inum.charAt(9) == 2 || inum.charAt(9) == 4) {
//			s = "여자";
//		}
//		
//		System.out.println("당신은 19" + y + "년 " + m + "월 " + d + "일에 태어난 " + s + "입니다.");
//		
	}
}
