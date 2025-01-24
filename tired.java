import java.util.*;

class Solution {
    public int solution(int k, int[][] dungeons) {
        // 최대 탐험한 던전 수를 저장할 변수
        int maxDungeons = 0;
        
        // 던전의 순열을 생성하기 위해 List로 변환
        List<int[]> dungeonList = Arrays.asList(dungeons);
        
        // 순열 생성 (던전 순서를 모두 탐색)
        List<List<int[]>> permutations = generatePermutations(dungeonList);
        
        // 각 순열에 대해 탐험 시뮬레이션
        for (List<int[]> perm : permutations) {
            int currentFatigue = k; // 현재 피로도
            int count = 0; // 탐험한 던전 수
            
            // 순열에 있는 던전을 순서대로 탐험
            for (int[] dungeon : perm) {
                int required = dungeon[0]; // 최소 필요 피로도
                int consumed = dungeon[1]; // 소모 피로도
                
                if (currentFatigue >= required) {
                    currentFatigue -= consumed; // 피로도 차감
                    count++; // 탐험 성공
                } else {
                    break; // 탐험 불가능하면 종료
                }
            }
            
            // 최대값 갱신
            maxDungeons = Math.max(maxDungeons, count);
        }
        
        return maxDungeons; // 최대 탐험 수 반환
    }
    
    // 순열 생성 함수 - 던전을 도는 순서를 모두 구함 예정
    private List<List<int[]>> generatePermutations(List<int[]> dungeons) {
        List<List<int[]>> result = new ArrayList<>(); // 순열을 저장할 리스트
        permute(dungeons, 0, result);
        return result;
    }
    
    private void permute(List<int[]> dungeons, int start, List<List<int[]>> result) {
        // start는 현재 바꿔야할 던전의 인덱스
        if (start == dungeons.size()) {// 던전의 순서를 모두 결정한 상태
            result.add(new ArrayList<>(dungeons)); // 현재 던전의 순서를 result에 저장
            return;
        }
        
        for (int i = start; i < dungeons.size(); i++) {
            Collections.swap(dungeons, start, i); // 스왑 - 던전의 순서를 바꿔보는 과정
            permute(dungeons, start + 1, result); // 재귀 호출 - 다음 던전을 바꾸기
            Collections.swap(dungeons, start, i); // 원상복구 - 리스트 원상복구
        }
    }
}
