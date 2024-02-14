package com.ohgiraffers.kss.controller;

import com.ohgiraffers.kss.model.dto.BookDTO;
import com.ohgiraffers.kss.view.BookMenu;

import java.util.ArrayList;
import java.util.List;

public class BookManager {

    List<BookDTO> booklist;

    public BookManager() {

        booklist = new ArrayList<>();

    }

    public void addBook(BookDTO book) {

        booklist.add(book);

    }

    public void deleteBook(int index) {

        booklist.remove(index);

    }

    public int searchBook(String title) {

        for (int i = 0; i < booklist.toArray().length; i++) {
            System.out.println(booklist.get(i));
        }

        System.out.println(booklist.toArray().length);
        return 0;
    }

    public void printBook(int index) {

        Object[] temp = booklist.toArray();

        System.out.println(temp[index]);

    }

    public void displayAll() {

        System.out.println(booklist);

    }

    public ArrayList<BookDTO> sortedBookList(int select) {

        return null;
    }

    public void printBookList(ArrayList<BookDTO> br) {

        for (BookDTO bookDTO : booklist) {

            System.out.println(bookDTO);
        }

    }

}

