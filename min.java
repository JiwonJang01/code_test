/*
최솟값만들기 - 시간초과
채점 결과
정확성: 69.6
효율성: 7.6
합계: 77.2 / 100.0
*/
import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        // A 내림차순
        Arrays.sort(A);

        // B 오름차순
        for (int i = 0; i < B.length - 1; i++) {
            for (int j = i + 1; j < B.length; j++) {
                if (B[i] < B[j]) {
                    // 두 요소의 위치를 변경
                    int temp = B[i];
                    B[i] = B[j];
                    B[j] = temp;
                }
            }
        }
        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[i]; 
        }

        return answer;
    }
}