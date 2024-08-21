package ex05;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex04_stream {
	public static void main(String[] args) {
		Integer[] nums = {1,44,33,21,36,68,88,4,5,6,1,1,1,2,2,2};
		//1.스트림 객체 만들기
		Stream<Integer> stream = Arrays.stream(nums);
		//2.중간연산
		stream.distinct().sorted().limit(5).forEach(x-> System.out.printf(x + " "));
		System.out.println();
		System.out.println(Arrays.toString(nums));
		
		IntStream intStream = IntStream.rangeClosed(1, 10);
		intStream.skip(3).limit(5).forEach(x -> System.out.print(x +" "));
		
		System.out.println();
		IntStream intStream2 = IntStream.of(1,2,2,3,3,4,5,5,6,7,8,9,10);
		
		//2 4 6 8 10
		intStream2.distinct().filter(x -> x%2 == 0 ).forEach(x -> System.out.print(x + " "));
		System.out.println();
		//문자열의 길이가 3이상인 것만 출력하기
		Stream.of("ab", "a", "abc", "abcd", "abcdef", "abcdefg").distinct().filter(x -> x.length() >= 3).forEach(x-> System.out.print(x + " "));
		
		
		
	}
}
