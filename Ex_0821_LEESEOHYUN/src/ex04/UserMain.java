package ex04;

import java.util.ArrayList;
import java.util.Scanner;


public class UserMain {
	public static void main(String[] args) {
		
	ArrayList<UserInfo> user = new ArrayList<UserInfo>();
	
		outer:while(true) {
		System.out.print("아이디 생성 : ");		
		Scanner sc = new Scanner(System.in);
		UserInfo ui = new UserInfo();
		ui.setId(sc.next());
		
		for(int i = 0; i < user.size(); i++){
			if(ui.getId().equals(user.get(i).getId())){
				System.out.println("아이디가 중복됩니다.");
				continue outer;
				}
			}
		System.out.print("패스워드 입력 : ");
		Scanner sc2 = new Scanner(System.in);
		ui.setPwd(sc2.nextInt());
		
		user.add(ui);
		
		for(int i = 0; i < user.size();i++) {
			System.out.println(user.get(i).getId());
			System.out.println(user.get(i).getPwd());
			System.out.println("------------------------");
		}
		
		
		}
	}
}

