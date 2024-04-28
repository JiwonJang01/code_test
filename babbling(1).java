class Solution {
    // 발음 가능한 단어
    String[] word = {"aya", "ye", "woo", "ma"};

    public int solution(String[] babbling) {
        int a = 0;

        if (babbling.length <= 100) {
            for (String s : babbling) {
                if (isValid(s, word)) {
                    a++;
                }
            }
        }
        return a;
    }

    // 주어진 문자열에서 발음 가능한 단어들의 조합과 일치하는지 확인하는 메서드
    private boolean isValid(String babbling, String[] word) {
        // 문자열을 순회하면서 발음 가능한 단어들의 조합과 일치하는지 확인
        int index = 0;
        while (index < babbling.length()) {
            boolean found = false;
            // babbling 배열의 각 요소를 word 배열과 비교하여 일치하는지 확인
            for (String w : word) {
                if (index + w.length() <= babbling.length() && babbling.startsWith(w, index)) {
                    found = true;
                    index += w.length(); // 다음 검색 위치 설정
                    break;
                }
            }
            if (!found) {
                return false; // 발음 가능한 단어의 조합과 일치하지 않음
            }
        }
        return true; // 발음 가능한 단어의 조합과 일치함
    }
}


/* class Solution {
    public int solution(String[] babbling) {
        int answer = 0;

        for(int i =0; i < babbling.length; i++) {
            babbling[i] = babbling[i].replace("aya", "1");
            babbling[i] = babbling[i].replace("woo", "1");
            babbling[i] = babbling[i].replace("ye", "1");
            babbling[i] = babbling[i].replace("ma", "1");
            babbling[i] = babbling[i].replace("1", "");
            if(babbling[i].isEmpty()) {
                answer = answer + 1;
            }
        }

        return answer;
    }
} */