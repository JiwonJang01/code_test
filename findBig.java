/* 
프로그래머스 - 가장 큰 수 만들기
힙인가?했는데 힙은 아니였다.
숫자를 먼저 오름차순으로 정렬하고, 앞뒤숫자의 결합값을 비교 후 더 큰 값에 맞춰서 재정렬한다.
사실 중간이 아직 완벽하게 이해가 되지는 않는다.
*/
import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        // 문자열 변환
        String[] numArray = new String[numbers.length];
        for(int i=0;i<numbers.length;i++){
            numArray[i]=String.valueOf(numbers[i]);
        }
        
        // 숫자를 오름차순으로 정렬
        // Comparator를 사용하여 두 숫자를 이어붙였을 때 더 큰 값을 만들 수 있도록 정렬
        Arrays.sort(numArray, new Comparator<String>() {
            public int compare(String x, String y) {
                // x + y와 y + x를 비교
                return (y + x).compareTo(x + y);
            }
        });
        
        // 만약 첫 번째 숫자가 "0"이라면, 모든 숫자가 0이라는 의미이므로 "0"을 반환
        if (numArray[0].equals("0")) {
            return "0";
        }
        
        // 정렬된 배열을 이어 붙여서 가장 큰 수 만들기
        StringBuilder sb = new StringBuilder();
        for (String num : numArray) {
            sb.append(num);
        }
        
        // 가장 큰 수를 answer로 지정
        answer = sb.toString();
        return answer;
    }
}