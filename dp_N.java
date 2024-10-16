// 프로그래머스 > 동적계획법(DP) > N으로 표현

import java.util.*;

class Solution {
    public int solution(int N, int number) {
     // N을 담을 새로운 리스트 생성
        List<Set<Integer>> dp = new ArrayList<>();
     // 리스트 초기화
        for(int i=0;i<=8;i++){
            dp.add(new HashSet<>());
        }
     // N을 1번 사용했을 때 값을 dp에 넣음
        dp.get(1).add(N);
     // dp에서 i번째를 N으로 사용했을 때 set을 만드는 반복문
        for (int i=1;i<=8;i++){
            Set<Integer> nSet = dp.get(i);
            // N을 i번 이어 붙인 숫자
            int aN = 0;
            for(int j=0;j<i;j++){
                aN = aN*10+N;
            }
            nSet.add(aN);
            // N을 반복할 set과 횟수를 반복할 set2개 생성필요
            for (int j=1;j<=i;j++){
                Set<Integer> set1 =dp.get(j);
                Set<Integer> set2 =dp.get(i-j);
                
                // N을 가지고 사칙연산. 값은 두번째 만들었던 nSet에 추가
                for(int a:set1){
                    for(int b:set2){
                        nSet.add(a+b);
                        nSet.add(a-b);
                        nSet.add(a*b);
                        if(b!=0){
                            nSet.add(a/b);
                        }
                    }
                }
            }
            // 목표 숫자를 찾으면 현재 사용 횟수 반환
            if(nSet.contains(number)){
                return i;
            }
        }
            // 사용횟수가 8보다 크면 -1
        return -1;
    }
}