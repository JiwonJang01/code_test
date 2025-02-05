import java.util.*;
/*
N마리의 폰켓몬 중 N/2 가져갈 수 있다.
같은 종류는 같은 번호를 가짐
최대한 많은 종류의 폰켓몬을 가지는 방법
*/
class Solution{
  public int solution(int[] nums){
    int answer = 0;
    
    // nums에 중복이 있는 경우 제거
    HashSet<Integer> set = new HashSet<>();
    
    // 선택할 수 있는 모든 경우의 수를 담는 배열 만들기
    for(int num:nums){
      set.add(num);
    }
    
    // 해당 배열의 크기 체크
    int size = set.size();
    
    // 최대값은 n/2
    int pick = nums.length/2;
    
    // 둘 중 더 작은 쪽을 선택 - n/2 이상 선택할 수 없기 때문에
    answer = Math.min(pick, count);
    return answer;
  }
}
