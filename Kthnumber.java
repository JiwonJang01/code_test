/*
프로그래머스 - 정렬 K번째수
생각보다 너무 꼬아서 생각했다.
처음에는 이중for문을 사용해서 각 행을 ArrayList로 만들어 분리하고 answer에 값을 저장하는 방식으로 진행했다.
그 결과 for문 사이에 배열 초기화가 되지 않아 문제가 발생.
수정한 코드는 아래와 같다. 근데....ArrayList를 안써도 되는 방법이....
*/
import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        ArrayList<Integer> answer = new ArrayList<>();

        // commands의 각 행을 반복
        for (int[] row : commands) {
            // 각 row의 값 분리
            int start = row[0];
            int end = row[1];
            int pick = row[2];

            // start와 end 유효성 검사
            if (start < 1) start = 1; // 시작값이 1보다 작으면 1로 설정
            if (end > array.length) end = array.length; // 끝값이 배열 길이를 초과하면 최대 길이로 설정

            // array에서 start번째부터 end번째까지 자르기
            int[] subArray = Arrays.copyOfRange(array, start - 1, end); // end는 포함되지 않음

            // 자른 배열 정렬
            Arrays.sort(subArray);

            // pick번째 값 추가
            answer.add(subArray[pick - 1]);
        }

        // ArrayList를 int[]로 변환하여 반환
        return answer.stream().mapToInt(i -> i).toArray();
    }
}

/*
GPT가 알려준 코드다..훨씬 짧고 간단하다..;ㅁ;
commands의 요소 갯수에 따라 배열을 생성하고
인덱스 별로 순회하면서 각 행처리. 
배열이기 때문에 add나 get필요없이 인덱스로 값을 추가하고 확인한다.
*/

import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length]; // 결과 배열 생성

        // commands를 순회하며 각 [i, j, k]를 처리
        for (int index = 0; index < commands.length; index++) {
            int i = commands[index][0];
            int j = commands[index][1];
            int k = commands[index][2];

            // array에서 i번째부터 j번째까지 자르기
            int[] subArray = Arrays.copyOfRange(array, i - 1, j); // 범위: [i-1, j)

            // 정렬
            Arrays.sort(subArray);

            // k번째 값 추출
            answer[index] = subArray[k - 1];
        }

        return answer;
    }
}
