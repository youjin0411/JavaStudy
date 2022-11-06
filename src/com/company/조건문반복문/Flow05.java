package com.company.조건문반복문;
import sun.security.ec.ECDSAOperations;

import java.util.*;

public class Flow05 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ';
        char opt = '0';

        System.out.print("점수를 입력해주세요. > ");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt(); //화면을 통해 입력받은 점수를 score에 저장

        System.out.println("당신의 점수는 "+ score + "입니다. ");

        if(score >= 90){
            grade ='A';
            if(score >= 98){
                opt = '+';
            }else if(score < 94) {
                opt = '-';
            }
        }else if(score >= 80){
            grade = 'B';
            if (score >= 88){
                opt ='+';
            }else if(score < 84){
                opt = '-';
            }
        }else{
            grade = 'C';
        }
        System.out.println("당신의 학점은 "+grade + opt +"입니다");
    }
}
