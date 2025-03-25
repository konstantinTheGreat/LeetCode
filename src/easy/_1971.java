package easy;


import java.util.*;

public class _1971  {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer, List<Integer>> graph = new HashMap<>();

        for (int[] edge : edges) {
            int leftNumber = edge[0];
            int rightNumber = edge[1];

            graph.computeIfAbsent(leftNumber, k -> new ArrayList<>()).add(rightNumber);
            graph.computeIfAbsent(rightNumber, k -> new ArrayList<>()).add(leftNumber);
        }

        Set <Integer> visited = new HashSet<>();

        return dfs(source, destination, graph, visited);
    }

    public boolean dfs (int source, int destination, Map<Integer, List<Integer>> graph, Set<Integer> visited) {
       if (source == destination) {
           return true;
       }
       visited.add(source);
       boolean path = false;
       for (int i = 0; i < graph.get(source).size(); i++) {
           if (!visited.contains(graph.get(source).get(i))) {
               path = dfs(graph.get(source).get(i), destination, graph, visited);
           }
           if (path){
               return true;
           }
       }

       return path;


       // union find is better
    }
}

