package ex01;

import java.util.Random;

public class Ex03 {
	public static void main(String[] args) {
		Random rnd = new Random();
		int n = (rnd.nextInt(500)+1)*10;
		int [] arr = {500,100,50,10};
		System.out.println(n + "원");
		for(int i = 0; i <arr.length;i++) {
			System.out.println(arr[i] + "원 : " + (n/arr[i]) + "개");
			n = n % arr[i];
		}
	}
}
