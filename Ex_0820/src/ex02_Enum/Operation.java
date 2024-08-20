package ex02_Enum;

public enum Operation {
	PLUS("+") {
		@Override
		public double apply(double x, double y) {
			// TODO Auto-generated method stub
			return x + y;
		}
	},
	MINUS("-") {
		@Override
		public double apply(double x, double y) {
			// TODO Auto-generated method stub
			return x - y;
		}
	},
	MULTI("*") {
		@Override
		public double apply(double x, double y) {
			// TODO Auto-generated method stub
			return x * y;
		}
	},
	DIVIDE("/") {
		@Override
		public double apply(double x, double y) {
			// TODO Auto-generated method stub
			return x / y;
		}
	};

	private String op ;
	
	Operation(String op) {
		this.op = op;
		
		// TODO Auto-generated constructor stub
	}
	
	public abstract double apply(double x, double y);

	public String getOp() {
		return op;
	}


	

	
}
