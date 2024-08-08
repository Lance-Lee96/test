package ex03_polymorphism;

public class Samsung extends Computer{
	
	@Override
	public void powerOn() {
		super.powerOn();
		System.out.println("I love Samsung");
	}

}
