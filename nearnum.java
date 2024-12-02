import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;

        // 1. array에 n을 추가
        int[] array2 = Arrays.copyOf(array, array.length + 1);
        array2[array.length] = n;

        // 2. array를 정렬
        Arrays.sort(array2);

        // 3. 정렬된 array에서 n의 앞뒤 숫자를 찾기
        int index = -1;
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] == n) {
                index = i;
                break;
            }
        }

        // 4. 앞뒤 값 비교
        int before = (index > 0) ? array2[index - 1] : Integer.MAX_VALUE;
        int after = (index < array2.length - 1) ? array2[index + 1] : Integer.MAX_VALUE;

        // 5. n-before과 after-n을 계산 후 더 작은 쪽 선택
        if (Math.abs(n - before) <= Math.abs(after - n)) {
            answer = before;
        } else {
            answer = after;
        }

        return answer;
    }
}
