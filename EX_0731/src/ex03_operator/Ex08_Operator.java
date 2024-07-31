package ex03_operator;
import java.util.Scanner;
public class Ex08_Operator {

	public static void main(String[] args) {
		// 과수원에서 배, 사과, 오렌지를 하루에 각각 5,7,5개씩 생산한다.
		//1. 과수원에서 하루에 생산되는 과일의 총 개수를 구하기
		//2. 시간당 총 생산량 구하기
		
		/*int p = 5, a = 7, o = 5;
		int day = p + a + o;
		System.out.printf("과수원에서 하루에 생산되는 과일의 총 개수 : %d\n", day);
		
		System.out.printf("시간당 총 생산 개수 : %f",(double)day / 24);
*/
		
		//상자 하나에는 농구공이 5개가 들어갈 수 있다.
		//만일 농구공이 23개라면 몇 개의 상자가 필요한가?
		/*Scanner sc = new Scanner(System.in);
		
		System.out.println("공의 개수를 입력하세요 : ");
		int ball = sc.nextInt();
		int box = 5;
		
		int result = ball % box == 0 ? ball / box : (ball / box) + 1;
		System.out.printf("필요한 박스의 개수는 %d 개 입니다.",result);
				*/
		
		//국어,영어,수학에 대한 점수를 키보드를 이용해 정수로 입력받고
		//1. 세 과목에 대한 합계 출력하기
		//2. 평균 출력하기
		//3. 세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데
		//세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상 일때 합격, 아니면 불합격
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수 : ");
		int kor = sc.nextInt();
		System.out.println("영어 점수 : ");
		int eng = sc.nextInt();
		System.out.println("수학 점수 : ");
		int mat = sc.nextInt();
		
		int total = kor + eng + mat;
		System.out.printf("세 과목의 총점은 %d입니다.\n",total);
		double avg = (double)total / 3.0;
		System.out.printf("평균은 %.1f 입니다.\n", avg);
		
		String result = kor >= 40 && eng >= 40 && mat >= 40 && avg >= 60 ? "합격" : "불합격";
		System.out.println("결과 : " + result);
		
	}

}
