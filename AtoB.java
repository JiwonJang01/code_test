import java.util.*;
class Solution {
    public int solution(String before, String after) {
        // 1. 문자열의 길이가 다르면 바로 1반환
        if (before.length() != after.length()) {
            return 0;
        }
        // 2. 각 문자열을 배열에 담음
        char[] a = before.toCharArray();
        char[] b = after.toCharArray();
        // 3. 각 문자열을 정렬
        Arrays.sort(a);
        Arrays.sort(b);
        // 4. 문자열이 같은지 비교
        if(Arrays.equals(a,b)){
            return 1; // 같음
        }
        else
            return 0; // 다름
    }
}