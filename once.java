import java.util.*;

/*
이 문제를 풀면서 여러 에러가 발생했는데,
일단, i-1이 음수일 경우와 i+1이 범위를 ㅂ벗어나는 경우를 고려하지 못했다.
그리고 마지막으로 문자열 s가 한자리 일때를 고려하지 못했다
어찌되었던 내가 생각한 흐름은 맞아서 다행
*/ 

class Solution {
    public String solution(String s) {
        String answer = "";
        
        if (s.length() == 1) {
            return s;
        }
        
        char[] a = s.toCharArray();
        Arrays.sort(a);

        for(int i=0;i<a.length;i++){
            if(i==0 && a[i]==a[i+1]){
                continue;
            }
            else if(i > 0 && i + 1 < a.length && (a[i] == a[i - 1] || a[i] == a[i + 1])){
                continue;
            }
            else if (i == a.length - 1 && a[i] == a[i - 1]) {
                continue;
            }
            else
                answer += a[i];
        }
        return answer;
    }
}