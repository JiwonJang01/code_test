/*
Greedy방식을 사용한 구명 보트문제
*/

import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people); // 무게 순 정렬
        int i = 0; // 가장 가벼운 사람
        int j = people.length - 1; // 가장 무거운 사람
        int boat = 0; // 보트 수
        
        while(i<=j){
            if(people[i]+people[j]<=limit){
                i++;
            } 
            j--;
            boat++;
        }
        
        return boat;
    }
}