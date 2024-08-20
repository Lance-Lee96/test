package ex02_Enum;

public enum Season {
	//상수 하나하나를 객체라고 보면 된다.
	//1. 생성자에 값을 전달하는 것과 같은 원리
	SPRING("봄","spring"),
	SUMMER("여름","summer"),
	FALL("가을","fall"),
	WINTER("겨울","winter");
	
	
	//3.필드에 전달된다
	private String season;
	private String e_season;
	
	
	//2.전달한 값을 생성자를 통해서 받고
	private Season(String season,String e_season){
		this.season = season;
		this.e_season = e_season;
	}
	
	//getter
	public String getSeason() {
		return season;
	}
	
	public String getE_season() {
		return e_season;
	}
	
	
	
}
