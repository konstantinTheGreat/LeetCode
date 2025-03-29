package medium;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _200 {
    public int numIslands(char[][] grid) {

        int islands = 0;
        Set<List<Integer>> visited = new HashSet<>();
        int visitedLength = 0;
        for (int i = 0; i < grid.length; i++) {

            for (int j = 0; j < grid[i].length ; j++) {
                dfs(grid, i, j, visited);

                if (visitedLength != visited.size() && grid[i][j] != '0' ) {
                    islands++;
                    visitedLength = visited.size();
                }
                visitedLength = visited.size();
            }
        }

        return islands;

    }

    public void dfs (char [][] grid, int row, int column, Set<List<Integer>> visited) {
        if (visited.contains(List.of(row, column))) {
            return;
        }
        if (grid[row][column] == '0') {
            visited.add(List.of(row, column));
            return;
        }

        visited.add(List.of(row, column));
        if (row + 1 < grid.length ) {
            dfs(grid, row + 1, column, visited);
        }

        if (row - 1 >= 0) {
            dfs(grid, row - 1, column, visited);
        }

        if (column + 1 < grid[row].length) {
            dfs(grid, row, column + 1, visited);
        }

        if (column - 1 >= 0) {
            dfs(grid, row, column - 1, visited);
        }
    }

}


// for better space complexity, we can change the 1's to 0's as we visit them