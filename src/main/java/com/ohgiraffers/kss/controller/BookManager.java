package com.ohgiraffers.kss.controller;

import com.ohgiraffers.hw2.model.comparator.AscCategory;
import com.ohgiraffers.hw2.model.comparator.DescCategory;
import com.ohgiraffers.kss.model.dto.BookDTO;

import java.util.ArrayList;

public class BookManager {

    ArrayList<BookDTO> booklist;

    public BookManager() {

        booklist = new ArrayList<>();

    }

    public void addBook(BookDTO book) {

        booklist.add(book);

    }

    public void deleteBook(int index) {

        for (int i = 0; i < booklist.size(); i++) {

            if (booklist.get(i).getBNo() == index) {

                booklist.remove(i);

            }
        }
    }

    public int searchBook(String title) {

        int target = 0;

        for (int i = 0; i < booklist.size(); i++) {


            if (booklist.get(i).getTitle().equals(title)) {

                target = i;

            }

        }

        System.out.println("검색하신 " + title + "의 도서 번호는 " + booklist.get(target).getBNo() + ", 인덱스 번호는 " + target + "입니다.");

        return target;

    }

    public void printBook(int index) {

        Object[] temp = booklist.toArray();

        System.out.println(temp[index]);

    }

    public void displayAll() {

        for (BookDTO bookDTO : booklist) {

            System.out.println(bookDTO);

        }

    }

    public ArrayList<BookDTO> sortedBookList(int select) {

        switch (select) {
            case 1:
                booklist.sort(new AscCategory());
                break;
            case 2:
                booklist.sort(new DescCategory());
                break;
        }

        return booklist;
    }

    public void printBookList(ArrayList<BookDTO> br) {

        for (BookDTO bookDTO : br) {

            System.out.println(bookDTO);
        }

    }

}
