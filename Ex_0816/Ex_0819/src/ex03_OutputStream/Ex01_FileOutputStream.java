package ex03_OutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Ex01_FileOutputStream {
	public static void main(String[] args) {
		try {
			//이어쓰고 싶다면 FileOutputStream에 생성자에 두번째 인자로 true 를 전달한다.
			//파일이 없으면 만들어준다.
			//확장자를 마음대로 지정할 수 있다.
			FileOutputStream fos = new FileOutputStream("D:\\web0900_lsh\\1.java\\work/fileOut.html",true);
			
			//프로그램을 실행하면 아래의 메서드가 실행
			
			fos.write('j');
			fos.write('a');
			fos.write('v');
			fos.write('a');
			
			fos.write('\n');
			String msg = "fileOutput 예제입니다.\n";
			String msg2 = "여러줄도 가능\n";
			
			fos.write(msg.getBytes());
			fos.write(msg2.getBytes());
			fos.close();
			
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
