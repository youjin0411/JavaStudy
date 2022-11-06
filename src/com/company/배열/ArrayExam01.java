package com.company.배열;

public class ArrayExam01 {
    public static void main(String[] args) {
        int [][]score = {
                {100, 100, 100},
                {20, 20, 20},
                {30, 30, 30},
                {40, 40, 40},
                {50, 50, 50}
        };
        int korTotal = 0;
        int engTotal = 0;
        int mathTotal = 0;
        System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
        System.out.println("==========================");

        for(int i = 0; i < score.length; i++){
            int sum = 0;
            float avg = 0.0f;

            korTotal += score[i][0];
            engTotal += score[i][1];
            mathTotal += score[i][2];
            System.out.print(i+1+"\t");

            for(int j = 0; j < score[i].length; j++){
                sum += score[i][j];
                System.out.print(score[i][j] + "\t");
            }
            avg = sum/(float)score[i].length;
            System.out.print(sum + "\t" + avg +"\n");
        }

        System.out.println("==========================");
        System.out.print("총점\t"+korTotal+"\t"+engTotal+"\t"+mathTotal+"\n");
    }
}
