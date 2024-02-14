package com.ohgiraffers.kss.view;

import com.ohgiraffers.kss.controller.BookManager;
import com.ohgiraffers.kss.model.dto.BookDTO;

import java.util.Scanner;

public class BookMenu {

    public BookMenu() {
    }

    Scanner sc = new Scanner(System.in);
    BookManager bm = new BookManager();

    public void menu() {

        int num = 10;

        while (true) {

            System.out.println("===== 도서 관리 프로그램 =====");
            System.out.println("1. 도서 추가");
            System.out.println("2. 도서 삭제");
            System.out.println("3. 도서 검색");
            System.out.println("4. 도서 정보 출력");
            System.out.println("5. 도서목록 전체 출력");
            System.out.println("6. 도서분류코드 별 정렬");
            System.out.println("0. 종료");
            System.out.print("원하는 메뉴를 입력하세요 : ");

            num = sc.nextInt();

            switch (num) {
                case 1:
                    bm.addBook(inputBook());
                    break;
                case 2:
                    bm.deleteBook(inputDeleteBookNumber());
                    break;
                case 3:
                    bm.printBook(bm.searchBook(inputBookTitle()));
                    break;
                case 4:
                    bm.printBook(inputFindBookNumber());
                    break;
                case 5:
                    bm.displayAll();
                    break;
                case 6:
                    bm.printBookList(bm.sortedBookList(inputAscOrDesc()));

            }

            if (num == 0) {
                break;
            }
        }
    }

    public BookDTO inputBook() {

        BookDTO bookDTO = new BookDTO();

        System.out.print("도서 번호를 입력하세요 : ");
        int bNo = sc.nextInt();
        bookDTO.setBNo(bNo);
        System.out.print("도서분류코드를 입력하세요 (1:인문, 2:자연과학, 3:의료, 4:기타) : ");
        int category = sc.nextInt();
        bookDTO.setCategory(category);
        sc.nextLine();
        System.out.print("도서 제목을 입력하세요 : ");
        String title = sc.nextLine();
        bookDTO.setTitle(title);
        System.out.print("도서 저자를 입력하세요 : ");
        String author = sc.next();
        bookDTO.setAuthor(author);

        return bookDTO;

    }

    public String inputBookTitle() {

        System.out.print("검색할 도서 제목을 입력하세요 : ");
        sc.nextLine();
        String str = sc.nextLine();

        return str;

    }

    public int inputDeleteBookNumber() {

        System.out.print("삭제할 도서 번호를 입력하세요 : ");
        int num = sc.nextInt();

        return num;

    }

    public int inputFindBookNumber() {

        System.out.print("검색할 도서의 인덱스 번호를 입력하세요 : ");
        int num = sc.nextInt();

        return num;

    }

    public int inputAscOrDesc() {

        System.out.print("도서분류코드 별 정렬방법을 선택하세요 (1. 오름차순, 2. 내림차순) : ");
        int num = sc.nextInt();

        return num;
    }
}
