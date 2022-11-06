package com.company.객체지향프로그램;

class Book {
    String title;
    String autor;

    public Book(String title, String autor) {
        this.title = title;
        this.autor = autor;
    }
    public Book(String title){
        this(title, "작자미상");
    }

    public void show(){
        System.out.println(title +" " + autor);
    }

    public static void main(String[] args) {
        Book littlePrince = new Book("어린왕자", "생텍쥐페리");
        Book loveStory = new Book("춘향전");

        littlePrince.show();
        loveStory.show();
    }
}
