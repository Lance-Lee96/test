package ex03_String;

import java.util.Scanner;

public class Ex05_String {
	public static void main(String[] args) {
		/*
		 * 문자열 s는 키보드에서 입력받기
		 * 문자열 s의 길이가 4 또는 6이고, 숫자로만 구성되어 있는지
		 * 확인하는 코드 만들기
		 * 예시 "a234"면 False, "1234"면 True
		 * 
		 * 제한사항
		 * s는 길이 1 이상, 8이하의 문자열입니다.
		 * s는 영문 알파벳 대소문자 또는 0~9까지의 숫자로 이루어져 있습니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력 : ");
		String s = sc.next();
//		boolean a = true;
		if (s.length()==4 || s.length()==6) {
//			for (int i = 0;i<s.length();i++) {
//				if (s.charAt(i) < 48 && s.charAt(i) > 57) {
//					a = false;
//					break;
//				}else {
//					a = true;
//				}
//			}
//			try {
//				int n = Integer.parseInt(s);
//				return true;
//			}catch(Exception e) {
//				return false;
//			}
//			
		}
		
		
	
		
	}
}
