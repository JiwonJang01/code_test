/*
오름차순으로 정렬 후 순회하면서 H-Index를 계산한다.
현재 논문의 인용 수가 H-Index 이상인지 확인한다. 
*/

import java.util.*;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int n=0;
        n = citations.length;
        for (int i = 0; i < n; i++) {
            int h = n - i;
            if (citations[i] >= h) {
                return h;
            }
        }
        return 0;
    }
}