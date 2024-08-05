package ex03_method;

public class MidTerm {
	//두 학생들의 점수가 두 개 들어있는 배열을 전달 받아
	//총 합을 구하여 반환하는 score 메서드 만들기
	
	//MidTermMain에서 두 학생의 성적을 비교하여
	//누가 더 높은지 출력하기
	public int score(int [] scores) {
		
		int sum = 0;
		for (int i : scores) {
			sum += i;
			
		}
		return sum;
	}
}
