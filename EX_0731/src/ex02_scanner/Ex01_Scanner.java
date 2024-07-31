package ex02_scanner;

import java.util.Scanner;


public class Ex01_Scanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("이름을 입력해주세요 : ");
		String name = scan.next();
		System.out.print("나이를 입력해주세요 : ");
		int age = scan.nextInt();
		scan.nextLine();
		System.out.print("주소를 입력해주세요 : ");
		String address = scan.nextLine();
		System.out.print("키를 입력해주세요 : ");
		double height = scan.nextDouble();
		
		System.out.printf("제 이름은 %s 입니다.\n",name);
		System.out.printf("제 나이는 %d세 입니다.\n", age);
		System.out.printf("제 주소는 %s 입니다.\n", address);
		System.out.printf("제 키는 %.1f 입니다.\n", height);
		//제 이름은 XXX입니다.
		//제 나이는 XX세입니다.
		//제 주소는 XXX입니다.
		//제 키는 XX.Xcm입니다.
		
		
		
		
		

	}

}
