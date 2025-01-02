/* 불공정 선거
 * 9명의 후보가 1~9번의 번호를 부여받음
 * 해당 국가에는 A,B,C 3개의 계급이 있음
 * 모두 한 표씩 행사하나 A계급의 1표는 3표와 같고 B계급의1표는 2표, C계급의 1표는 1표와 같음
 * 모든 주민의 투표 결과가 주어졌을 때, 가장 득표수가 높은 후보의 번호 출력
 * 
 * 입력:
 * 첫째 줄에는 구름 나라에 거주하는 주민 수N
 * 다음 N개의 줄에는 주민의 계급을 나타내는 문자와 그 주민이 투표한 후보의 번호가 공백을 두고 주어짐
 */

 import java.util.*;

 class Solution {
     public String solution(int N, String[] vote) {
         // 각 후보의 점수를 저장할 배열 (후보 번호는 1~9)
         int[] scores = new int[10];
 
         // 투표 데이터를 처리
         for (int i = 0; i < N; i++) {
             String[] parts = vote[i].split(" "); // 계급과 후보 번호 분리
             String grade = parts[0]; // 계급 (A, B, C)
             int candidate = Integer.parseInt(parts[1]); // 후보 번호
 
             // 계급에 따라 점수 추가
             if (grade.equals("A")) {
                 scores[candidate] += 3;
             } else if (grade.equals("B")) {
                 scores[candidate] += 2;
             } else if (grade.equals("C")) {
                 scores[candidate] += 1;
             }
         }
 
         // 가장 높은 점수를 받은 후보 찾기
         int maxScore = 0;
         int winner = 0;
 
         for (int i = 1; i <= 9; i++) { // 후보 번호는 1~9
             if (scores[i] > maxScore) {
                 maxScore = scores[i];
                 winner = i;
             }
         }
 
         // 가장 높은 점수를 받은 후보 번호 반환
         return String.valueOf(winner);
     }
 }
 