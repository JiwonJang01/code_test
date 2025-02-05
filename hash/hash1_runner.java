/*
단 한명의 선수를 제외하고 모두 완주
그 한명의 선수 이름을 결과로 출력
*/
import java.util.*;
class Solution{
  String[] participant, String[] completion) {
    // 이름이 출력되므로 answer은 String
    String answer ="";
    // participant를 순환하며 참여자를 담을 hashmap생성
    HashMap<String, Integer> hashmap = new Hashmap<>();
    // 키: 참여자, 값: 1로 지정
    for(String p: participant){
      hashmap.put(p,map.getOrDefault(p,0)+1);
    }
    // completion를 순환하며 hashmap에 해당 참여자가 있으면 값을 0을 변경
    for(String c: completion){
      hashmap.put(c, map.get(c)-1);
    }
    // hashmap을 순환하며 0보다 값이 큰 사람을 answer로 지정
    for(String key:map.keySet(){
      if(map.get(key)>0){ // 해당 key의 value가 0보다 클 경우
        answer=key; // 
        break;
    }
    return answer;
  }
}
