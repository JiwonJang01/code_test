/*
짝지어 제거하기
peek()은 스택의 맨 위에 있는 요소를 반환하는 데 제거하지는 않음
*/

import java.util.*;

class Solution
{
    public int solution(String s)
    {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char list = s.charAt(i);
            
            if (!stack.isEmpty() && stack.peek() == list) {
                stack.pop(); 
            } else {
                stack.push(list);
            }
        }
        if(stack.isEmpty()){
            return 1;
        }
        else
            return 0;
    }
}