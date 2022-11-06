package com.company.배열;
import java.util.*;

// 유진, 민준, 태민이의 c언어 자바 wsm 점수를 입력받고 이쁘게 출력하시오
public class ArrayExam03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score[][] = new int[3][3];
        for(int i = 0; i < score.length; i++){
            if (i == 0){
                System.out.print("유진이의 c언어 자바 wsm 점수를 각각 입력해주세요 > ");
            }else if (i == 1){
                System.out.print("민준이의 c언어 자바 wsm 점수를 각각 입력해주세요 > ");
            }else if (i == 2){
                System.out.print("태민이의 c언어 자바 wsm 점수를 각각 입력해주세요 > ");
            }
            for(int j = 0; j < score.length; j++){
                score[i][j] = scan.nextInt();
            }
        }
        System.out.println("=================================");
        System.out.println("이름  c언어  자바  wsm  총점  평균");
        for(int i = 0; i < score.length; i++){
            if(i == 0) {
                System.out.print("유진  ");
            }else if(i == 1){
                System.out.print("민준  ");
            }else if(i == 2){
                System.out.print("태민  ");
            }
            int total = 0;
            double avg = 0;
            for(int j = 0; j < score.length; j++) {
                total += score[i][j];
                System.out.print(score[i][j] + "  ");
            }
            avg = total / score.length;
            System.out.print(total +"  "+ avg);
            System.out.println();
        }
    }
}
