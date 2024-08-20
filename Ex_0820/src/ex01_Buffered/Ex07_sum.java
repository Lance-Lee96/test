package ex01_Buffered;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ex07_sum {
	public static void main(String[] args) throws Exception {
		//문제
		//N개의 숫자가 공백없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하세요.
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		//입력
		//N개의 숫자를 입력, 입력된 N개의 숫자만큼 숫자들이 공백없이 주어진다.
		System.out.println("입력받을 숫자의 개수 : ");
		int n = Integer.parseInt(buffer.readLine());
		int sum = 0;
		//입력받은 문자열을 미리 배열에 담아놓는다.
		String[] arr = buffer.readLine().split("");
		//내가 입력받은 숫자만큼만 반복
		for(int i = 0; i < n; i++) {
			//입력받은만큼만 더함
			sum += Integer.parseInt(arr[i]);
		}
		
		System.out.println("총합 : " + sum);
		
//		int [] arr = new int [n];
//		System.out.println("입력받을 숫자 : ");
//		for (int i = 0; i < arr.length; i++) {
//			int num = Integer.parseInt(buffer.readLine());
//			arr[i] = num;
//		}
//		System.out.println(Arrays.toString(arr));
//		
//		String str = Arrays.toString(arr);
//		System.out.println(str);
//		int [] nums = new int[str.length()];
//		for(int i = 0; i < str.length(); i++) {
//			nums[i] = str.charAt(i);
//		}
//		
//		int sum = 0;
//		for(int i = 0; i<nums.length;i++) {
//			sum += nums[i];
//		}
//		System.out.println(sum);
		
		//출력
		//입력으로 주어진 숫자 N개의 합을 출력
		
		//예시
		//1
		//1
		//결과
		//1
		
		//5
		//54321
		//결과
		//15
		
		//25
		//700000000000000000000
		//결과
		//7
		
		//11
		//10987654321
		//결과
		//46
	}
}
