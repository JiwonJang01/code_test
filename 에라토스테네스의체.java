import java.util.*;

class Solution {
    public int solution(String numbers) { 
        int answer = 0; // 소수의 개수를 저장할 변수
        int length = numbers.length(); // 입력받은 문자열의 길이
        Set<Integer> primeSet = new HashSet<>(); // 소수를 저장하기 위한 Set (중복 방지)

        // 순열을 생성하여 가능한 모든 숫자 조합을 primeSet에 저장
        permute("", numbers, primeSet);

        // Set에 저장된 숫자들 중 소수인지 확인
        for (int num : primeSet) { // primeSet에 저장된 각 숫자를 순회
            if (isPrime(num)) { // 소수라면
                answer++; // 소수 개수 증가
            }
        }
        return answer; // 최종 소수 개수를 반환
    }

    // 순열을 생성하는 메서드
    private void permute(String prefix, String remaining, Set<Integer> primeSet) {
        // prefix: 현재까지 만든 숫자 조합
        // remaining: 아직 사용하지 않은 문자들
        
        if (!prefix.isEmpty()) { // prefix가 비어있지 않다면
            primeSet.add(Integer.parseInt(prefix)); // 숫자로 변환하여 Set에 추가
        }

        // remaining 문자열의 각 문자를 사용하여 순열 생성
        for (int i = 0; i < remaining.length(); i++) {
            // 현재 문자를 prefix에 추가하고, 나머지 문자들로 재귀 호출
            permute(prefix + remaining.charAt(i), 
                    remaining.substring(0, i) + remaining.substring(i + 1), 
                    primeSet);
        }
    }

    // 소수인지 확인하는 메서드
    private boolean isPrime(int num) {
        if (num < 2) return false; // 2 미만의 숫자는 소수가 아님
        for (int i = 2; i <= Math.sqrt(num); i++) { // 2부터 num의 제곱근까지 반복
            if (num % i == 0) return false; // 나누어떨어지면 소수가 아님
        }
        return true; // 위 조건을 통과하면 소수임
    }
}
