package ex04_Reader;

import java.io.FileReader;


public class Ex02_FileReader {
	public static void main(String[] args) {
		//특정경로에 reader.txt파일을 만들고 아무 내용이나 적는다.
		//reader. txt파일을 읽어서
		//알파벳 대문자와 소문자의 개수를 출력하세요
		//대문자 : X개
		//소문자 : X개
		
		int b = 0;
		int s = 0;
		try {
			FileReader	reader = new FileReader("D:\\web0900_lsh\\1.java\\work/reader.txt");
			
			int code = 0;
			
			while((code=reader.read()) != -1) {
				if(code >= 'A' && code <= 'Z') {
					b++;
				}
				if(code >='a' && code <= 'z') {
					s++;
				}
				System.out.println((char)code);
			}
			
			System.out.println("대문자 : " + b);
			System.out.println("소문자 : " + s);
			
			reader.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		} 
		
		
	 }
	}
	

