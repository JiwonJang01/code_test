import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        // 가장 큰 값
        int width = 0;
        int height = 0;
        
        // sizes 순환하면서 값 비교하기
        for (int[] size:sizes){
            
            if (size[0] < size[1]) {
                // 짝 숫자들 중 큰 숫자를 가로, 작은 숫자를 세로
                int temp = size[0];
                size[0] = size[1];
                size[1] = temp;
            }
            
            int w = size[0];    // 가로 값
            int h = size[1];    // 세로 값
            
            if(w>width){
                width = w;
            }
            if(h>height){
                height = h;
            }
            
        }
        
        // answer계산하기
        answer = width*height;
        return answer;
    }
}