import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        // 총 결과 수
        int answer = 1;
        
        // 입력 해시맵에 넣기
        HashMap<String,Integer> collection = new HashMap<>();
        for(String[] it:clothes){
            String kind = it[1];
            collection.put(kind, collection.getOrDefault(kind,0)+1);
        }
        
        // 의상을 1개씩 고르는 것부터 N개씩 고르는 것 까지
        for(int n:collection.values()){
            // 안 입는 경우를 포함해서 모든 경우의 수
            answer *= (n+1); 
        }
        
        // 안 입는 경우 제외
        return answer-1;
    }
}