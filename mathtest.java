import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        
        // 수포자 1,2,3
        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};
        
        // 수포자 점수 저장
        int[] score = {0, 0, 0};
        
        // 수포자별 점수 계산
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == one[i%5]) {
                score[0]++;
            }
            if (answers[i] == two[i%8]) {
                score[1]++;
            }
            if (answers[i] == three[i%10]) {
                score[2]++;
            }
        }
        
        // 가장 큰 점수
        int high = Math.max(score[0], Math.max(score[1], score[2]));
        

        // 가장 높은 점수를 받은 사람을 리스트에 저장
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            if (score[i] == high) {
                result.add(i + 1); // 1번 수포자는 index 0
            }
        }
        
        return result.stream().mapToInt(i -> i).toArray();
    }
}