import java.util.*;
class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int MOD = 1_000_000_007; // 문제에서 주어진 값
        int[][] dp = new int[n + 1][m + 1]; // DP 테이블 생성

        // 웅덩이 위치를 저장할 배열
        boolean[][] isPuddle = new boolean[n + 1][m + 1];
        for (int[] puddle : puddles) {
            isPuddle[puddle[1]][puddle[0]] = true; // (x, y) 좌표에 웅덩이 표시
        }

        dp[1][1] = 1; // 시작점 (집) → 경로 1개

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 && j == 1) continue; // 시작점은 이미 1로 설정됨
                if (isPuddle[i][j]) {
                    dp[i][j] = 0; // 웅덩이가 있는 곳은 경로 없음
                } else {
                    dp[i][j] = ((dp[i - 1][j] + dp[i][j - 1]) % MOD);
                }
            }
        }

        return dp[n][m]; // 학교까지 가는 경로 개수 반환
    }
}
