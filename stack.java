import java.util.Stack;
/*
stack.isEmpty()는 결과값이 boolean으로 나오기 때문에
따로 변수를 지정하고 true/false를 반환할 필요가 없다.

--> 문제에 stack이라고 적혀 있어서 바로 stack으로 풀이를 했는데
	끝나고 다른 분들이 푼 풀이를 보니 count를 이용하신 분들도 계셨다.
	'('일 경우 증가, ')'경우 감소로 count가 0보다 작아지면 false,0이면 true로 지정하셨는데
	stack을 사용한 풀이보다 훨씬 깔끔하고 이해하기 쉬운 풀이였다.
*/

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        char[] input = s.toCharArray();
        
        for (char c : input) {
            // 스택이 비어있을 때
            if (stack.isEmpty()) {
                // '('가 들어 왔을 경우 추가
                if (c == '(') {
                    stack.push(c);
                } else {
                    return false;
                }
            } else {
                // '('가 들어왔을 경우 추가
                if (c == '(') {
                    stack.push(c);
                } else {
                    // ')'가 들어왔을 경우 스택의 최상단 값 확인
                    // 스택의 최상단 값이 '('라면 스택의 최상단 값 삭제
                    if (stack.peek() == '(') {
                        stack.pop();
                    } else {
                        // 스택의 최상단 값이 ')'라면 스택에 추가
                        stack.push(c);
                    }
                }
            }
        }
        
        // 스택이 비었을 경우 true, 스택에 내용이 있으면 false
        return stack.isEmpty();
    }
}
