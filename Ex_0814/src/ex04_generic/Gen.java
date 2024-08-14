package ex04_generic;

public class Gen <T> {
	public static <T> void printArr(T[] t) {
		for(int i = 0; i < t.length;i++) {
			System.out.print(t[i] + " ");
		}
		System.out.println();
		
	}
}
