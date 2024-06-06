// 1. 내적 문제

class Solution {
    public int solution(int[] a, int[] b) {
        int n = a.length;
        int sum = 0; 
        for (int i = 0; i < n; i++) {
            sum += a[i] * b[i]; 
        }
        return sum;
    }
}

// 2. 부족한 금액 계산하기
class Solution {
    public long solution(int price, int money, int count) {
        long sum_price = 0;
        for (int i = 1; i <= count; i++) { 
            sum_price += price * i;
        }
        long result = sum_price - money;
        return result > 0 ? result : 0; 
    }
}

// 3.