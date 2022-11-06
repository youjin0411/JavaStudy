package com.company.조건문반복문;
import java.util.*;

public class Flow11 {
    public static void main(String[] args) {
        System.out.print("당신의 주민번호를 입력하세요. (050101-1212112) 6자리-7자리> ");
        Scanner scan = new Scanner(System.in);

        String regNo = scan.nextLine();
        char gender = regNo.charAt(7); //입력받은 번호의 8번째 문자를 gender에 저장 (인덱스 0번부터)

        switch (gender){
            case '1': case '3':
                switch (gender){
                    case '1':
                        System.out.println("당신은 2000년 이전에 출생한 남자입니다. ");
                        break;
                    case '3':
                        System.out.println("당신은 2000년 이후에 출생한 남자입니다. ");
                        break;
                }
                break;
            case '2': case '4':
                switch (gender){
                    case '2':
                        System.out.println("당신은 2000년 이전에 출생한 여자입니다. ");
                    case '4':
                        System.out.println("당신은 2000년 이후에 출생한 여자입니다.");
                }
                break;
            default:
                System.out.println("유효하지 않은 주민등록번호입니다.");
        }
    }
}
