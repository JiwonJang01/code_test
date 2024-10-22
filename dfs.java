// DFS - 모든 경우의 수를 돌아 빠르게 정답을 찾는 것
import java.util.*;
class Solution {
    int answer = 0; // 타겟 넘버를 만드는 방법의 수
    public int solution(int[] numbers, int target) {
        dfs(numbers,target,0,0);
        return answer;
    }
    // 재귀함수 - numbers를 다 더하는 방법부터 - 위치를 변경해가며 target과 맞추기
    private void dfs(int[] numbers, int target, int depth, int sum){
        // answer에 재귀함수를 시도해서 target을 만든 횟수 저장
        if(depth == numbers.length){
            if(sum==target){
                answer++;
            }
            return;
        }
        dfs(numbers, target, depth+1, sum+numbers[depth]);
        dfs(numbers, target, depth+1, sum-numbers[depth]);
    }
}