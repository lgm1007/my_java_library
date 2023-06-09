package com.lgm1007;

import com.lgm1007.converter.JavaTypeConverter;
import com.lgm1007.graphtraversal.GraphTraversal;
import com.lgm1007.sorter.JavaSorter;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ConvertTest convertTest = new ConvertTest();
        SortTest sortTest = new SortTest();
        GraphTravelerTest graphTravelerTest = new GraphTravelerTest();

        graphTravelerTest.bfsTest();
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

        public void reverseQueueTest() {
            Queue<Integer> queue = new LinkedList<>();
            queue.add(1);
            queue.add(2);
            queue.add(3);
            queue.add(4);
            queue.add(5);
            System.out.println(queue);

            Queue<Integer> reverseQueue = converter.reverseQueue(queue);
            System.out.println(reverseQueue);
        }

        public void convertListToIntegerTest() {
            List<Integer> list = List.of(7, 5, 3, 2, 1);
            int i = converter.convertListToInteger(list);

            System.out.println(i);
        }
    }

    public static class SortTest {
        JavaSorter sorter;

        public SortTest() {
            this.sorter = new JavaSorter();
        }

        public void sortListAscTest() {
            List<Integer> list = new ArrayList<>();
            list.add(4);
            list.add(5);
            list.add(3);
            list.add(2);
            list.add(2);
            list.add(8);
            list.add(6);
            System.out.println(list);

            sorter.sortListAscending(list);
            System.out.println(list);
        }

        public void sortListDescTest() {
            List<Integer> list = new ArrayList<>();
            list.add(4);
            list.add(5);
            list.add(3);
            list.add(2);
            list.add(2);
            list.add(8);
            list.add(6);
            System.out.println(list);

            sorter.sortListDescending(list);
            System.out.println(list);
        }

        public void sortArrayAscTest() {
            String[] array = {"cherry", "grape", "pear", "pineapple", "apple", "melon", "blueberry", "banana", "apricot"};
            for (String s: array) {
                System.out.print(s + " ");
            }
            System.out.println();

            sorter.sortArrayAscending(array);
            for (String s: array) {
                System.out.print(s + " ");
            }
        }

        public void sortArrayDescTest() {
            String[] array = {"cherry", "grape", "pear", "pineapple", "apple", "melon", "blueberry", "banana", "apricot"};
            for (String s: array) {
                System.out.print(s + " ");
            }
            System.out.println();

            sorter.sortArrayDescending(array);
            for (String s: array) {
                System.out.print(s + " ");
            }
        }
    }

    public static class GraphTravelerTest {
        GraphTraversal graphTraversal;

        public GraphTravelerTest() {
            this.graphTraversal = new GraphTraversal();
        }

        public void dfsTest() {
            int[][] graph = {{0,1,1,0},
                            {1,0,0,1},
                            {1,0,0,1},
                            {0,1,1,0}};

            System.out.print("DFS: ");
            graphTraversal.dfs(graph, 0);
        }

        public void bfsTest() {
            int[][] graph = {{0,1,1,0},
                            {1,0,1,1},
                            {1,1,0,1},
                            {0,1,1,0}};

            System.out.print("BFS: ");
            graphTraversal.bfs(graph, 0);
        }
    }
}
