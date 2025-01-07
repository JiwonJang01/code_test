/* 프로그래머스 - 해시 -완주하지 못한 선수
문제만 보고 단순하자나! 해시 안해도 되지 않나?하고
냉큼 리스트로 풀었다가 효율성 망했다.*/

// 리스트로 푼 것
import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        List<String> plist = new ArrayList<>(Arrays.asList(participant));
        List<String> clist = new ArrayList<>(Arrays.asList(completion));

        // completion의 이름을 participant에서 삭제
        for (String c : clist) {
            plist.remove(c);
        }

        // participant에 남아 있는 이름 반환
        return plist.get(0);
    }
}


// 해시맵으로 푼 것
import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        // participant를 key:이름로 해시맵 생성
        HashMap<String, Integer> map = new HashMap<>();
        for (String p : participant) {
            map.put(p, map.getOrDefault(p, 0)+1);
			// map에 값을 추가하면서 값이 들어오지 않을 경우 1로 설정
            // 처음에는 map.getOrDefault(p, 1)로 하였으나 동명이인 검색이 안되서 변경
        }

        // 완주자를 해시맵에서 찾아 값을 -1함.
        for (String c : completion) {
            map.put(c, map.get(c) - 1);
        }

        // 남아 있는 참가자 찾기
        for (String key : map.keySet()) {
            if (map.get(key) > 0) { // 해시맵에서 값이 1인 사람 이름 찾기
                answer = key; // 이름 지정
                break;
            }
        }

        return answer;
    }
}
