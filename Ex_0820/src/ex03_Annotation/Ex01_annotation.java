package ex03_Annotation;

@FunctionalInterface
interface B{
	void method();
}


@SuppressWarnings("removal")
class A{
	@Deprecated
	public void oldOne() {
		
	}
	
	
	Integer i = new Integer(0);
}




public class Ex01_annotation {
	public static void main(String[] args) {
		//@Override
		//컴파일러에게 재정의하는 메서드라는 것을 알린다.
		
		//@Deprecated 앞으로 사용되지 않을 것을 권장하는 대상에게 붙힌다.
		
		//@SuppressWarnings 경고를 무시함
	}
}
