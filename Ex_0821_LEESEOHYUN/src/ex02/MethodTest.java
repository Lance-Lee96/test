package ex02;

import java.util.Scanner;

public class MethodTest {
	void maxFinder(int[] arr) {
		int max = 0;
		for(int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			
		}System.out.println(max);
	}
	Scanner sc = new Scanner(System.in);
	void fToc() {
		System.out.println("화씨 : ");
		double f = sc.nextDouble();
		double c = (f-32)/1.8;
		System.out.println("화씨를 섭씨로 : " + c);
	}
	
	void cToc() {
		System.out.println("섭씨 : ");
		double c = sc.nextDouble();
		double f = (1.8 * c) + 32;
		System.out.println("섭씨를 화씨로 : " + f);
	}
}
