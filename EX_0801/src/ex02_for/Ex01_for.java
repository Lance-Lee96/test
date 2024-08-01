package ex02_for;

import java.util.Scanner;

public class Ex01_for {
	public static void main(String[] args) {
		for(int i = 0; i < 3; i++) {
			System.out.print(i);
			
		}
		System.out.println();
		System.out.println("----------------------------");
		
		// 1 2 3 4 5 6 7 8 9 10
		for(int i = 1; i <= 10; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		
		//10 9 8 7 6 5 4 3 2 1
		for(int i = 10; i >= 1; i--) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		
		// 1 ~ 20까지 홀수만 가로로 출력하기
		for(int i = 1; i <= 20; i += 2) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		//1~10까지 3의 배수만 출력하는 코드 작성하기
		for(int i = 1; i <= 10; i++) {
			if(i%3==0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		//1부터 10까지의 총합 구하기
		//총 합은 한번만 출력
		int sum = 0;
		for(int i = 1; i <=10; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		//정수형 변수 dan에 2~9사이의 값으로 초기화 하고
		//해당 dan에 해당하는 구구단 출력하기
		int dan = 3;
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n",dan, i, (dan*i));
		}
		System.out.println();
		
		//키보드에서 정수를 하나 입력받아
		//1부터 입력받은 수 까지의 총합을 구하세요
		
		Scanner sc = new Scanner(System.in);
		/*System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		sum = 0;
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println("총합 : " + sum);
		*/
		
		//10개의 정수를 입력받아 그 중에 짝수가 몇 개인지
		//개수를 출력하세요
//		System.out.println("정수를 10개 입력하세요 : ");
//		int count = 0;
//		for(int i = 1; i <= 10; i++) {
//			int num = sc.nextInt();
//			if(num % 2 == 0) {
//				count++;
//			}
//		}
//		System.out.println("짝수의 개수 : " + count);
//		
		
		//키보드로부터 정수를 두 개 입력받는다.
		//입력받은 x 부터 y 까지의 총 합을 출력하세요.
		//단, x가 y보다 큰 경우 x 와 y 값을 바꿔서 총합을 구한다.
		System.out.println("x의 값 : ");
		int x = sc.nextInt();
		System.out.println("y의 값 : ");
		int y = sc.nextInt();
		
		if(x > y) {
			int temp = x;
			x = y;
			y = temp;
		}
		sum = 0;
		for(int i = x; i <= y; i++) {
			sum += i;
		}
		System.out.println("x부터 y까지의 총합 : " + sum);
	}
}
