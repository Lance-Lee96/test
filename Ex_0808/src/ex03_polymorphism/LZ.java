package ex03_polymorphism;

public class LZ	extends Computer {
	@Override
	public void powerOn() {
		super.powerOn();
		System.out.println("I love LZ");
	}
	
	@Override
	public void powerOff() {
		super.powerOff();
	}
}
