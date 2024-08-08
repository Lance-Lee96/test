package ex07_test;

public class CalcMain {
	public static void main(String[] args) {
		Calculator gc = new GoodCalc();
		int a = gc.add(3, 5);
		System.out.println(a);
		int s = gc.substract(8, 2);
		System.out.println(s);
		int [] arr = {3,5,7,8};
		double d = gc.average(arr);
		System.out.println(d);
		
		
	}
}
