package 과제2;
import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		String str[] = {"가위","바위","보"};
		
		do {
			int n =(int)(Math.random()*3);
			System.out.print("가위 바위 보! >>");
			String user = scn.next();
			
			if(user.equals("그만")) {
				System.out.println("게임을 종료합니다.");
				break;
			}
			
			else if(user.equals(str[n])) {
				System.out.println("사용자 = " + user + ", 컴퓨터 = " + str[n] + ", 비겼습니다.");
			}
			else if(user.equals("가위")) {
				if(n==1) System.out.println("사용자 = " + user + ", 컴퓨터 = " + str[n] + ", 사용자가 졌습니다.");
				else System.out.println("사용자 = " + user + ", 컴퓨터 = " + str[n] + ", 사용자가 이겼습니다.");
			}
			else if(user.equals("바위")) {
				if(n==0) System.out.println("사용자 = " + user + ", 컴퓨터 = " + str[n] + ", 사용자가 졌습니다.");
				else System.out.println("사용자 = " + user + ", 컴퓨터 = " + str[n] + ", 사용자가 이겼습니다.");
			}
			else {
				if(n==0) System.out.println("사용자 = " + user + ", 컴퓨터 = " + str[n] + ", 사용자가 졌습니다.");
				else System.out.println("사용자 = " + user + ", 컴퓨터 = " + str[n] + ", 사용자가 이겼습니다.");
			}
		}while(true);
	}

}
