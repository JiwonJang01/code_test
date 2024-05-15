/*
// 테스트 케이스 통과, 채점 결과 실패
class Solution {
    public boolean solution(int x) {
        // 입력 받은 정수를 10으로 나눈 몫 = 10의 자리
        int a = x / 10;
        // 입력 받은 정수를 10으로 나눈 나머지 = 1의 자리
        int b = x % 10 ;
        // 10의 자리+1의 자리
        int c = a + b;
        // 하샤드 수인지 검사
        boolean answer = true;
        if ( x % c == 0 ){
            return true;
        }
        else
            return false;
    }
}
*/

class Solution {
    public boolean solution(int x) {
        int sum = 0;
        int a = x;	// 아래 계산을 위해 원본 복제
        while(a>0){
            sum+=a%10;  // 나머지를 sum에 더함
            a/=10;  // a를 몫으로 바꿈
            // 몫을 10으로 나누면 어차피 나머지가 됨
        }
        
        if(x%sum==0){
            return true;
        }
        else
            return false;
    }
}