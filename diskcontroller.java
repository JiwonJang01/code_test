import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
        int currentTime = 0; // 현재 시각
        int totalWaitTime = 0; // 총 대기 시간
        int completedJobs = 0; // 완료된 작업 수

        // 요청 시각 기준으로 jobs 정렬
        Arrays.sort(jobs, (a, b) -> Integer.compare(a[0], b[0]));

        // 대기 큐: 우선순위 기준으로 작업 관리
        PriorityQueue<int[]> waitHeap = new PriorityQueue<>((a, b) -> {
            if (a[1] == b[1]) { // 소요 시간이 같으면
                if (a[0] == b[0]) return a[2] - b[2]; // 요청 시각이 같으면 작업 번호 기준
                return a[0] - b[0]; // 요청 시각 기준
            }
            return a[1] - b[1]; // 소요 시간 기준
        });

        int jobIndex = 0; // jobs 배열의 현재 인덱스

        // 모든 작업이 완료될 때까지 반복
        while (completedJobs < jobs.length) {
            // 현재 시간에 요청된 작업들을 대기 큐에 추가
            while (jobIndex < jobs.length && jobs[jobIndex][0] <= currentTime) {
                waitHeap.offer(new int[] { jobs[jobIndex][0], jobs[jobIndex][1], jobIndex });
                jobIndex++;
            }

            if (!waitHeap.isEmpty()) {
                // 우선순위 작업 선택
                int[] job = waitHeap.poll();
                currentTime += job[1]; // 작업 소요 시간만큼 현재 시간 갱신
                totalWaitTime += currentTime - job[0]; // 대기 시간 누적 계산
                completedJobs++;
            } else {
                // 대기 큐가 비어 있다면 다음 작업 요청 시각으로 이동
                currentTime = jobs[jobIndex][0];
            }
        }

        // 평균 대기 시간 계산
        answer = totalWaitTime / jobs.length;
        return answer;
    }
}
