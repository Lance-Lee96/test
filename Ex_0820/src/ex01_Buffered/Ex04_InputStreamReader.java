package ex01_Buffered;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Ex04_InputStreamReader {
	public static void main(String[] args) {
		FileInputStream in = null;
		InputStreamReader is = null;
		try {
			in = new FileInputStream("D:\\web0900_lsh\\1.java\\work/test.txt");
			is = new InputStreamReader(in,"UTF-8");
			int read = 0;
			
			while((read = is.read()) != -1) {
				System.out.print((char)read);
			}
			
			is.close();
			in.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
