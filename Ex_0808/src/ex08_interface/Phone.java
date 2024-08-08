package ex08_interface;

public interface Phone {

	//상수
	//값을 한 번 넣어높으면 대입이 불가능하다.
	//상수명은 대문자로 작성한다.
	public static final int Max_BATTERY_CAPACITY = 100;
	
	//추상메서드
	//abstract 가 없어도 추상메서드만 쓸 수 있어서 상관 x
	
	abstract void powerOn();
	void powerOff()	;
	boolean isOn();
	void watchUtube();
	void charge();
	//인터페이스도 마찬가지로 추상 메서드가 비어있기 때문에 객체 생서을 스스로 할 수 없다
	//따라서 인터페이스도 자신이 가지고 있는 추상메서드를 구현해줄 클래스를
	//작성해야만 한다.
	//인터페이스를 구현해주는 클래스를 '구현 클래스'라고 한다.
	
	
	
}
