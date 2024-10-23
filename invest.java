class Solution {
    public int[] solution(int[] prices) {
	// prices랑 같은 수의 시간 배열 저장
        int n = prices.length;	
        int[] answer = new int[n];
        
		// 비교하면서 시간 증가 후 저장
        for(int i=0;i<n;i++){
            int time =0;
            for(int j=i+1;j<n;j++){
                time++;
                if(prices[i]>prices[j]){
                    break;
                }
            }
            answer[i]= time;
        }
        return answer;
    }
}