package com.company.조건문반복문;
import java.util.*;
public class Flow17 {
    public static void main(String[] args) {
        int num = 0;

        System.out.print("*을 출력할 라인을 입력해주세요 > ");
        Scanner scan = new Scanner(System.in);
        String tmp = scan.nextLine();
        num = Integer.parseInt(tmp); //입력받은 문자열 (tmp)을 숫자로 변환

        for(int i = 0; i < num; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
