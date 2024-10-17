import java.util.*;

class Solution {
    public int solution(int[][] triangle) {
//Math.max(a, b)는 Java의 Math 클래스에 있는 메소드로, 두 개의 인자 a와 b 중에서 더 큰 값을 반환
        
        // 삼각형의 높이
        int n = triangle.length;
        // 새로운 값을 저장할 배열
        int[][ ] dp = new int [n][n];
        // 맨 아랫 줄의 값을 모두 더함
        for(int i=0;i<n;i++){
            dp[n-1][i]=triangle[n-1][i];
        }
        // 맨 아래에서 2번째 줄 부터 반복을 하면서 올라감
        for(int i=n-2;i>=0;i--){
            for(int j=0;j<=i;j++){
                dp[i][j]=Math.max(dp[i+1][j],dp[i+1][j+1])+triangle[i][j];
            }
        }
        // 배열 안에 값을 모두 더해서 반환
        return dp[0][0];
    }
}