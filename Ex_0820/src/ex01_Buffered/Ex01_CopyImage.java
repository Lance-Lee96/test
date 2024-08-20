package ex01_Buffered;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex01_CopyImage {
	public static void main(String[] args) {
		//보조스트림을 이용해서 이미지를 복사
		//wall_copy3.jpg 이름으로 복사하기
		FileInputStream readFile = null;
		BufferedInputStream bis = null;
		FileOutputStream out = null;
		BufferedOutputStream bos = null;
		try {
			readFile = new FileInputStream("D:\\web0900_lsh\\1.java\\work/wall_copy.jpg");
			out = new FileOutputStream("D:\\web0900_lsh\\1.java\\work/wall_copy3.jpg");
			bis = new BufferedInputStream(readFile);
			bos = new BufferedOutputStream(out);
			System.out.println("이미지 읽기 시작");
			while(bis.read() != -1) {
			}
			int code = 0;
			while((code = bis.read()) != -1) {
				bos.write(code);
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if(bos != null) bos.close();
				if(out != null) out.close();
				if(bis != null) bis.close();
				if(readFile != null) readFile.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
	}
}
