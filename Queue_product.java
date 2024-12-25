/*
1. 남은 작업 일수 계산
2. 작업 배포 그룹화
3. 결과를 리스트에 추가해서 반환
*/

import java.util.*; 

public class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        // 1. 각 작업의 완료 날짜 계산
        Queue<Integer> daysQueue = new LinkedList<>(); // 작업의 남은 일수를 저장할 큐를 선언

        for (int i = 0; i < progresses.length; i++) {
            int remaining = 100 - progresses[i]; // 작업이 완료되기까지 남은 퍼센트를 계산
            int days = (int) Math.ceil((double) remaining / speeds[i]); // Math.ceil 숫자를 올림 처리하는 함수
            // 남은 작업 퍼센트를 속도로 나눠 걸리는 일수를 계산 (올림 처리)
            daysQueue.offer(days); // 계산된 일수를 큐에 추가
        }

        // 2. 작업 배포 처리
        List<Integer> result = new ArrayList<>(); // 각 배포에서 배포된 작업 수를 저장할 리스트

        while (!daysQueue.isEmpty()) { // 큐에 남은 작업이 있을 때까지 반복
            int current = daysQueue.poll(); // 현재 배포 기준일(앞선 작업의 완료 일수)을 가져옴
            int count = 1; // 현재 배포에서 배포될 작업 수를 1로 초기화

            while (!daysQueue.isEmpty() && daysQueue.peek() <= current) { 
                // 큐의 맨 앞 작업이 현재 기준일보다 작거나 같으면 같은 날 배포 가능
                daysQueue.poll(); // 해당 작업을 큐에서 제거
                count++; // 배포 작업 수 증가
            }

            result.add(count); // 이번 배포에서 완료된 작업 수를 결과 리스트에 추가
        }

        // 3. 결과 배열로 변환
        return result.stream().mapToInt(i -> i).toArray(); 
        // List<Integer>를 int[] 배열로 변환하여 반환
    }
}
