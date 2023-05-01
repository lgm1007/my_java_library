package com.lgm1007;

import com.lgm1007.converter.JavaTypeConverter;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ConvertTest testClass = new ConvertTest();

        testClass.convertListToArrayTest();
    }

    public static class ConvertTest {
        JavaTypeConverter converter = new JavaTypeConverter();

        public void convertListToArrayTest() {
            List<String> list = List.of("apple", "banana", "carrot");
            String[] array = converter.convertListToArray(list);

            System.out.println(array);
        }

        public void convertArrayToListTest() {
            String[] array = {"apple", "banana", "carrot"};
            List<String> list = converter.convertArrayToList(array);

            System.out.println(list);
        }

        public void convertParseToTest() {
            String str = "1.05";
            Double d = converter.parseTo(str, Double.class);

            System.out.println(d);
        }

        public void convertListToIntegerTest() {
            List<Integer> list = List.of(7, 5, 3, 2, 1);
            int i = converter.convertListToInteger(list);

            System.out.println(i);
        }
    }
}
