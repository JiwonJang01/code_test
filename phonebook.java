/*프로그래머스 - 해시 - 전화번호 목록
일단, 내가 생각한 방향은
데이터 추가 - key는 번호로 value를 phone_book 순환
순환하면서 접두어로 사용되었는지 확인
한번이라도 사용되었으면 순환을 멈추고 false반환
하지만 실행 결과 오류가 굉장히 나왔을 뿐더러 효율성도...통과는 했지만 불안했다*/

import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        // 1. HashMap에 모든 전화번호를 Key로 추가
        HashMap<String, String> pb_map = new HashMap<>();
        for (String number : phone_book) {
            pb_map.put(number, number);
        }

        // 2. HashMap에서 접두어 확인
        for (String number : phone_book) {
            // 각 번호의 접두어를 하나씩 체크
            for (int i = 1; i < number.length(); i++) {
                String prefix = number.substring(0, i);
                if (pb_map.containsKey(prefix)) {
                    return false; // 접두어가 존재하면 false 반환
                }
            }
        }

        return answer; // 접두어가 없으면 true 반환
    }
}


// 그래서 GPT한테 물어봤더니...정렬을 쓰는 방법을 알려줬다...
// 근데 이게 더 진짜 간단해서...좀 더 생각해볼걸...
import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        // 1. phone_book 정렬
        Arrays.sort(phone_book);

        // 2. 정렬된 상태에서 접두어 비교
        for (int i = 0; i < phone_book.length - 1; i++) {
            // 현재 번호가 다음 번호의 접두어인지 확인
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                return false;
            }
        }

        return true; // 접두어 관계가 없으면 true 반환
    }
}
