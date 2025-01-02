/* 약수 확인
 * 두 양의 정수 a,b에 대하여 a=bc를 만족하는 양의 정수 c가 존재한다면, b가 a의 약수
 * 
 * 입력
 * 첫째 줄에는 테스트케이스의 개수
 * 둘째 줄에는 두 정수 a,b가 공백을 두고 주어짐
 */

 import java.util.*;

 class Solution {
     public List<Integer> solution(int T, String[] nums) {
        // 약수가 확인된 b를 저장할 배열
        ArrayList<Integer> blist = new ArrayList<>();

        // nums에서 a와 b를 분리 후 약수 찾기
        for (int i=0;i<T;i++){
            String[] line = nums[i].split(" "); // a랑 b 분리
            int a = Integer.parseInt(line[0]); 
            int b = Integer.parseInt(line[1]);

            // b가 a의 약수이면 blist에 추가
            if(a%b==0)
            {
                blist.add(b);
            }
        }
        return blist;
     }
 }