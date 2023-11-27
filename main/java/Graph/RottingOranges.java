package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {
    static int arr[][];
    static int n;
    static int m;
    static int ans;
    static int fresh;

    public static void bfs(Queue<int[]> q){
        

        int dir[][] = {{0,1},{0,-1},{-1,0},{1,0}};
        while(q.size()!=0){
            int x = q.size();

            for(int l=0; l<x; l++){
                int a[] = q.remove();
                int i = a[0];
                int j = a[1];
                arr[i][j]=2;

                for(int k=0; k<4; k++){
                    int newR = i+dir[k][0];
                    int newC = j+dir[k][1];

                    if(newR<0 || newC<0 || newR>=n || newC>=m || arr[newR][newC]==0 || arr[newR][newC]==2) continue;

                    fresh--;
                    arr[newR][newC] = 2;
                    q.add(new int[]{newR,newC});
                }
            }
            ans++;
        }
    }

    public static int orangesRotting(int[][] grid) {
        arr = grid;
        n = arr.length;
        m = arr[0].length;
        
        ans = 0;

        Queue<int[]> q = new LinkedList<>();
        fresh=0;
        int zero=0;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(arr[i][j]==2) q.add(new int[]{i,j});
                else if(arr[i][j]==1) fresh++;
                else zero++;
            }
        }
        if(zero==m*n) return 0;
        bfs(q);

        if(fresh==0) return ans-1;
        else return -1;
    }
}
