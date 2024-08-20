package ex02_Enum;

public enum Transportation {
	//추상메서드가 정의되면 각각의 상수객체에서 구현해야한다.
	
	BUS(100){
		int totalFare(int distance) {
			return distance *fare;
		}
	},
	TRAIN(150) {
		@Override
		int totalFare(int distance) {
			// TODO Auto-generated method stub
			return distance *fare;
		}
	},
	SHIP(200) {
		@Override
		int totalFare(int distance) {
			// TODO Auto-generated method stub
			return distance *fare;
		}
	},
	AIRPLANE(250) {
		@Override
		int totalFare(int distance) {
			// TODO Auto-generated method stub
			return distance *fare;
		}
	};

	//열거형 상수 객체로부터 전달받은값을 필드에 전달
	protected final int fare;
	
	private Transportation(int fare) {
		// TODO Auto-generated constructor stub
		this.fare = fare;
	}
	
	abstract int totalFare(int distance);
	
	
	
}
