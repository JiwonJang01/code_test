/*
 * 접미사 : 뒤에 붙은 말
 * 즉, 뒷부분만 확인하면 됨
class Solution {
    public int solution(String my_string, String is_suffix) {
      // 접미사가 원래 문장보다 길 수는 없음.
      // 접미사의 길이만큼만 원래 문장의 뒷부분을 확인하면 됨
        int m = my_string.length();
        int s = is_suffix.length();

        if (s > m) return 0; // 접미사가 더 길면 불가능

        // my_string의 뒷부분을 잘라서 비교 
        String endPart = my_string.substring(m - s);  // m-s는 접미사 시작 글자의 인덱스
        return endPart.equals(is_suffix) ? 1 : 0;
    }
}

/*
substring(a, b) 인덱스 a 이상 b미만
substring(a) 인덱스 a 부터 끝까지
*/
