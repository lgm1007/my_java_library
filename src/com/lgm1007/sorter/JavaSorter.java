package com.lgm1007.sorter;

import java.util.*;

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

    /**
     * Array를 오름차순 정렬해주는 함수
     * @param array
     * @param <T>
     */
    public static <T extends Comparable<? super T>> void sortArrayAscending(T[] array) {
        Arrays.sort(array);
    }

    /**
     * Array를 내림차순 정렬해주는 함수
     * @param array
     * @param <T>
     */
    public static <T extends Comparable<? super T>> void sortArrayDescending(T[] array) {
        Arrays.sort(array, Comparator.reverseOrder());
    }
}
