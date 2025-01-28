import java.util.*;
class Solution {
    // BFS 함수: 그래프에서 시작 노드로부터 연결된 네트워크 크기를 계산
    public int bfs(Map<Integer, List<Integer>> graph, int start, int n) {
        boolean[] visited = new boolean[n + 1]; // 방문 여부를 저장할 배열
        Queue<Integer> queue = new LinkedList<>(); // BFS 탐색을 위한 큐

        queue.add(start); // 시작 노드를 큐에 추가
        visited[start] = true; // 시작 노드를 방문 처리
        int count = 1; // 네트워크의 송전탑 개수 (시작 노드 포함)

        // 큐가 빌 때까지 반복
        while (!queue.isEmpty()) {
            int node = queue.poll(); // 큐에서 현재 노드를 꺼냄

            // 현재 노드와 연결된 모든 이웃 노드 탐색
            for (int neighbor : graph.get(node)) {
                if (!visited[neighbor]) { // 방문하지 않은 노드만 처리
                    visited[neighbor] = true; // 방문 처리
                    queue.add(neighbor); // 큐에 추가
                    count++; // 네트워크 크기 증가
                }
            }
        }

        return count; // 네트워크 크기 반환
    }

    public int solution(int n, int[][] wires) {
        // 그래프를 인접 리스트 형태로 초기화
		Map<Integer, List<Integer>> graph = new HashMap<>();

		// 송전탑 번호(1부터 n까지)에 대해 빈 리스트를 생성
		for (int i = 1; i <= n; i++) {
			graph.put(i, new ArrayList<>()); // 각 송전탑은 연결된 송전탑 목록을 가짐
		}

		// wires 배열을 기반으로 그래프에 연결 정보 추가
		for (int[] wire : wires) {
			int v1 = wire[0]; // 첫 번째 송전탑 번호
			int v2 = wire[1]; // 두 번째 송전탑 번호
			graph.get(v1).add(v2); // v1에 v2 연결 추가
			graph.get(v2).add(v1); // v2에 v1 연결 추가 (양방향 그래프)
		}
		// 최소 차이를 저장할 변수, 초기값은 최대값으로 설정
		int minDifference = Integer.MAX_VALUE;

		// 모든 전선을 하나씩 끊어가며 시뮬레이션
		for (int[] wire : wires) {
			int v1 = wire[0]; // 끊을 전선의 첫 번째 송전탑
			int v2 = wire[1]; // 끊을 전선의 두 번째 송전탑

			// 전선 끊기 (그래프에서 양쪽 연결 제거)
			graph.get(v1).remove((Integer) v2);
			graph.get(v2).remove((Integer) v1);

			// 끊긴 상태에서 첫 번째 네트워크의 송전탑 개수를 BFS로 계산
			int size1 = bfs(graph, v1, n); // BFS는 네트워크의 크기를 반환

			// 두 번째 네트워크의 크기는 전체 송전탑 수에서 첫 번째 네트워크 크기를 뺀 값
			int size2 = n - size1;

			// 두 네트워크의 송전탑 개수 차이 계산
			int difference = Math.abs(size1 - size2);

			// 최소 차이 업데이트
			minDifference = Math.min(minDifference, difference);

			// 전선 복구 (원래 상태로 복원)
			graph.get(v1).add(v2);
			graph.get(v2).add(v1);
		}
		// 두 전력망의 송전탑 개수 차이가 최소가 되는 값을 반환
		return minDifference;
    }
}