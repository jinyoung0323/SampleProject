package com.javaex.problem04;

public class CConverterApp {

    public static void main(String[] args) {

        double dollar;
        double won;
        
        CConverter.setRate(1099.00);
        
        dollar = CConverter.toDoller(1000000);
        won = CConverter.toKRW(100);
        
        //�鸸���� �޷��� ���
        System.out.println("100������ " + dollar + "�޷��Դϴ�.");
        
        //100�޷��� ������ ���
        System.out.println("100�޷��� " + won + "���Դϴ�.");
        
        
    }

}
