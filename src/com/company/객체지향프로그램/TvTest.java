package com.company.객체지향프로그램;

public class TvTest {
    public static void main(String[] args) {
        Tv t = new Tv();
        t.chaanel = 7;
        t.chaanerDown();
        System.out.println("현재 채널은 " + t.chaanel +"입니다");
    }
}
