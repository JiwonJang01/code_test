/*
최대 최소 값 구하기
* String answer을 사용했지만 append를 사용하기 위해
* StringBuilder 사용
*/

class Solution {
    public String solution(String s) {
        // s를 공백을 기준으로 split하여 리스트 만들기
        String[] str = s.split(" ");
        
        // 첫 번째 값을 초기 최소값 및 최대값으로 설정
        int min = Integer.parseInt(str[0]);
        int max = Integer.parseInt(str[0]);
        
        // list를 for문으로 돌리면서 가장 작은 수와 가장 큰 수 찾기
        for (int i = 1; i < str.length; i++) {
            int num = Integer.parseInt(str[i]);
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        
        // 결과 문자열 생성
        StringBuilder answer = new StringBuilder();
        answer.append(min);
        answer.append(" ");
        answer.append(max);
        
        return answer.toString();
    }
}
