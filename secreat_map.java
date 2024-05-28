/*
<생각했던 방법>
1. arr1과 arr2를 각각 이진수 변환\
2. for문과 if문을 이용하여 두 배열을 비교
3. 둘 중 하나라도 1인 위치에는 1을 넣고 둘 다 0인 위치에는 0을 넣어 새 배열을 생성(혹은 둘 중 한 배열을 변환)
3. 1을 #으로 0을 공백으로 변환 
<놓친 부분>
1. OR연산 - 이 연산은 두 비트 중 하나라도 1이면 결과 비트가 1이 되는 논리 연산
2. 변환된 이진수의 길이 맞추기
*/

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            // arr1과 arr2의 각 요소를 OR 연산 후 이진수로 변환
            String binaryString = Integer.toBinaryString(arr1[i] | arr2[i]);
            // 변환된 이진수를 n길이에 맞춰 앞에 0을 추가
            binaryString = String.format("%" + n + "s", binaryString).replace(' ', '0');
            
            // 이진수를 #과 공백으로 변환
            StringBuilder map = new StringBuilder();
            for (char bit : binaryString.toCharArray()) {
                if (bit == '1') {
                    map.append('#');
                } else {
                    map.append(' ');
                }
            }
            answer[i] = map.toString();
        }
        
        return answer;
    }
}

// 다른 사람 코드 - replaceAll()
class Solution {
  public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] result = new String[n]; // 결과를 저장할 문자열 배열을 선언합니다.

        // 1단계: 각 요소를 OR 연산하여 이진수 문자열로 변환
        for (int i = 0; i < n; i++) {
            result[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
        }

        // 2단계: 각 이진수 문자열을 원하는 형식으로 변환
        for (int i = 0; i < n; i++) {
            // 이진수 문자열의 길이를 n에 맞춰 앞에 0을 추가합니다.
            result[i] = String.format("%" + n + "s", result[i]);
            // 이진수 문자열에서 '1'을 '#'으로 변환합니다.
            result[i] = result[i].replaceAll("1", "#");
            // 이진수 문자열에서 '0'을 공백으로 변환합니다.
            result[i] = result[i].replaceAll("0", " ");
        }

        return result; // 최종 결과 배열을 반환합니다.
    }
}

