/*
 * 세로셈 덧셈을 생각하면 됨
 * 각 자리를 더한 다음 올림한다.
*/
import java.util.*;
class Solution {
    public String solution(String a, String b) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

      // 정수 a,b를 정의 - 일의 자리 수부터 시작
        int i = a.length() - 1;
        int j = b.length() - 1;
      // 각 자리수를 합했을 때 10의 자리 수 
        int carry = 0;

      // 순환하며 자릿수가 올라감 -> 인덱스는 작아짐. -- 이용
        while(i >= 0 || j >= 0 || carry > 0){
          // 문자를 숫자로 바꿀 때 0을 빼서 원래 어떤 숫자인지 파악.
            int x = (i >= 0) ? a.charAt(i--) - '0' : 0;
            int y = (j >= 0) ? b.charAt(j--) - '0' : 0;

            int sum = x+y+carry;
            sb.append(sum%10);  // 일의 자리 숫자는 문자열에 추가
            carry = sum/10;  // 십의 자리 숫자는 carry에 저장하고 다음에 사용
            
        }
        answer = sb.reverse().toString();
        return answer;
    }
}
