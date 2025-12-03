// Last updated: 12/2/2025, 11:20:30 PM
1class Solution {
2    private int n;
3    private int m;
4    public int numIslands(char[][] grid) {
5        int count = 0;
6        n = grid.length;
7        if(n==0){
8            return 0;
9        }
10        m=grid[0].length;
11        for(int i=0; i<n; i++){
12            for (int j=0; j<m; j++){
13                if(grid[i][j]=='1'){
14                    removeIsland(grid, i, j);
15                    count++;
16                }
17            }
18        }
19        return count;
20    }
21    private void removeIsland(char[][]grid, int i, int j){
22        if(i<0 || j<0 || i>=n || j>=m || grid[i][j] != '1'){
23            return;
24        }
25        grid[i][j] = '0';
26        removeIsland(grid, i, j+1);
27        removeIsland(grid, i, j-1);
28        removeIsland(grid, i+1, j);
29        removeIsland(grid, i-1, j);
30    }
31}