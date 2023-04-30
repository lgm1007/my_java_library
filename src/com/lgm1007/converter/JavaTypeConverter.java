package com.lgm1007.converter;

import java.util.*;

public class JavaTypeConverter {

    /**
     * List<Integer> 안에 있는 Integer 요소들을 int 타입으로 변환해주는 함수
     * @author lgm1007
     * @param list
     * @return int
     */
    public static int convertListToInteger(List<Integer> list) {
        String s = "";
        for (Integer i : list) {
            s += i;
        }
        return Integer.parseInt(s);
    }

}
