package practice;

/*
 * 메인은 구조만 가지고 있고
 * 실제기능은 AccountManager 클래스에서 처리
*/

import java.io.IOException;
import java.util.Scanner;

public class AccountApp {

	public static void main(String[] args) throws IOException {

		// AccountManager 생성
		// 파일에서 데이터를 읽어오고, 스케너를 연결한다.
		AccountManager aManager = new AccountManager();
//		Scanner sc = new Scanner(System.in);

		// 타이틀 출력
		aManager.showTitle();
		aManager.createAccount();

		// while 시작
		boolean run = true;
		while (run) {
			// 메뉴 출력, 입력값 리턴
			int menuNum = aManager.showMenu();
			// switch() 시작
			switch (menuNum) {

			// 1. 예금
			case 1:
				aManager.deposit();
				break;
			// 2. 출금
			case 2:
				aManager.withdraw();
				break;
			// 3. 잔액
			case 3:
				aManager.showBalance();
				break;
			// 4. 거래내역조회
			case 4:
				aManager.transactionCheck();
				break;
			// 5. 종료
			case 5:
				run = false;
				break;
			// 없는 번호일때
			default:
				System.out.println("다시 입력해주세요");
				break;

			}// switch() 종료

		} // while 종료

		// 종료화면
		aManager.showEnd();
	}

}
