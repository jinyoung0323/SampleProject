package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class AccountManager {
	
	
	private List<Account> alist;
	
	private int balance;
	private int depositMoney;
	private int withdrawMoney;
	private String accountNo;
	private String name;
	private String phoneNo;
	Account account = new Account();
	String path;
	
	SimpleDateFormat now = new SimpleDateFormat("yyyy-MM-dd");
    Date time = new Date();
    String today = now.format(time);

	public AccountManager() {
		alist = new ArrayList<Account>();

//		alist = getList();
	}

	// 시작준비 (시작화면 출려과 리스트 가져온다)
	public void showTitle() {
		// 타이틀 출력
		System.out.println("******************************************");
		System.out.println("*            계좌 관리 프로그램               *");
		System.out.println("******************************************");
	}

	// 계좌 생성
	public void createAccount() {
		Scanner sc = new Scanner(System.in);
		System.out.print("계좌 번호를 입력해주세요 : ");
		accountNo = sc.nextLine();
		account.setAccountNo(accountNo);
		path = "D:\\workspace2\\SampleProjects\\" + accountNo + ".txt";
		File file = new File(path);
		try {
			if (!file.exists()) {
				System.out.print("이름 입력 : ");
				name = sc.nextLine();

				System.out.print("연락처 입력 : ");
				phoneNo = sc.nextLine();

				file.createNewFile();

				// 리스트에 추가하기
				account.setAccountNo(accountNo);
				account.setName(name);
				account.setPhoneNo(phoneNo);

				alist.add(account);
				saveList();
				showMenu();
			} else {
				System.out.println("계좌가 이미 존재합니다.");
				showMenu();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		sc.close();
	}
	

	// 리스트를 파일에 저장한다.
	public void saveList() {

		try {
			Writer fw = new FileWriter(path);
			BufferedWriter bw = new BufferedWriter(fw);

			// 문자열 만들기
//			String str = "";
//			for (int i = 0; i < alist.size(); i++) {
//				str += alist.get(i).getAccountNo() + ",";
//				str += alist.get(i).getName() + ",";
//				str += alist.get(i).getPhoneNo() + "\n";
//			}
			// 문자열 저장
			bw.write(account.toString());
			bw.flush();

//			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	

	// 메뉴 출력과 입력을 받는다.
	public int showMenu() {
		Scanner sc = new Scanner(System.in);
		int menuNum;
		System.out.println("");
		System.out.println("-----------------------------------------------");
		System.out.println("1. 예금 | 2. 출금 | 3. 잔액 | 4. 거래내역조회 | 5. 종료");
		System.out.println("-----------------------------------------------");
		System.out.print("번호입력> ");
		menuNum = sc.nextInt();
//		sc.nextLine();
		sc.close();
		return menuNum;

	}

	// 1. 예금
	public void deposit() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입금하실 금액을 입력해주세요 : ");
		while (true) {
			depositMoney = sc.nextInt();

			if (depositMoney <= 0) {
				System.out.println("0원보다 큰 숫자를 입력해주세요.");
				continue;
			} else {
				account.balance += depositMoney;
				break;
			}
		}
		
		// 예금한 것을 txt파일에 저장
		try {
			Writer fw = new FileWriter(path);
			BufferedWriter bw = new BufferedWriter(fw);
			
		    System.out.println(today);

			// 문자열 만들기
			String str = "";
			for (int i = 0; i < alist.size(); i++) {
				str += alist.get(i) + today + ",";
				str += alist.get(i) + Integer.toString(depositMoney) + ",";
				str += alist.get(i) + Integer.toString(0) + ",";
				str += alist.get(i).getBalance() + "\n";
			}
			// 문자열 저장
			bw.write(str);
			bw.flush();

			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		sc.close();
	}

	// 2. 출금
	public void withdraw() {
		Scanner sc = new Scanner(System.in);
		System.out.print("출금하실 금액을 입력해주세요 : ");
		withdrawMoney = sc.nextInt();

		if (withdrawMoney > account.balance) {
			System.out.println("잔액이 부족합니다. 다시 입력해주세요.");
			deposit();
		} else {
			account.balance -= withdrawMoney;
		}
		// 출금한 것을 txt파일에 저장
		try {
			Writer fw = new FileWriter(path);
			BufferedWriter bw = new BufferedWriter(fw);
			
		    System.out.println(today);

			// 문자열 만들기
			String str = "";
			for (int i = 0; i < alist.size(); i++) {
				str += alist.get(i) + today + ",";
				str += alist.get(i) + Integer.toString(0) + ",";
				str += alist.get(i) + Integer.toString(withdrawMoney) + ",";
				str += alist.get(i).getBalance() + "\n";
			}
			// 문자열 저장
			bw.write(str);
			bw.flush();

			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		sc.close();
	}

	// 3. 잔액
	public void showBalance() {
		String fileLine = "";
		BufferedReader bufReader = null;
		try {
			bufReader = new BufferedReader(new FileReader(path));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
        String contents = "";
        try {
			while ((contents = bufReader.readLine()) != null) {
			  String[] s = contents.split(",");
			  fileLine = s[(s.length) - 1];
			}
			System.out.println(fileLine);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 4. 거래내역조회
	// 전체 리스트를 출력한다
	public void transactionCheck() {
		transactionCheck("");// 아래 메소드에 키워드값을 비워서 호출
	}

	// 키워드로 검색한 리스트를 출력한다
	public void transactionCheck(String keyword) {
		for (int i = 0; i < alist.size(); i++) {
			String serchName = alist.get(i).getName();
			if (serchName.contains(keyword)) {
				System.out.print(i + 1 + ".  ");
				System.out.print(alist.get(i) + today + ",");
				System.out.print(alist.get(i) + Integer.toString(depositMoney) + ",");
				System.out.print(alist.get(i) + Integer.toString(withdrawMoney) + ",");
				System.out.print(alist.get(i).getBalance());
				System.out.println("");
			}
		}
	}

	// 5.종료
	public void showEnd() {
		
		System.out.println("<5.종료>");
		System.out.println("");
		System.out.println("******************************************");
		System.out.println("*                감사합니다                 *");
		System.out.println("******************************************");

	}

	// 파일을 읽어 리스트에 담아 전달한다.
//	private List<Account> getList() {
//		try {
//			Reader fr = new FileReader(path);
//			BufferedReader br = new BufferedReader(fr);
//
//			while (true) {
//				String line = br.readLine();
//				if (line == null) {
//					break;
//				}
//
//				String[] data = line.split(",");
//				today = data[0];
//				String dm = Integer.toString(depositMoney);
//				String wm = Integer.toString(withdrawMoney);
//				String b = Integer.toString(balance);
//				dm = data[1];
//				wm = data[2];
//				b = data[3];
//
////				Account account = new Account(today, dm, wm, balance);
//				alist.add(account);
//			}
//			br.close();
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//		return alist;
//	}

	
}
