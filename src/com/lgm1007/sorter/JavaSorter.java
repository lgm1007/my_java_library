package com.lgm1007.sorter;

import java.util.Collections;
import java.util.List;

public class JavaSorter {

    /**
     * List를 오름차순 정렬해주는 함수
     * @param list
     * @param <T>
     */
    public static <T extends Comparable<? super T>> void sortListAscending(List<T> list) {
        Collections.sort(list);
    }

    /**
     * List를 내림차순 정렬해주는 함수
     * @param list
     * @param <T>
     */
    public static <T extends Comparable<? super T>> void sortListDescending(List<T> list) {
        list.sort(Collections.reverseOrder());
    }
}
