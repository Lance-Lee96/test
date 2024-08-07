package ex05_final;

public class BookMain {
	public static void main(String[] args) {
		Comic comic = new Comic("포켓몬", "미상", true);
		//final로 선언된 메서드를 오버라이드 하는것은 안되지만
		//사용하는 건 가능하다.
		comic.info_title();
		comic.info_color();
		comic.info_author();
		
	}
}
