package com.javaex.problem07;
import java.util.Scanner;
public class AccountApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        int money;
        Account account = new Account("312-89562-123456");
        account.getAccountNo();
        while(run){
            System.out.println("");
            System.out.println("----------------------------");
            System.out.println("1.���� | 2.��� | 3.�ܰ� |4.����");
            System.out.println("----------------------------");
            System.out.print("����>");
            int menuNo = sc.nextInt();
            switch(menuNo){
                case 1:
                    System.out.print("���ݾ�>");
                    money = sc.nextInt();
                    account.deposit(money);
                    break;
                case 2:
                    System.out.print("��ݾ�>");
                    money= sc.nextInt();
                    account.withdraw(money);
                    break;
                case 3:
                    System.out.print("�ܰ��>");
                    account.showBalance();
                    break;
                case 4:
                    System.out.print("���α׷� ����");
                    run = false;
                    break;
                default :
                    System.out.println("�ٽ��Է����ּ���");
                    break;
            }//switch
        }//while
        sc.close();
    }
}