import java.util.*;
class Solution {
    public String solution(String myString, String pat) {
        // 가장 긴 부분 문자열을 담을 arraylist
        ArrayList<Character> answer = new ArrayList<>(); // Character 명시
        int p = pat.length();
        if(p <= 0){ // p가 0이거나 음수일 경우 반복문 발생 시 오류 가능성
            p = 1;
        }
        int idx = -1; // 인덱스는 0 이상 
        int n = myString.length()-1;
        
        // myString 문자열을 뒤에서 부터 순환
        for(int i = n; i>=0; i--){
            // pat문자열의 마지막 문자와 같다면
            if(myString.charAt(i)==pat.charAt(p-1)){ // String은 인덱스 사용 불가
                boolean match = true;
                // pat문자열을 역으로 순환하면서 myString에 속하는지 확인
                for(int j =p-1, k=i; j>=0;j--,k--){
                    if(k<0||myString.charAt(k) != pat.charAt(j)){
                        match = false;
                        break;
                    }
                }
                // 일치하는 패턴이 끝나는 위치 저장
                if(match){
                    idx = i;
                    break;
                }
            }
        }
        // 패턴이 존재하는 경우 answer에 저장
        if(idx != -1){
            for(int i = 0; i<= idx; i++){
                answer.add(myString.charAt(i));
            }
        }
        
        // 문자열로 변환 후 반환
        StringBuilder result = new StringBuilder();
        for (char c : answer) {
            result.append(c);
        }
        
        return result.toString();
    }
}
