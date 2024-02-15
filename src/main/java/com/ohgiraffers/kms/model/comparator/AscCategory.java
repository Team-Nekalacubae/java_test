package com.ohgiraffers.kms.model.comparator;

import com.ohgiraffers.kms.model.dto.BookDTO;

import java.util.Comparator;

public class AscCategory implements Comparator<BookDTO> {
    @Override
    public int compare(BookDTO o1, BookDTO o2) {
        int result = 0;

        if (o1.getCategory() > o2.getCategory()) {

            result = 1;     // 크면 양수 반환
        } else if (o1.getCategory() < o2.getCategory()) {

            result = -1;    // 작으면 음수 반환
        } else {

            result = 0;     // 같으면 0 반환
        }
        return 0;
    }
}
