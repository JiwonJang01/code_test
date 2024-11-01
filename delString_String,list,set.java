// 중복 문자 제거하기
/*
Java에서는 my_string[i]처럼 배열 형식으로 문자에 접근할 수 없음. 대신 my_string.charAt(i)를 사용해야함.
String은 객체이기 때문에 charAt(i)로 문자에 접근.
일반 배열(array): array[i]
ArrayList/List: list.get(i)
String: string.charAt(i)
Set: 순서가 없기 때문에 인덱스로 접근 불가
*/

class Solution {
    public String solution(String my_string) {
        String answer = "";
        int num=0;
        num=my_string.length();
        for(int i=0;i<num;i++){
            if(!answer.contains(String.valueOf(my_string.charAt(i)))) {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}
