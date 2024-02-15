package com.ohgiraffers.test.controller;

import com.ohgiraffers.hw2.model.comparator.AscCategory;
import com.ohgiraffers.hw2.model.comparator.DescCategory;
import com.ohgiraffers.test.model.dto.BookDTO;

import java.util.ArrayList;
import java.util.Collections;

public class BookManager {

    /* 기본생성자 -> ArrayList<BookDTO> 인스턴스 생성*/
    ArrayList<BookDTO> bookDTOArrayList;
    public BookManager() {
        bookDTOArrayList = new ArrayList<>();
    }


    /* 전달받은 BookDTO 객체를 생성자시 선언한 ArrayList 객체 추가*/
    public void addBook(BookDTO book) {
        bookDTOArrayList.add(book);
    }

    /* 전달받은 도서 번호로 ArrayList 안에 있는 정보 삭제 */
    public void deleteBook(int index) {
        for (int i = 0; i < bookDTOArrayList.size(); i++) {

            if (bookDTOArrayList.get(i).getbNo() == index) {

                System.out.println(bookDTOArrayList.get(i) + " 도서를 삭제 했습니다.");
                System.out.println("초기메뉴로 들어갑니다.");
                bookDTOArrayList.remove(i);
                return;
            } else if (i + 1 == bookDTOArrayList.size()) {
                System.out.println("도서 목록에 없는 도서 번호 입니다.");
            }
        }
    }

    /* 전달받은 도서 제목으로 도서를 검색하고 결과값 반환 */
    public int searchBook(String title) {
        int serchNum = 0;
        for (int i = 0; i < bookDTOArrayList.size(); i++) {
            if (bookDTOArrayList.get(i).getTitle().equals(title)) {

                serchNum = i;
            } else {
                System.out.println("도서 목록에 없는 도서 제목 입니다.");
                break;
            }
        }
        return serchNum;
    }

    /* 전달받은 인덱스에 있는 도서정보 출력*/
    public void printBook(int index) {
        for (int i = 0; i < bookDTOArrayList.size(); i++) {
            if (bookDTOArrayList.get(i).getbNo() == index) {
                System.out.println(bookDTOArrayList.get(index));
            }
        }
    }

    /* 도서목록 전체 출력 */
    public void displayAll() {
//        printBookList(bookDTOArrayList);

        for (BookDTO bookDTO : bookDTOArrayList) {
            System.out.println(bookDTO);
        }
    }

    /* 전달받은 번호를 기준으로 해당 카테고리순으로 정렬해서 ArrayList<BookDTO>에 담아서 리턴 */
    public ArrayList<BookDTO> sortedBookList(int select) {

        switch (select) {
            // 오름차순
            case 1 :
                bookDTOArrayList.sort(new AscCategory());
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

        for (BookDTO bookDTO : br) {
            System.out.println(bookDTO);
        }
    }

    /* ArrayList<BookDTO> 전달 */
    public int initialBookDTO() {
        int sizeNum = bookDTOArrayList.size();
        return sizeNum;
    }

}
