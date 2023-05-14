package com.lgm1007.graphtraveler;

import java.util.*;

public class GraphTraveler {

    /**
     * DFS 메서드
     * @param graph : 노드의 연결 정보를 저장한 이중 행렬
     * @param start : 방문을 시작하는 최상단 노드
     */
    public static void dfs(int[][] graph, int start) {
        boolean[] visited = new boolean[graph.length];
        Stack<Integer> stack = new Stack<>();

        visited[start] = true;
        stack.push(start);

        while(!stack.empty()) {
            int current = stack.pop();
            System.out.println(current + " ");

            for(int i = 0; i < graph.length; i++) {
                // 현재 노드와 노드 i가 인접해있고, 노드 i를 방문한 적이 없는 경우
                if(graph[current][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    stack.push(i);
                }
            }
        }
    }

    /**
     * BFS 메서드
     * @param graph : 노드의 연결 정보를 저장한 이중 행렬
     * @param start : 방문을 시작하는 최상단 노드
     */
    public static void bfs(int[][] graph, int start) {
        boolean[] visited = new boolean[graph.length];
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        while(!queue.isEmpty()) {
            int current = queue.poll();
            System.out.println(current + " ");

            for(int i = 0; i < graph.length; i++) {
                if(graph[current][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }
}