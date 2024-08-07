package ex01_super;

public class ComputerMain {
	public static void main(String[] args) {
		Samsung s = new Samsung(); 
			s.powerOn();
			s.poweroff();
			
			Computer c = new Computer();
			c.powerOn();
			c.poweroff();
		
	}
}
