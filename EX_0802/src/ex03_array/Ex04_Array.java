package ex03_array;

import java.util.Random;
import java.util.Scanner;

public class Ex04_Array {
	public static void main(String[] args) {
		//10개의 정수를 담을 수 있는 배열의 생성
		//배열의 이름은 numbers
//		int [] numbers = new int [10];
//		Random random = new Random();
//		int sum = 0;
//		//배열에 Random 클래스를 이용하여 1 ~ 30 사이의 난수 넣기
//		for(int i = 0; i < numbers.length; i++) {
//			int num = random.nextInt(30)+1;
//			numbers[i] = num;
//			System.out.print(numbers[i] + " ");
//			if (numbers[i] % 2 == 0) {
//				sum += numbers[i];
//			}
//		}
//		System.out.println();
//		System.out.println("numbers 배열 안에서 짝수의 합 : " + sum);
//		
		//nextInt(30)+1;
		
		//배열의 모든 요소 출력하기(가로)
		//배열 안에서 짝수의 합 구하기
		
		//배열에서 영문자만 추출하여 이어붙혀 출력하기
//		char[] cards = {'1','L','2','O','2','V','E','3'};
//		String myWord = "";
//		for(int i = 0; i < cards.length; i++) {
//			if (cards[i] >= 65 && cards[i] <= 90) {
//				myWord += cards[i];
//			}
//		}
//		System.out.println(myWord);
		
		//배열 arr에 담겨있는 모든 값의 합을 구하세요
//		int [] arr = {10,20,30,40,50};
//		int sum = 0;
//		
//		for(int i = 0; i < arr.length; i++) {
//			sum += arr[i];
//			
//		}
//		System.out.println(sum);
//		
		//다음 조건에 맞는 문제를 푸세요
		//- 키보드에서 배열의 길이를 입력받는다.
		//- 입력받은 길이만큼 알파벳을 넣고 출력한다.
		// ex) 배열의 길이를 입력하세요 : 5
		// ABCDE
//		Scanner sc = new Scanner(System.in);
//		System.out.println("배열의 길이를 입력하세요 : ");
//		int len = sc.nextInt();
//		String [] Alphabet = new String[len];
//		for (int i = 0; i < Alphabet.length; i++) {
//			char c = 'A';
//			System.out.print((char)(c + i));
//		}
		
		//동전의 개수 구하기
		//10 ~ 5000사이의 난수를 변수에 담는다.
		//1의 자리는 반드시 0이 되어야 합니다.
		//발생된 난수를 각 동전으로 바꾸면 몇개씩 필요한지 판단하는 코드 작성하기
		//가능한 적은 수의 동전을 사용하도록 한다.
		//4170
		//500원 : 8개
		//100원 : 1개
		//50원 : 1개
		//10원 : 2개
//		int [] coin = {500,100,50,10};
		Random rnd = new Random();
//		int money = rnd.nextInt(500)*10;
//		System.out.println("금액 : " + money);
//		
//		for(int i = 0; i < coin.length; i++) {
//			int n = money / coin[i];
//			//money = money % coin[i];
//			money %= coin[i];
//			System.out.println(coin[i] + "원 : " + n + "개");
//			}
		
		
		//로또 번호 생성하기
		//1~45 사이의 난수를 발생시켜 로또번호를 배열에 저장하고 출력하기
	
		int [] lotto = new int[6];
		
		
		outer:for(int i = 0; i < lotto.length;) {
			lotto[i] = rnd.nextInt(45)+1;
				for(int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					continue outer;
				}
			}
			System.out.print(" " + lotto[i]);
			i++;
		}
			
		
		
		
		
	}
	
}
	

