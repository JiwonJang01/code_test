// 내 코드

import java.util.Scanner;
class Solution {
    public String solution(String phone_number) {
        // 전화번호 입력 받기
        Scanner sc = new Scanner(System.in);
        //String phone_number = sc.nextLine();

        // 뒷 4자리수만 남기고 순환하면서 *로 바꿈
        StringBuilder answer = new StringBuilder();

        // 전화번호의 길이
        int len = phone_number.length();

        for(int i=0;i<len-4;i++){
            // 개수만큼 별 출력
            answer.append("*");
        }
        // 별 뒤에 뒷4자리를 붙여야함
        answer.append(phone_number.substring(len-4));
        // 출력

        return answer.toString();
    }
}

// 다른 정답자의 풀이
/*
class Solution {
  public String solution(String phone_number) {
     char[] ch = phone_number.toCharArray();
	 // 인데스 형식으로 *로 교체
     for(int i = 0; i < ch.length - 4; i ++){
         ch[i] = '*';
     }
     return String.valueOf(ch);
	 // valueOf
	 // char 배열을 String으로 변환하는 메서드
  }
}*/