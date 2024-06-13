class Solution {
    public int[] solution(int brown, int yellow) {
        // 전체 격자 수 계산: total = brown + yellow
        int total = brown + yellow;
        
        // answer을 for문 밖에서 지정해주고 
        int[] answer = new int[2];
        
        // 가로, 세로 길이 구하기 (가로 >= 세로)
        for (int h = 1; h <= total; h++) {
            if (total % h == 0) {
                int w = total / h;
                
                // 조건 확인
                if (w >= h && (w - 2) * (h - 2) == yellow) {
                    answer[0] = w;
                    answer[1] = h;
                    break;
                }
            }
        }
		// for문 밖에서 return 해줘야함
        return answer;
    }
}
