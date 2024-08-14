package ex01_set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Ex02_bingo {
	public static void main(String[] args) {
		//HashSet과 ArrayList를 이용해 5*5 랜덤 빙고판 만들기
		//1~50 난수 중 25개 넣기
		//ArrayList<Integer> list = new ArrayList<>();
		//Collections.shuffle(list); (리스트 객체만 가능)
		Random rnd = new Random();
		Set<Integer> hs = new HashSet<>();
		while (hs.size() <= 25) {
			hs.add(rnd.nextInt(50)+1);
		}
		
		
//		System.out.println(hs);
//		Iterator<Integer> iter = hs.iterator();
//		while(iter.hasNext()) {
//			int val = iter.next();
//			list.add(val);
//		}
//		//System.out.println(list);
//		Collections.shuffle(list);
//		for (int i = 1; i <= 25; i++ ) {
//			for(int j = 1; j<=5; j++) {
//				System.out.print(list.get(i) + " ");
//				
//			}
//			System.out.println();
//		}
//	}
	}}
