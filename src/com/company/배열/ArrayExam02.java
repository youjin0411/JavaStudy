package com.company.배열;
import java.util.*;
//배열을 생성하여 원하는 개수만큼 넣은 후 입력한 수들 중 최댓값과 최소값을 구한 후 두 수의 최대공약수를 구하시오.

public class ArrayExam02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("원하는 배열의 개수를 입력하시오 > ");
        int numcount = scan.nextInt();
        int array[] = new int[numcount];
        int result = 0;

        System.out.print(array.length + "의 개수만큼 숫자를 입력하시오 > ");
        for(int i = 0; i < array.length; i++){
            array[i] = scan.nextInt();
        }
        int max = array[0];
        int min = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
            if(array[i] < min){
                min = array[i];
            }
        }
        System.out.println("최대값 : "+ max);
        System.out.println("최소값 : " + min);

        do{
            result = max % min;
            max = min;
            min = result;
        }while (result != 0);
        System.out.println("최대공약수 : " + max);

    }
}
