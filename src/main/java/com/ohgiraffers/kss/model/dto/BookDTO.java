package com.ohgiraffers.kss.model.dto;

public class BookDTO {

    private int bNo;
    private int category;
    private String title;
    private String author;

    public BookDTO() {}

    public BookDTO(int category, String title, String author) {

        this.category = category;
        this.title = title;
        this.author = author;

    }


    public void setBNo(int bNo) {

        this.bNo = bNo;

    }

    public void setCategory(int category) {

        this.category = category;

    }

    public void setTitle(String title) {

        this.title = title;

    }

    public void setAuthor(String author) {

        this.author = author;

    }

    public int getbNo() {

        return bNo;

    }

    public int getCategory() {

        return category;

    }

    public String getTitle() {

        return title;

    }

    public String getAuthor() {

        return author;

    }

    @Override
    public String toString() {

        String str = null;

        switch (category) {
            case 1 :
                str = "인문";
                break;
            case 2 :
                str = "자연과학";
                break;
            case 3 :
                str = "의료";
                break;
            case 4:
                str = "기타";
                break;
        }

        return "BookDTO : [bNo : " + bNo +
                ", category : " + str +
                ", title : " + title +
                ", author : " + author +
                ']';
    }
}
