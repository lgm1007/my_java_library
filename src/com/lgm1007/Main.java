package com.lgm1007;

import com.lgm1007.converter.JavaTypeConverter;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        JavaTypeConverter converter = new JavaTypeConverter();

        List<Integer> list = List.of(7, 5, 3, 2, 1);
        System.out.println(converter.convertListToInteger(list));
    }
}
