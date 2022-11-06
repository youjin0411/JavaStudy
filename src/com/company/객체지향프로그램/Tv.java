package com.company.객체지향프로그램;

class Tv {
    String color;
    boolean power;
    int chaanel;

    public void power(){
        power = !power;
    }
    public void chaanerUp(){
        chaanel++;
    }
    public void chaanerDown(){
        chaanel--;
    }
}
