import java.util.ArrayList;

class Solution {
    public int solution(String t, String p) {
        ArrayList<String> a = new ArrayList<>();
        ArrayList<String> b = new ArrayList<>();

        // 문자열 t에서 길이가 p와 같은 부분 문자열 추출하여 리스트 a에 추가
        for (int i = 0; i <= t.length() - p.length(); i++) {
            String sub = t.substring(i, i + p.length());
            a.add(sub);
        }

        // p보다 작거나 같은 수 찾아 리스트 b에 담기
        for (String numStr : a) {
            if (numStr.compareTo(p) <= 0) {
                b.add(numStr);
            }
        }

        // 리스트 b의 크기 출력
        System.out.println(b.size());

        return b.size();
    }
}



/*
// 다른 사람 코드
class Solution {
  public int solution(String t, String p) {
        int pLength = p.length();
        long pValue = Long.parseLong(p);
        int answer = 0;
        for (int i = 0; i <= t.length() - pLength; i++) {
            long tValue = Long.parseLong(t.substring(i, i + pLength));
            if (tValue <= pValue)
                answer++;
        }
        return answer;
    }
}*/