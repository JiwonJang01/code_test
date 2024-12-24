/* 프로그래머스
스택/큐 문제 - 같은 숫자는 싫어
알고리즘 kit에 있는 문제인데, 스택/큐로 푸는 게 더 복잡한거 같음...
*/

// 내가 작성한 코드 - 효율성에서 실패가 떴다. 
import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> answer = new ArrayList<>();
        
        // arr을 arrQueue에 넣기
        Queue<Integer> arrQueue = new LinkedList<>();
        for(int i:arr){
            arrQueue.add(i);
        }
        // arr의 첫값을 answer의 첫번째 값으로 넣기
        answer.add(arrQueue.peek());
        // arrQueue의 첫번째 값 삭제
        arrQueue.poll();
        // 반복하며 첫번째값 삭제 투입
        while(!arrQueue.isEmpty()){
            // arrQueue 첫번째 값 확인
            int num = 0;
            num = arrQueue.peek();
            // answer의 마지막 값과 비교 후 같으면 poll 다르면 추가
            if(answer.get(answer.size() - 1) == arrQueue.peek()){
                arrQueue.poll();
            }
            else{
                answer.add(arrQueue.peek());
                arrQueue.poll();
            }
        }

        return answer.stream().mapToInt(i -> i).toArray();

    }
}


// 도움을 받아 테스트를 성공한 코드
// 첫 값을 넣는 부분을 제외하고 이전값과 바로바로 비교
import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();

        // 모든 요소를 큐에 삽입
        for (int num : arr) {
            queue.add(num);
        }

        // 큐를 사용하여 중복 제거
        int prev = -1; // 이전 값을 저장할 변수
        while (!queue.isEmpty()) {
            int current = queue.poll(); // 큐에서 값을 가져옴
            if (current != prev) {      // 이전 값과 다르면 결과에 추가
                result.add(current);
                prev = current;         // 이전 값을 갱신
            }
        }

        // 결과를 배열로 변환하여 반환
        return result.stream().mapToInt(i -> i).toArray();
    }
}
