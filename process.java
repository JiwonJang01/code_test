import java.util.*;

public class Solution {
    public int solution(int[] priorities, int location) {
        // 1. 큐 초기화: 프로세스들을 큐에 넣기
		// 각 프로세스를 객체로 만들고 큐에 추가
        Queue<Process> queue = new LinkedList<>();
        
        for (int i = 0; i < priorities.length; i++) {
            queue.add(new Process(i, priorities[i]));
        }
        
        // 실행된 프로세스의 수를 저장할 변수
        int processed = 0;
        
        // 2. 큐 처리: 큐가 빌 때까지 반복
        while (!queue.isEmpty()) {
            // 큐에서 첫 번째 프로세스를 꺼냄
            Process current = queue.poll();
            boolean hasHigherPriority = false;
            
            // 큐를 순회하며 꺼낸 프로세스보다 높은 우선순위가 있는지 확인
            for (Process process : queue) {
                if (process.priority > current.priority) {
                    hasHigherPriority = true;
                    break;
                }
            }
            
            // 더 높은 우선순위가 있는 경우 다시 큐에 넣음
            if (hasHigherPriority) {
                queue.add(current);
            } else {
                // 그렇지 않으면 프로세스를 실행하고, 실행 순서를 증가
                processed++;
                if (current.index == location) {
                    // 현재 실행한 프로세스가 찾고 있는 프로세스라면 실행 순서 반환
                    return processed;
                }
            }
        }
        return -1;
    }

    // Process 클래스 정의
    class Process {
        int index;
        int priority;
        
        Process(int index, int priority) {
            this.index = index;
            this.priority = priority;
        }
    }
}
