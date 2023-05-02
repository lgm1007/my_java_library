package com.lgm1007.converter;

import java.util.*;

public class JavaTypeConverter {

    /**
     * List<T> 타입을 배열로 변환해주는 함수
     * @author lgm1007
     * @param list
     * @return T[]
     */
    public static <T> T[] convertListToArray(List<T> list) {
        T[] array = (T[]) new Object[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }

    /**
     * T[] Array 타입을 리스트로 변환해주는 함수
     * @author lgm1007
     * @param array
     * @return List<T>
     */
    public static <T> List<T> convertArrayToList(T[] array) {
        return Arrays.asList(array);
    }

    /**
     * 문자열을 T타입으로 변환해주는 함수
     * @author lgm1007
     * @param str
     * @param clazz
     * @return T
     */
    public static <T> T parseTo(String str, Class<T> clazz) {
        if (clazz == Integer.class) {
            return (T) Integer.valueOf(str);
        } else if (clazz == Double.class) {
            return (T) Double.valueOf(str);
        } else if (clazz == Boolean.class) {
            return (T) Boolean.valueOf(str);
        } else {
            throw new IllegalArgumentException("Unsupported class : " + clazz.getName());
        }
    }

    /**
     * 스택의 순서를 뒤바꿔주는 함수
     * @author lgm1007
     * @param stack
     * @return Stack<T>
     * @param <T>
     */
    public static <T> Stack<T> reverseStack(Stack<T> stack) {
        Stack<T> reverseStack = new Stack<>();
        while (!stack.isEmpty()) {
            reverseStack.push(stack.pop());
        }
        return reverseStack;
    }

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
