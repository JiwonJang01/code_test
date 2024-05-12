/* 첫번째 코드
class Solution {
    public String[] solution(String[] players, String[] callings) {
        for (String calling : callings) {
            for (int i = 0; i < players.length; i++) {
                if (players[i].equals(calling)) {
                    if (i > 0) {
                        String temp = players[i];
                        players[i] = players[i - 1];
                        players[i - 1] = temp;
                    }
                    break;
                }
            }
        }
        return players;
    }
}

// 실헹결과 75점으로 테스트 코드는 통과했지만 16개의 테스트 중 4개의 테스트에서 시간 초과가 발생함
*/

// 대부분의 다른 사람들도 비슷한 방법을 사용했다.
import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
		// 선수들과 인덱스 매핑
        HashMap<String, Integer> playerHM = new HashMap<>();
        for (int i = 0; i < players.length; i++){
            playerHM.put(players[i],i );
        }
        for (String calling : callings) {
            Integer idx = playerHM.get(calling);
            if (idx != null && idx > 0) {
				// 선수들 순서 변경
                String temp = players[idx];
                players[idx] = players[idx - 1];
                players[idx - 1] = temp;
				
				// 변경된 선수배열을 다시 매핑
                playerHM.put(players[idx], idx);
                playerHM.put(players[idx - 1], idx - 1);
            }
        }return players;
    } 
}
