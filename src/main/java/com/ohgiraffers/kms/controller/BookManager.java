package com.ohgiraffers.kms.controller;

import com.ohgiraffers.kms.model.comparator.AscCategory;
import com.ohgiraffers.kms.model.comparator.DescCategory;
import com.ohgiraffers.kms.model.dto.BookDTO;

import java.util.ArrayList;
import java.util.Collections;

public class BookManager {

    /* 기본생성자 -> ArrayList<BookDTO> 인스턴스 생성*/
    public BookManager() {}
    ArrayList<BookDTO> bookDTOArrayList = new ArrayList<>();

    /* 전달받은 BookDTO 객체를 생성자시 선언한 ArrayList 객체 추가*/
    public void addBook(BookDTO book) {
        bookDTOArrayList.add(book);
    }

    /* 전달받은 도서 번호로 ArrayList 안에 있는 정보 삭제 */
    public void deleteBook(int index) {
        int getIndex = bookDTOArrayList.indexOf(index);
        bookDTOArrayList.remove(getIndex);
    }

    /* 전달받은 도서 제목으로 도서를 검색하고 결과값 반환 */
    public int searchBook(String title) {
        int serchNum = bookDTOArrayList.indexOf(title);
        return serchNum;
    }

    /* 전달받은 인덱스에 있는 도서정보 출력*/
    public void printBook(int index) {
        System.out.println(bookDTOArrayList.get(index));
    }

    /* 도서목록 전체 출력 */
    public void displayAll() {
        printBookList(bookDTOArrayList);
//        System.out.println(bookDTOArrayList);
    }

    /* 전달받은 번호를 기준으로 해당 카테고리순으로 정렬해서 ArrayList<BookDTO>에 담아서 리턴 */
    public ArrayList<BookDTO> sortedBookList(int select) {

        switch (select) {
                // 오름차순
            case 1 :
                Collections.sort(bookDTOArrayList, new AscCategory());
                break;
                // 내림차순
            case 2 :
                Collections.sort(bookDTOArrayList, new DescCategory());
                break;
        }
        return bookDTOArrayList;
    }

    /* 전달받은 ArrayList<BookDTO>를 향상된 for문을 이용하여 출력 */
    public void printBookList(ArrayList<BookDTO> br) {

        for (BookDTO bookDTO : bookDTOArrayList) {
            System.out.println(bookDTO);
        }
    }
}
