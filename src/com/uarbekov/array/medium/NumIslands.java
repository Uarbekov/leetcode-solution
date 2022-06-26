package com.uarbekov.array.medium;

public class NumIslands {

    public static void main(String[] args) {
//        char grid[][] = {
//                {'1', '1', '0', '0', '0'},
//                {'1', '1', '0', '0', '0'},
//                {'0', '0', '1', '0', '0'},
//                {'0', '0', '0', '1', '1'}};
        char grid[][] = {{'1','0','1','1','0','1','1'}};
        System.out.println(numIslands(grid));
    }


    public static int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        int islandCounts = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                islandCounts = islandCounts + isIsland(grid, visited, i, j);
            }
        }
        return islandCounts;
    }

    public static int isIsland(char[][] grid, boolean[][] visited, int currentWidth, int currentLength) {
        boolean isCorrect = check(grid, currentLength, currentWidth);
        if (!isCorrect) {
            return 0;
        }
        boolean isIsland = !visited[currentWidth][currentLength] && grid[currentWidth][currentLength] == '1';
        visited[currentWidth][currentLength] = true;
        if (isIsland) {
            isIsland(grid, visited, currentWidth - 1,  currentLength);
            isIsland(grid, visited, currentWidth + 1, currentLength);
            isIsland(grid, visited, currentWidth, currentLength + 1);
            isIsland(grid, visited, currentWidth, currentLength - 1);
            return 1;
        }
        return 0;
    }

    public static boolean check(char[][] grid, int currentLength, int currentWidth) {
        return currentLength >= 0 && currentWidth >= 0 && currentWidth < grid.length && currentLength < grid[0].length;
    }
}
