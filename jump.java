import java.util.*;

public class Solution {
    public int solution(int n) {
        int batteryUsage = 0;

        while (n > 0) {
            // n이 홀수인 경우
            if (n % 2 != 0) {
                batteryUsage += 1;
                n -= 1;
            }
            // n이 짝수인 경우
            else {
                n /= 2;
            }
        }

        return batteryUsage;
    }
}