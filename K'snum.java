// K의 개수
class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int a=i;a<=j;a++){
            int temp = a;
            while(temp>0){
                if(temp%10==k){
                    answer++;
                }
                temp=temp/10;
            }
        }
        return answer;
    }
}