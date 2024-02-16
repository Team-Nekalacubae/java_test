package com.ohgiraffers.test.model.dto;

public class BookDTO {
    private int bNo;        // 도서 번호
    private int category;   // 도서 분류 코드
    private String title;   // 도서 제목
    private String author;  // 도서 저자

    public BookDTO() {}

    public BookDTO(int category, String title, String author) {
        this.category = category;
        this.title = title;
        this.author = author;
    }

    public int getbNo() {
        return bNo;
    }

    public void setbNo(int bNo) {
        this.bNo = bNo;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        String stringCategory;
        switch (category) {
            case 1 : stringCategory = category + " (인문)"; break;
            case 2 : stringCategory = category + " (자연과학)"; break;
            case 3 : stringCategory = category + " (의료)"; break;
            case 4 : stringCategory = category + " (기타)"; break;
            default: stringCategory = category + " (미분류)"; break;
        }
        // 출력문에 도서 번호 제거함
        return " [ 도서분류 : " + stringCategory + " / 도서제목 : " + title + " / 도서저자 : " + author + " ]";
    }
}
