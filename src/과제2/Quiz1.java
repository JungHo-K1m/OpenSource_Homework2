package ����2;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Quiz1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print("���ϰ��� �ϴ� �� �� �Է�  >>");
			try {
				int n = s.nextInt();
				int m = s.nextInt();
				System.out.print(n + "x" + m + "=" +n*m);
				break;
			}
			catch(InputMismatchException e) {
				System.out.println("�Ǽ��� �Է��ϸ� �ȵ˴ϴ�.");
				s.nextLine();
			}
		}
	}

}
