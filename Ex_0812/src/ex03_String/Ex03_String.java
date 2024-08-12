package ex03_String;

import java.util.Arrays;
import java.util.Scanner;

public class Ex03_String {
	public static void main(String[] args) {
		//회문 판별하기
		//회문이란 앞으로 읽어도 뒤로 읽어도 똑같이 읽히는 문장.
		//키보드에서 문장을 입력받고 해당 문장이 회문이면
		//XXX는 회문입니다. 아니면 XXX는 회문이 아닙니다. 라고 출력하기
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문장을 입력하세요. : ");
		String s = sc.next();
		String rs = "";
		
		for (int i = s.length(); i>0;i--) {
			rs += s.charAt(i-1);
			}
		
		if (s.equals(rs)) {
			System.out.println(s + "는 회문입니다.");
		}else {
			System.out.println(s + "는 회문이 아닙니다.");
		}
	}
}
