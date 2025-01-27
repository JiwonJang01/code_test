// 에라토스테네스의 체
import java.util.*;

class Eratosthenes {
    public static List<Integer> findPrimes(int n) {
        // 0부터 n까지의 숫자를 검사할 배열 생성
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true); // 처음엔 모든 숫자를 소수로 가정
        isPrime[0] = false; // 0은 소수가 아님
        isPrime[1] = false; // 1도 소수가 아님

        // 에라토스테네스의 체 알고리즘
		// Math.sqrt(n)는 n의 제곱근
        for (int i = 2; i <= Math.sqrt(n); i++) {
			// 어떤 수 n이 소수가 아니려면, 최소 하나의 약수가 존재하며 그 약수는 항상 제곱근 이하에 있음
			// i를 제곱근까지만 검사해도 약수여부 즉, 소수여부를 판단 가능함
            if (isPrime[i]) { // 현재 숫자가 소수라면, 해당 소수의 배수를 삭제해야함
                for (int j = i * i; j <= n; j += i) {
					// j += i, i의 배수를 계속 더하며 삭제
                    isPrime[j] = false; // i의 배수는 소수가 아님
                }
            }
        }

        // 소수 목록을 저장할 리스트
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primes.add(i); // 소수인 숫자를 리스트에 추가
            }
        }
        return primes;
    }

    public static void main(String[] args) {
        int n = 50; // 소수를 구할 범위 (0부터 n까지)
        List<Integer> primes = findPrimes(n);
        System.out.println("소수: " + primes);
    }
}
