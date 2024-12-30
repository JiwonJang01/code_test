/* 이진 탐색과 누적 합을 사용하여 푸는 문제 */

import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		// 입력받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 입력 받은 내용을 문자열에서 정수형으로 변환
		int input = Integer.parseInt(br.readLine());
		int[][] Knee = new int[input][input];
		
		// 무릎 배열 입력 받기
		for(int i=0; i<input; i++){
			Strong[] row = br.readLine().split(" ");
			for(int j; j<input; j++){
				Knee[i][j] = Integer.parseInt(row[j]); // 문자열을 정수형으로 전환
			}
		}
		
		// 누적 합 계산
		int[][] sum = new int[input+1][input+1];
		for(int i = 1; i<=input; i++){
			for(int j=1; j<=input; j++){
				// 누적합 공식: 현재 값+위쪽 누적합+왼쪽 누적합-대각선 중복된 영역
				sum[i][j] = Knee[i-1][j-1]+sum[i-1][j]+sum[i][j-1]+sum[i-1][j-1];
			}
		}
		
		// 이진 탐색 - 반창고 크기 구하기
		int left = 1; // 최소 크기 1
		int right,result = input; // 최대 크기:전체 배열 크기, 결과값 초기화
		while(left<=right){
			int mid = (left+right)/2; // 중간 값 계산
			boolean cover = true; // 현재 크기로 모든 상처를 덮을 수 있는지 true/false
			
			// 현재 크기로 모든 상처를 덮을 수 있는지 검사
			for(int i=mid; i<input; i++){ // 정사각형의 크기(0,0)부터 (i,j)까지
				for(int j=mid; j<=input; j++){
					int total = sum[i][j]-sum[i-mid][j]-sum[i][j-mid]+sum[i-mid][j-mid];
					if(total>0){ // 상처가 하나라도 포함되면 덮을 수 없음
						cover=false;
						break;
					}
				}
				if(!cover) // 상처가 덮이지 않으면 탐색 종료
					break;
			}
			
			// 현재 크기로 덮을 수 있으면 결과 갱신 후 크기를 줄임
			if(cover){
				result = mid; // 현재 크기를 결과로 저장
				right = mid-1; // 더 작은 크기로 변경 후 탐색
			} else {
				left = mid+1; // 더 큰 크기로 변경 후 탐색
			}
		}
		
		System.out.println(result);
	}
}