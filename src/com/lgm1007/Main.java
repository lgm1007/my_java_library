package com.lgm1007;

import com.lgm1007.converter.JavaTypeConverter;

import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        ConvertTest testClass = new ConvertTest();

        testClass.reverseStackTest();
    }

    public static class ConvertTest {
        JavaTypeConverter converter;

        public ConvertTest() {
            this.converter = new JavaTypeConverter();
        }

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

        public void reverseStackTest() {
            Stack<Integer> stack = new Stack<>();
            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.push(4);
            stack.push(5);
            System.out.println(stack);

            Stack<Integer> reverseStack = converter.reverseStack(stack);
            System.out.println(reverseStack);
        }

        public void convertListToIntegerTest() {
            List<Integer> list = List.of(7, 5, 3, 2, 1);
            int i = converter.convertListToInteger(list);

            System.out.println(i);
        }
    }
}
