package com.ohgiraffers.kms.view;

import com.ohgiraffers.kms.controller.BookManager;
import com.ohgiraffers.kms.model.dto.BookDTO;

import java.util.Scanner;

public class BookMenu {

    Scanner sc = new Scanner(System.in);
    BookManager bm = new BookManager();

    public BookMenu() {}

    public void menu() {
        while (true) {
            System.out.println("==== 도서관리 프로그램 메인 메뉴 ====");
            System.out.println("1. 도서 추가 ");
            System.out.println("2. 도서 삭제 ");
            System.out.println("3. 도서 검색 ");
            System.out.println("4. 도서 목록 ");
            System.out.println("9. 프로그램 종료");
            System.out.print("원하시는 메뉴를 입력하세요 : ");
            int num = sc.nextInt();
            switch (num) {
                case 1 :
                    bm.addBook(inputBook());
                    break;
                case 2 :
                    bm.deleteBook(inputBookNumber());
                    break;
                case 3 :
                    bm.printBook(bm.searchBook(inputBookTitle()));
                    break;
                case 4 :
                    bm.sortedBookList(printAll());
                    bm.displayAll(); break;
                case 9 :
                    System.out.println("도서관리 프로그램을 종료합니다."); break;
                default:
                    System.out.println("잘 못된 메뉴입니다. 다시 선택해 주세요"); break;
            } if (num == 9) {
                break;
            }

        }

    }

    public BookDTO inputBook() {
        BookDTO bookDTO = new BookDTO();
        System.out.print("도서 번호 : ");
        int inBNo = sc.nextInt();
        bookDTO.setbNo(inBNo);
        System.out.print("도서분류코드 : ");
        int inCategory = sc.nextInt();
        bookDTO.setCategory(inCategory);
        System.out.print("도서 제목 : ");
        sc.nextLine();
        String inTitle = sc.nextLine();
        bookDTO.setTitle(inTitle);
        System.out.print("도서 저자 : ");
        String inAuthor = sc.nextLine();
        bookDTO.setAuthor(inAuthor);

        return bookDTO;
    }

    public String inputBookTitle() {
        System.out.print("검색할 도서 제목을 입력하세요 : ");
        String scTilte = sc.nextLine();
        return scTilte;
    }

    public int inputBookNumber() {
        System.out.print("삭제할 도서 번호를 입력하세요 : ");
        int delBookNum = sc.nextInt();
        return delBookNum;
    }

    public int printAll() {
        System.out.println("===== 도서 목록 메뉴 ====");
        System.out.println("1. 오름차순 ");
        System.out.println("2. 내림차순 ");
        System.out.print("원하는 정렬 방법의 번호를 입력하세요 : ");
        int num = sc.nextInt();

        return num;
    }
}
