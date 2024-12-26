/*
프로그래머스 heap - 더 맵게
힙문제인데 왜 ArrayList로 풀었지 나...?
채점 결과 58점으로 실패......
*/
import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        // scoville을 ArrayList로
        ArrayList<Integer> scovilleList = new ArrayList<>();
        for(int i:scoville){
            scovilleList.add(i);
        }
        
        // 섞은 횟수
        int count = 0;
        
        // 반복문 - scovilleList의 모든 요소가 K보다 크면 종료
        while(scovilleList.size() > 1){
            // scovilleList를 가장 작은 요소부터 정렬.
            Collections.sort(scovilleList);
            if(scovilleList.get(0) <= K){
                // 모든 요소가 K보다 작을 경우
                // 가장 작은 수와 2번쨰로 작은 수 꺼내고 
                int one = scovilleList.get(0);
                scovilleList.remove(0);
                int two = scovilleList.get(0);
                scovilleList.remove(0);
                
                //공식 적용 후 맨 마지막에 추가
                int num = one+(two*2);
                scovilleList.add(num);
                
                count++;
                
            }
            else
                break;
        }
        
        return count;
    }
}

/*
우선 순위 큐 - 힙 사용 해결법
*/

import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> scovilleQueue = new PriorityQueue<>();
        for (int i : scoville) {
            scovilleQueue.add(i);
        }

        int count = 0; // 섞은 횟수

        // 반복문 - 모든 요소가 K보다 크면 종료
        while (scovilleQueue.size() > 1) { // 최소 두 개 이상의 값이 있어야 섞을 수 있음
            if (scovilleQueue.peek() >= K) {
                break; // 가장 작은 값이 K 이상이면 종료
            }

            // 가장 작은 두 개의 요소 꺼내기
            int one = scovilleQueue.poll();
            int two = scovilleQueue.poll();

            // 공식 적용 후 새 값 삽입
            int newScoville = one + (two * 2);
            scovilleQueue.add(newScoville);

            count++; // 섞은 횟수 증가
        }

        // 모든 요소가 K 이상인지 확인
        if (scovilleQueue.peek() < K) {
            return -1; // 만들 수 없는 경우
        }

        return count; // 섞은 횟수 반환
    }
}
