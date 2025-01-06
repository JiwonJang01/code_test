import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        // 모든 트럭이 다리를 건너는데 걸리는 시간
        int answer = 0;
        
        // 다리 위 트럭의무게 합: going에 있는 모든 트럭 무게의 합
        int currentWeight = 0;
        
        // truck_weights를 큐로 만들기
        Queue<Integer> before = new LinkedList<>();
        for(int i : truck_weights){
            before.add(i);
        }
        
        // 다리를 건너고 있는 트럭을 저장할 큐 생성
        Queue<Integer> going = new LinkedList<>();
        
        // 트럭이 다리에 머물고 있는 시간을 저장할 큐 생성
        Queue<Integer> goingTime = new LinkedList<>();
        
        // before에서 going으로 하나씩 이동하며 다리를 건넜는지 판단
        // going에 머물러있는 시간이 bridge_length가 되면 다리를 건넌 것.
        while (!before.isEmpty() || !going.isEmpty()){
            // 모든 경우에 시간은 계속 1초씩 증가
            answer++;
            
            // 다리 위 트럭들 경과 시간
            int size = goingTime.size();
            for (int i = 0; i < size; i++) {
                goingTime.add(goingTime.poll() + 1);
            }
            
            // 다리를 건넌 트럭 제거
                // goingTime.peek값이 bridge_length랑 같아지면 해당 트럭은 다리를 다 건넌 것
            if (!goingTime.isEmpty() && goingTime.peek() == bridge_length) {
                goingTime.poll();
                
                // currentWeight에서 going.peek의 무게 제거
                currentWeight -= going.poll();
            }

            // 대기 중인 트럭을 다리에 올릴 수 있는지 확인
            if (!before.isEmpty() && currentWeight + before.peek() <= weight) {
                int nextTruck = before.poll();
                going.add(nextTruck);
                goingTime.add(0);
                currentWeight += nextTruck;
            }
                
        }
        return answer;
    }
}