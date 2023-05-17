package com.lgm1007.graphtraversal;

import java.util.*;

public class GraphTraversal {

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
            System.out.print(current + " ");

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
            System.out.print(current + " ");

            for(int i = 0; i < graph.length; i++) {
                if(graph[current][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }

    /*
    파라미터로 받는 int[][] graph 값은 노드의 연결 정보를 담은 값이다.
    예를 들어 아래와 같은 graph 행렬이 있는 경우

    int[][] graph = {{0,1,1,0},
                     {1,0,0,1},
                     {1,0,0,1},
                     {0,1,1,0}};

    graph[0][1] = 1 이라는 의미는 노드 0과 노드 1이 연결되어 있다는 의미이며,
    graph[2][3] = 1 이라는 의미는 노드 2와 노드 3이 연결되어 있다는 의미이다.
    즉 해당 graph 에 해당하는 그래프를 그려보면 다음과 같다.

    0 -- 1
    |    |
    2 -- 3
     */
}
