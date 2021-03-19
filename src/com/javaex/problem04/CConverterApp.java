package com.javaex.problem04;

public class CConverterApp {

    public static void main(String[] args) {

        double dollar;
        double won;
        
        CConverter.setRate(1099.00);
        
        dollar = CConverter.toDoller(1000000);
        won = CConverter.toKRW(100);
        
        //백만원을 달러로 출력
        System.out.println("100만원은 " + dollar + "달러입니다.");
        
        //100달려를 원으로 출력
        System.out.println("100달러는 " + won + "원입니다.");
        
        
    }

}
