/*
문자열에 포함되어 있는 특정 숫자 7의 개수를 세는 것
array	result
[7, 77, 17]	4
[10, 29]	0
*/


// 기존에 내가 작성한 코드
// 배열을 순환하며 7을 찾을 때마다 answer의 개수를 증가시킨다는 원리로 풀이하면 된다고 생각하였음

import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int target = 7;
    
        for(int i = 0;i<array.length;i++){
            if(Arrays.stream(array).anyMatch(num->num==target)){
                answer++;
            }
        }
        return answer;
    }
}

// 하지만 숫자 내부에 있는 7의 개수를 계산하지 못함.
// 각 자리수까지 비교하기 위해서는 각 숫자를 문자열로 변환하여 자리수 단위로 확인

import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;

        for (int num : array) {
            String str = String.valueOf(num);
            
            for (char ch : str.toCharArray()) {
                if (ch == '7') {
                    answer++;
                }
            }
        }
        return answer;
    }
}