package ex02_Enum;

public class OperationMain {
	public static void main(String[] args) {
		double x = 2.5;
		double y = 5.0;
		System.out.println("결과");
		Operation[] opers = Operation.values();
		for(Operation oper : opers) {
			System.out.printf("%.1f %s %.1f = %.1f\n",x, oper.getOp(),y, oper.apply(x, y));
		}
	}
}
