package ex02;

import java.util.Scanner;

public class MethodMain {
	public static void main(String[] args) {
		MethodTest mt1 = new MethodTest();
		int [] arr = {4,1,2,10,7,9,5,6,3,8};
		mt1.maxFinder(arr);
	System.out.println("----------------------------------");
		
		MethodTest mt2 = new MethodTest();
		Scanner sc = new Scanner(System.in);
		System.out.println("메소드 선택");
		int n = sc.nextInt();
		if (n == 1) {
			mt2.fToc();
		}else if(n == 2) {
			mt2.cToc();
		}else {
			System.out.println("잘못된 입력입니다.");
		}
	
	
	
	
	
	}
}
