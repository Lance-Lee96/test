package ex03_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex01_work {
	public static void main(String[] args) {
		
		//아이디 생성 : abc
		//abc
		//아이디 생성 : abc2
		//abc abc2
		//아이디 생성 : abc2
		//중복된 아이디
		//아이디 생성 : abc3
		//abc abc2 abc3
		
		
		//리스트의 요소의 개수가 4개이면 프로그램 종료
//		PersonId p1 = new PersonId();
//		PersonId p2 = new PersonId();
//		PersonId p3 = new PersonId();
//		PersonId p4 = new PersonId();
//		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>()	;
//		
//		for(int i = 0; i<4;i++) {
//			System.out.println("아이디 입력 : ");
//			String id = "";
//		}
			while(true ) {
			System.out.println("아이디 생성 : ");
			String id = sc.next();
//			for(int i = 0; i < list.size();i++) {
//				if (id.equals(list.get(i))) {
//					System.out.println("중복된 아이디");
//					continue outer;
//				}
//			}
			if(list.contains(id)) {
				System.out.println("중복된 아이디");
				continue;
			}
			list.add(id);
			System.out.println(list);
			System.out.println("------------");
			
			
			if(list.size() == 4) {
				break;
			}
		}
		
		
		
	}
}

